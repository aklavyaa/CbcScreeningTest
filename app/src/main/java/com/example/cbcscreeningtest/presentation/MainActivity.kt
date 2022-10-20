package com.example.cbcscreeningtest.presentation

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cbcscreeningtest.data.NetworkResponse
import com.example.cbcscreeningtest.data.model.dashboard.requiredData.NewsDashboardModelItem
import com.example.cbcscreeningtest.data.networkConnection.InternetConnection
import com.example.cbcscreeningtest.databinding.ActivityMainBinding
import com.example.cbcscreeningtest.presentation.di.Injector
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private lateinit var adpater:NewsAdapter
    private val TAG:String = MainActivity::class.java.simpleName
    private lateinit var dashBoardViewModel: DashBoardViewModel
    private lateinit var binding:ActivityMainBinding
    private var arrayList = ArrayList<NewsDashboardModelItem>()
    private lateinit var internetConnection:InternetConnection
    @Inject
    lateinit var factory: DashboardViewModeFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        (application as Injector).createNewsSubComponent().inject(this) //SubComponent
        internetConnection = InternetConnection(this) //init Connectivity
        dashBoardViewModel = ViewModelProvider(this,factory).get(DashBoardViewModel::class.java)
        initAndSetUpdRecyclerView()

        //Pull to Refresh
        binding.swipe.setOnRefreshListener {
            dashBoardViewModel.updateNews().observe(this, Observer {
                setData(it)
                binding.swipe.isRefreshing = false
            })

        }

        // For InternetConnection
        internetConnection.observe(this, Observer { isNetworkAvailable->
            if (!isNetworkAvailable){
                Utils.showNetworkMessage(binding.root)
            }else {
                Utils.removeNetworkMessage()
            }
            Log.e(TAG, "onConnection: $isNetworkAvailable" )
        })
    }

    // setUp the  Adapter and fetched the news here
    private fun initAndSetUpdRecyclerView(){
        adpater = NewsAdapter()
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adpater
        getNews()
    }

    // data setup
    fun setData(it:NetworkResponse.NetworkResult<ArrayList<NewsDashboardModelItem>>){
        it.data?.let { it1 -> adpater.setNewsItemt(it1) }
        it.message?.let { it1 -> Toast.makeText(this@MainActivity, it1.toString(), Toast.LENGTH_SHORT).show() }
    }

    private fun getNews(){
        dashBoardViewModel.getNews().observe(this, Observer {
            setData(it)
        })
    }
}
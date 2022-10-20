package com.example.cbcscreeningtest.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.cbcscreeningtest.R
import com.example.cbcscreeningtest.data.model.dashboard.requiredData.NewsDashboardModelItem
import com.example.cbcscreeningtest.databinding.ContentPackageLayoutBinding
import com.example.cbcscreeningtest.databinding.StoryLayoutBinding


class NewsAdapter(): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

// For two layouts
    private val CONTENT_LAYOUT = 1;
    private val STORY_LAYOUT = 2;

// init list
    private var list  = ArrayList<NewsDashboardModelItem>()

// list setup
    fun setNewsItemt(list: ArrayList<NewsDashboardModelItem>){
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }

//    Showing the layout as per content
    override fun getItemViewType(position: Int): Int {
       if (list[position].type.equals("story", ignoreCase = true)) {
           return STORY_LAYOUT
       }else {
           return CONTENT_LAYOUT
       }

    }

//    setup layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
            if (viewType == CONTENT_LAYOUT){
                return  ContentPackageViewHolder(ContentPackageLayoutBinding.inflate(LayoutInflater.from(parent.context)));
            } else {
                return  StoryViewHolder(StoryLayoutBinding.inflate(LayoutInflater.from(parent.context)));
            }
    }

//    bind data with layout
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder.itemViewType){
            CONTENT_LAYOUT ->{
                (holder as ContentPackageViewHolder).bind(list[position])
            }
            STORY_LAYOUT->{
                (holder as StoryViewHolder).bind(list[position])
            }
        }
    }


    override fun getItemCount(): Int {
        return list.size
    }
}



class ContentPackageViewHolder(val binding:ContentPackageLayoutBinding): RecyclerView.ViewHolder(binding.root){

    fun bind(news: NewsDashboardModelItem){
        binding.title.text = news.title?:""
        binding.time.text = news.readableUpdatedAt
        binding.description.text = news.typeAttributes?.components?.mainContent?.description?:""
        Glide.with(binding.image.context).load(news.typeAttributes?.imageLarge).into(binding.image)
    }
}
class StoryViewHolder(val binding: StoryLayoutBinding): RecyclerView.ViewHolder(binding.root){

    fun bind(news: NewsDashboardModelItem){
        binding.title.text = news.title?:""
        binding.time.text = news.readableUpdatedAt
        Glide.with(binding.image.context).load(news.typeAttributes?.imageLarge).into(binding.image)
    }
}
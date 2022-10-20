package com.example.cbcscreeningtest.presentation

import android.view.View
import com.google.android.material.snackbar.Snackbar

class Utils {
    companion object{
         var snackbar:Snackbar?=null
        fun showNetworkMessage(view:View){
            snackbar = Snackbar.make(view, "No Internet Connection", Snackbar.LENGTH_INDEFINITE)
            snackbar!!.show()
        }

        fun removeNetworkMessage(){
            if (snackbar!=null)
            snackbar!!.dismiss()
        }
    }



}
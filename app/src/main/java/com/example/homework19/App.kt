package com.example.homework19

import android.app.Application


class App:Application() {

    override fun onCreate() {
        super.onCreate()
     key = apiKey()

    }

    companion object{

        lateinit var key:String

        init {
            System.loadLibrary("native-lib")
        }
    }

    external fun apiKey():String
}
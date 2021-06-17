package com.example.homework19.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitService {

    private const val Url = "https://identitytoolkit.googleapis.com/"

    fun RetrofitService() : Auth{

        return Retrofit.Builder().baseUrl(Url)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(Auth::class.java)
    }
}
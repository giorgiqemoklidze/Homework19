package com.example.homework19.api

import com.example.homework19.App
import com.example.homework19.Models.LogInResponse
import com.example.homework19.Models.RegisterResponse
import com.example.homework19.Models.User
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Query

interface Auth {

    @POST("/v1/accounts:signUp?")
    suspend fun registerUser (
       @Body user: User,
       @Query( "key")
       apiKey : String = App.key
    ): Response<RegisterResponse>


    @POST("v1/accounts:signInWithPassword?")
    suspend fun logIn (
        @Body user: User,
        @Query( "key")
        apiKey : String = App.key
    ): Response<LogInResponse>

}
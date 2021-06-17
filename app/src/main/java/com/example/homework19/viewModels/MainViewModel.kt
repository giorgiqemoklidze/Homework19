package com.example.homework19.viewModels

import android.util.Log.d
import androidx.lifecycle.ViewModel
import com.example.homework19.Models.User
import com.example.homework19.api.RetrofitService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {


    lateinit var  user:User

    fun register(){
        CoroutineScope(Dispatchers.IO).launch {
            var registerResponse = RetrofitService.RetrofitService().registerUser(user)

        }
    }


    fun logIn(){
        CoroutineScope(Dispatchers.IO).launch {
            var logInResponse = RetrofitService.RetrofitService().logIn(user)
        }
    }




}
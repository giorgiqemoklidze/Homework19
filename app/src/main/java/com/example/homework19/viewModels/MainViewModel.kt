package com.example.homework19.viewModels

import android.util.Log.d
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.homework19.Models.User
import com.example.homework19.api.RetrofitService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel : ViewModel() {




    fun register(email : String, password:String){
        viewModelScope.launch {
            withContext(Dispatchers.IO){
                var registerResponse = RetrofitService.RetrofitService().registerUser(User(email,password))
            }
        }

    }


    fun logIn(email : String, password:String){

        viewModelScope.launch {
            withContext(Dispatchers.IO){
                var logInResponse = RetrofitService.RetrofitService().logIn(User(email,password))
            }
        }

    }




}
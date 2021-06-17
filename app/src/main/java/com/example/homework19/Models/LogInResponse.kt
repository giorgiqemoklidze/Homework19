package com.example.homework19.Models

data class LogInResponse(val idToken : String?,
                         val email : String?,
                         val refreshToken : String?,
                         val expiresIn : String?,
                         val localId : String?,
                         val registered : Boolean
                         )

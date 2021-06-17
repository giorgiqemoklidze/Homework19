package com.example.homework19.Models

data class RegisterResponse(
    val idToken : String?,
    val email : String?,
    val refreshToken : String?,
    val expiresIn : String?,
    val localId : String?
)

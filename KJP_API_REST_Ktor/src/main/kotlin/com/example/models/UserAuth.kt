package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class UserAuth(
    val email: String,
    val password: String
)

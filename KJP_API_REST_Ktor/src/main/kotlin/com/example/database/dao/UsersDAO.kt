package com.example.database.dao

import com.example.models.User

interface UsersDAO {
    suspend fun insertUser(name:String, dni:String, phone:String, email:String, password:String, imgprofile:String): User?
    suspend fun getUsers(): List<User>
    suspend fun updateUsers(userid: Int, name:String, phone:String, email:String): Boolean

//suspend fun getUsersFromPetIdRequest(petId: Int): List<User>
}
package com.example.database

import com.example.models.Users
import kotlinx.coroutines.Dispatchers
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.experimental.newSuspendedTransaction
import org.jetbrains.exposed.sql.transactions.transaction

object DatabaseFactory {

    fun init() {
        val user = ""
        val password = ""
        val driverClassName = ""
        val jdbcURL = ""
        val database = Database.connect(jdbcURL, driverClassName, user, password)
        transaction(database) {
            SchemaUtils.create(Users)
        }
    }

    suspend fun <T> dbQuery(block: suspend () -> T): T {
        return newSuspendedTransaction(Dispatchers.IO) {
            block()
        }
    }
}
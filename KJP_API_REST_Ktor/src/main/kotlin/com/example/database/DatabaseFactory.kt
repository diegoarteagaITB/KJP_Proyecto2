package com.example.database

import com.example.models.Users
import kotlinx.coroutines.Dispatchers
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.experimental.newSuspendedTransaction
import org.jetbrains.exposed.sql.transactions.transaction

object DatabaseFactory {

    fun init() {
        val user = "avnadmin"
        val password = "AVNS_r9x866LM541U4Cit5EZ"
        val driverClassName = "org.h2.Driver"
        val jdbcURL = "jdbc:postgresql://pg-petlink-petlink.aivencloud.com:19023/defaultdb?ssl=require&user=avnadmin&password=AVNS_r9x866LM541U4Cit5EZ"
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
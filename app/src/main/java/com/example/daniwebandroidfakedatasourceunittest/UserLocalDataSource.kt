package com.example.daniwebandroidfakedatasourceunittest

interface UserLocalDataSource {
    fun getUserName(): String
    fun getUserBirthday(): String
    fun getUserAddress(): String
}
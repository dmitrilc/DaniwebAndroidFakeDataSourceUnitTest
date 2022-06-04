package com.example.daniwebandroidfakedatasourceunittest

class UserRepository(private val userLocalDataSource: UserLocalDataSource) {
    fun getUserData() = userLocalDataSource.getUserName()
    fun getUserBirthday() = userLocalDataSource.getUserBirthday()
    fun getUserAddress() = userLocalDataSource.getUserAddress()
}
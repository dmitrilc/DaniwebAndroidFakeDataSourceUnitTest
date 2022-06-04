package com.example.daniwebandroidfakedatasourceunittest

class UserLocalDataSourceImpl(
    private val dataBase: Any,
    private val httpClient: Any
): UserLocalDataSource {
    override fun getUserName() = "User Name"
    override fun getUserBirthday() = "User Birthday"
    override fun getUserAddress() = "User Address"
}
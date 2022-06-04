package com.example.daniwebandroidfakedatasourceunittest

class FakeUserLocalDataSource: UserLocalDataSource {
    override fun getUserName() = "User Name"
    override fun getUserBirthday() = "Birthday"
    override fun getUserAddress() = "Address"
}
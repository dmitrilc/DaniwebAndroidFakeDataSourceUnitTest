package com.example.daniwebandroidfakedatasourceunittest

import org.junit.Test

class UserRepositoryUnitTests {

    private val repo = UserRepository(FakeUserLocalDataSource())

    @Test
    fun getUserData_isCorrect(){
        repo.getUserData()
    }

    @Test
    fun getUserBirthday_isCorrect(){
        repo.getUserBirthday()
    }

    @Test
    fun getUserAddress_isCorrect(){
        repo.getUserAddress()
    }
}
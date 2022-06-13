package com.example.agifyapp.data.repo

import com.example.agifyapp.data.api.RetrofitController
import com.example.agifyapp.data.model.NameAge

class ApiRepo()
{
    suspend fun getNameAge(userName: String): NameAge{
        return RetrofitController.api.getNameAge(userName)
    }
}
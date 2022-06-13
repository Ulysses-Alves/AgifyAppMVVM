package com.example.agifyapp.data.api

import com.example.agifyapp.data.model.NameAge
import com.example.agifyapp.utils.Constants.BASE_URL
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface AgifyApi {

    @GET("?")
    suspend fun getNameAge(@Query("name") userName: String): NameAge
}
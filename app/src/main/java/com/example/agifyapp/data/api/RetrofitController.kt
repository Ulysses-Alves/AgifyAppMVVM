package com.example.agifyapp.data.api

import com.example.agifyapp.utils.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitController
{
    val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: AgifyApi by lazy { retrofit.create(AgifyApi::class.java)}
}
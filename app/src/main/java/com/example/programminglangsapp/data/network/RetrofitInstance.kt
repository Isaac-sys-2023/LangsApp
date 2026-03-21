package com.example.programminglangsapp.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance{
    private const val BASE_URL = "https://languages-api-8ght.onrender.com/api/v1"

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val api: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}

package com.example.programminglangsapp.data.network

import com.example.programminglangsapp.data.network.model.Language
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService{
    @GET("languages")
    suspend fun obtenerLanguages(): List<Language>

    @GET("languages/{id}")
    suspend fun obtenerLanguagePorID(@Path("id")id:Int): Language
}
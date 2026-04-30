package com.sara.retrofit.myRetrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private const val BASE_URL="https://jsonplaceholder.typicode.com/"
    private fun instance(): Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    fun getApi(): ApiGet{
        return instance().create(ApiGet::class.java)
    }
}
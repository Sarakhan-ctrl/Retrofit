package com.sara.retrofit.myRetrofit

import com.sara.retrofit.PostDataClass
import retrofit2.http.GET

interface ApiGet {
    @GET("posts")
    suspend fun getPosts(): List<PostDataClass>
}
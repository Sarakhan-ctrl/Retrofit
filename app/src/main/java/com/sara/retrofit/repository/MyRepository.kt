package com.sara.retrofit.repository

import com.sara.retrofit.PostDataClass
import com.sara.retrofit.myRetrofit.ApiGet
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.withContext

class MyRepository(private val api: ApiGet) {
    private val _data = MutableStateFlow<List<PostDataClass>>(emptyList())
    val categories: StateFlow<List<PostDataClass>>get() = _data

    suspend fun getCategories() {
        withContext(Dispatchers.IO) {
            try {
                val response = api.getPosts()
                _data.emit(response)
            }catch (e: Exception){
                e.printStackTrace()
            }
        }
    }
}
package com.sara.retrofit.myViewModel

import android.view.View
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sara.retrofit.PostDataClass
import com.sara.retrofit.repository.MyRepository
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MyViewModel(repository: MyRepository): ViewModel() {
    val details: StateFlow<List<PostDataClass>> = repository.categories

    init {
        viewModelScope.launch {
            repository.getCategories()
        }
    }
}
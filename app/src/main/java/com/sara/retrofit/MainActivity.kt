package com.sara.retrofit

import ListScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.sara.retrofit.ui.theme.RetrofitTheme
import com.sara.retrofit.myRetrofit.RetrofitInstance
import com.sara.retrofit.myViewModel.MyViewModel
import com.sara.retrofit.repository.MyRepository


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RetrofitTheme {
                val repository = MyRepository(RetrofitInstance.api)
                val viewmodel = MyViewModel(repository)

                ListScreen(viewModel = viewmodel)
            }
        }
    }
}




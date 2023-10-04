package com.example.flowdemo2

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow

class MyViewModel : ViewModel() {
    val myFlow = flow {
        for (i in 1..100){
            emit(i)
            delay(1000L)
        }
    }
}
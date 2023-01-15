package com.example.koin

import androidx.lifecycle.ViewModel
import com.example.koin.ui.theme.MainRepository

class MainViewModel(
    private val repository: MainRepository
): ViewModel() {

    fun doNetworkCall() {
        println("Something")
    }
}
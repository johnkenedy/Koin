package com.example.koin

import com.example.koin.ui.theme.MainRepository

class MainRepositoryImpl(
    private val api: MyApi
): MainRepository {

    override fun doNetworkCall() {
        api.callApi()
    }
}
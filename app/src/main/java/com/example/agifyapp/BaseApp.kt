package com.example.agifyapp

import android.app.Application
import com.example.agifyapp.data.di.factoryModule
import com.example.agifyapp.data.repo.ApiRepo
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BaseApp: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@BaseApp)
            modules(factoryModule)
        }
    }
}
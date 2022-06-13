package com.example.agifyapp.data.di

import com.example.agifyapp.data.repo.ApiRepo
import com.example.agifyapp.ui.viewmodels.MainModelFactory
import org.koin.dsl.module

val factoryModule = module {
    single{ApiRepo()}
    single{MainModelFactory()}
}

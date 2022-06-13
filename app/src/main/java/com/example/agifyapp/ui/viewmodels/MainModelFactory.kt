package com.example.agifyapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.agifyapp.data.repo.ApiRepo
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class MainModelFactory: ViewModelProvider.Factory, KoinComponent {
    private val repo: ApiRepo by inject()

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repo) as T
    }
}
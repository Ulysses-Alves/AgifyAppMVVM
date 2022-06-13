package com.example.agifyapp.ui.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.agifyapp.data.model.NameAge
import com.example.agifyapp.data.repo.ApiRepo
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent

class MainViewModel(private val repo: ApiRepo): ViewModel()
{

    val myResponse: MutableLiveData<NameAge> = MutableLiveData()

    fun getNameAge(userName: String)
    {
        viewModelScope.launch {
            val response = repo.getNameAge(userName)
            myResponse.value = response
        }
    }

}
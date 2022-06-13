package com.example.agifyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.agifyapp.data.api.RetrofitController
import com.example.agifyapp.data.repo.ApiRepo
import com.example.agifyapp.databinding.ActivityMainBinding
import com.example.agifyapp.ui.viewmodels.MainModelFactory
import com.example.agifyapp.ui.viewmodels.MainViewModel

import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.component.KoinComponent

class MainActivity : AppCompatActivity(), KoinComponent {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val factory: MainModelFactory by inject()
        viewModel = ViewModelProvider(this, factory)[MainViewModel::class.java]

        binding.btnAgifyName.setOnClickListener {
            viewModel.getNameAge(binding.etName.text.toString())
        }

        viewModel.myResponse.observe(this, Observer{ response ->
            binding.tvAge.text = response.age.toString() + " Years"
            binding.tvCount.text = response.count.toString() + " Entries"
        })

    }
}
package com.example.wayfinder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wayfinder.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegister.setOnClickListener {
            // Handle register button click here
        }

        binding.tvLogin.setOnClickListener {
            onBackPressed()
        }
    }
}
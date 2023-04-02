package com.example.lev_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lev_project.databinding.ActivitySplashBinding
import kotlinx.coroutines.*

class Splash_activity : AppCompatActivity() {
    lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        CoroutineScope(Dispatchers.Main).launch {
            delay(2000)
            finish()
            startActivity(Intent(this@Splash_activity,MainActivity::class.java))
        }
    }
}
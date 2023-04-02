package com.example.lev_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SozdanieActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sozdanie)
    }
    fun  onClickdalee(view: View){
        val intent = Intent(this,sozdanie_0_5::class.java)
        startActivity(intent)
    }
}
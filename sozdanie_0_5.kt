package com.example.lev_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class sozdanie_0_5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sozdanie05)
    }
    fun  onClickdalee(view: View){
        val intent = Intent(this,sozdanie1::class.java)
        startActivity(intent)
    }
}
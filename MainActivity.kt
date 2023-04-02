package com.example.lev_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun  onClicksoz(view:View){
        val intent = Intent(this,SozdanieActivity::class.java)
        startActivity(intent)
    }
    fun  onClicksvxod(view:View){
        val intent = Intent(this,vxod1::class.java)
        startActivity(intent)
    }
}
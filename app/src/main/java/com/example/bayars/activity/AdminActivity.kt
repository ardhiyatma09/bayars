package com.example.bayars.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.RelativeLayout
import com.example.bayars.R

class AdminActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_admin)
        val regisTxt = findViewById<View>(R.id.btn_inputsiswa) as RelativeLayout


        regisTxt.setOnClickListener {
            startActivity(Intent(this, InputSiswaAct::class.java))
        }
    }

}
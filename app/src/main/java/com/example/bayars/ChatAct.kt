package com.example.bayars

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity

class ChatAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.chat)
    }

}
package com.example.bayars.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.RelativeLayout
import com.bumptech.glide.Glide
import com.example.bayars.R
import com.example.bayars.helper.PrefsHelper
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_admin.view.*

class AdminActivity : AppCompatActivity() {

    lateinit var fAuth: FirebaseAuth
    lateinit var helperPrefs: PrefsHelper
    lateinit var view: View

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_admin)

        val regisTxt = findViewById<View>(R.id.btn_inputsiswa) as RelativeLayout
        helperPrefs = PrefsHelper(this)

        Glide.with(view.context)
            .load(R.drawable.avatar)
            .into(view.img_upload)
        //setting toolbar
        setSupportActionBar(findViewById(R.id.toolbar))
        //home navigation
        setSupportActionBar(toolbar)
        toolbar.title = ""
        toolbar.setLogo(R.mipmap.ic_logo)

        regisTxt.setOnClickListener {
            startActivity(Intent(this, InputSiswaAct::class.java))
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_actionbar, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_chat -> {
            startActivity(Intent(this, ChatAct::class.java))
            true
        }
        R.id.action_logout -> {
            SignOut()
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
            true
        }
        else -> {
            super.onOptionsItemSelected(item)
        }
    }

    fun SignOut() {
        fAuth.signOut()
    }
}
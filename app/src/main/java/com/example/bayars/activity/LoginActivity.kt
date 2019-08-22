package com.example.bayars.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.bayars.R
import com.example.bayars.helper.PrefsHelper
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class LoginActivity : AppCompatActivity() {

    val mAuth = FirebaseAuth.getInstance()
    lateinit var helperPrefs: PrefsHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        helperPrefs = PrefsHelper(this)
        val loginBtn = findViewById<View>(R.id.btn_login) as Button

        loginBtn.setOnClickListener(View.OnClickListener { view ->
            login()
        })
    }

    private fun login() {
        val emailTxt = findViewById<View>(R.id.emailTxt) as EditText
        var email = emailTxt.text.toString()
        val passwordTxt = findViewById<View>(R.id.passwordTxt) as EditText
        var password = passwordTxt.text.toString()

        if (!email.isEmpty() && !password.isEmpty()) {
            this.mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, OnCompleteListener<AuthResult> { task ->
                    if (task.isSuccessful) {
                        startActivity(Intent(this, MainActivity::class.java))
                        Toast.makeText(this, "Halo !", Toast.LENGTH_LONG).show()
                    } else {
                        Toast.makeText(this, "Password/Email salah", Toast.LENGTH_SHORT).show()
                    }
                })

        } else {
            Toast.makeText(this, "Please fill up the Credentials :|", Toast.LENGTH_SHORT).show()
        }
    }

    private fun updateUI(user: FirebaseUser?) {
        if (user != null) {
            helperPrefs.saveUID(user.uid) //berfungsi untuk save uid ke sharedpreferences
            helperPrefs.saveStatus("User")
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        } else {
            Log.e("TAG_ERROR", "user tidak ada")
        }
    }


    override fun onStart() {
        super.onStart()
        val user = mAuth.currentUser
        if (user != null) {
            updateUI(user)
        }
    }
}
package com.example.bayars.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Toast
import com.example.bayars.R
import kotlinx.android.synthetic.main.splash_activity.*

class SplashActivity : AppCompatActivity() {

    lateinit var blip: Animation

    private var mDelayHandler: Handler? = null
    private val SPLASH_DELAY: Long = 4000 //4 seconds
    internal val mRunnable: Runnable = Runnable {


        if (!isFinishing) {
            val intent = Intent(applicationContext, LoginActivity::class.java)

            startActivity(intent)

            finish()
            Toast.makeText(this, "Haii! Selamat Datang !", Toast.LENGTH_SHORT).show()
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)

        blip = AnimationUtils.loadAnimation(this, R.anim.transition_splash)

        logo.startAnimation(blip)
        text.startAnimation(blip)
        text2.startAnimation(blip)

        mDelayHandler = Handler()

        //Navigate with delay

        mDelayHandler!!.postDelayed(mRunnable, SPLASH_DELAY)

    }

    public override fun onDestroy() {

        if (mDelayHandler != null) {

            mDelayHandler!!.removeCallbacks(mRunnable)

        }

        super.onDestroy()

    }
}
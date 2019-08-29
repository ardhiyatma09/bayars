package com.example.bayars.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.bayars.R
import kotlinx.android.synthetic.main.activity_main.toolbar
import kotlinx.android.synthetic.main.layout_semester.*

class Semester : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_semester)

        //setting toolbar
        setSupportActionBar(findViewById(R.id.toolbar))
        //home navigation
        setSupportActionBar(toolbar)
        toolbar.title = ""
        toolbar.setLogo(R.mipmap.ic_logo)

        januari.setOnClickListener {
            val mIntent = Intent(this@Semester, BayarActivity::class.java)
            mIntent.putExtra("bulan", "Januari")
            mIntent.putExtra("tahun", intent.getStringExtra("tahun"))
            startActivity(mIntent)
        }
        februari.setOnClickListener {
            val mIntent = Intent(this@Semester, BayarActivity::class.java)
            mIntent.putExtra("bulan", "Februari")
            mIntent.putExtra("tahun", intent.getStringExtra("tahun"))
            startActivity(mIntent)
        }
        maret.setOnClickListener {
            val mIntent = Intent(this@Semester, BayarActivity::class.java)
            mIntent.putExtra("bulan", "Maret")
            mIntent.putExtra("tahun", intent.getStringExtra("tahun"))
            startActivity(mIntent)
        }
        april.setOnClickListener {
            val mIntent = Intent(this@Semester, BayarActivity::class.java)
            mIntent.putExtra("bulan", "April")
            mIntent.putExtra("tahun", intent.getStringExtra("tahun"))
            startActivity(mIntent)
        }
        mei.setOnClickListener {
            val mIntent = Intent(this@Semester, BayarActivity::class.java)
            mIntent.putExtra("bulan", "Mei")
            mIntent.putExtra("tahun", intent.getStringExtra("tahun"))
            startActivity(mIntent)
        }
        juni.setOnClickListener {
            val mIntent = Intent(this@Semester, BayarActivity::class.java)
            mIntent.putExtra("bulan", "Juni")
            mIntent.putExtra("tahun", intent.getStringExtra("tahun"))
            startActivity(mIntent)
        }
        juli.setOnClickListener {
            val mIntent = Intent(this@Semester, BayarActivity::class.java)
            mIntent.putExtra("bulan", "Juli")
            mIntent.putExtra("tahun", intent.getStringExtra("tahun"))
            startActivity(mIntent)
        }
        agustus.setOnClickListener {
            val mIntent = Intent(this@Semester, BayarActivity::class.java)
            mIntent.putExtra("bulan", "Agustus")
            mIntent.putExtra("tahun", intent.getStringExtra("tahun"))
            startActivity(mIntent)
        }
        september.setOnClickListener {
            val mIntent = Intent(this@Semester, BayarActivity::class.java)
            mIntent.putExtra("bulan", "September")
            mIntent.putExtra("tahun", intent.getStringExtra("tahun"))
            startActivity(mIntent)
        }
        oktober.setOnClickListener {
            val mIntent = Intent(this@Semester, BayarActivity::class.java)
            mIntent.putExtra("bulan", "Oktober")
            mIntent.putExtra("tahun", intent.getStringExtra("tahun"))
            startActivity(mIntent)
        }
        november.setOnClickListener {
            val mIntent = Intent(this@Semester, BayarActivity::class.java)
            mIntent.putExtra("bulan", "November")
            mIntent.putExtra("tahun", intent.getStringExtra("tahun"))
            startActivity(mIntent)
        }
        desember.setOnClickListener {
            val mIntent = Intent(this@Semester, BayarActivity::class.java)
            mIntent.putExtra("bulan", "Desember")
            mIntent.putExtra("tahun", intent.getStringExtra("tahun"))
            startActivity(mIntent)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_actionbar, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_chat -> {
            Toast.makeText(this, "Bisa", Toast.LENGTH_SHORT).show()
            true
        }
        R.id.action_logout -> {
            Toast.makeText(this, "Bisa", Toast.LENGTH_SHORT).show()
            true
        }

        else -> {
            super.onOptionsItemSelected(item)
        }
    }
}
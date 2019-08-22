package com.example.bayars.Fragment

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bayars.R
import com.example.bayars.activity.Lainnya
import com.example.bayars.activity.Semester
import kotlinx.android.synthetic.main.fr_keuangan.*

class fr_keuangan : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fr_keuangan, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        semester12.setOnClickListener {
            startActivity(Intent(activity!!, Semester::class.java))
        }
        lain.setOnClickListener {
            startActivity(Intent(activity!!, Lainnya::class.java))
        }
    }
}
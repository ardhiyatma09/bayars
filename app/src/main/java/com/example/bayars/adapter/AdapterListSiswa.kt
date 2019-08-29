package com.example.bayars.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.example.bayars.R
import com.example.bayars.model.Siswa

class AdapterListSiswa(val mCtx: Context, val layoutResId: Int, val list: List<Siswa> )
    : ArrayAdapter<Siswa>(mCtx,layoutResId,list){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(mCtx)
        val view: View = layoutInflater.inflate(layoutResId,null)

        val textNama = view.findViewById<TextView>(R.id.txtNama)
        val textTunggakan = view.findViewById<TextView>(R.id. txtTunggakan)
        val foto = view.findViewById<ImageView>(R.id. foto)


        val user = list[position]

        textNama.text = user.Nama
        textTunggakan.text = user.Tunggakan
        return view

    }
}
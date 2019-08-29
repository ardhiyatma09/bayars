package com.example.bayars.activity


import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ListView
import com.example.bayars.R
import com.example.bayars.adapter.AdapterListSiswa
import com.example.bayars.model.Siswa
import com.google.firebase.database.*

class ListSiswaAct : AppCompatActivity(){

    lateinit var ref : DatabaseReference
    lateinit var list : MutableList<Siswa>
    lateinit var listView : ListView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_siswa)

        ref = FirebaseDatabase.getInstance().getReference("Akun")
        list = mutableListOf()
        listView = findViewById(R.id.listview)


        ref.addValueEventListener(object : ValueEventListener {
            override fun onCancelled(p0: DatabaseError) {

            }

            override fun onDataChange(p0: DataSnapshot) {
                if (p0.exists()){

                    for (h in p0.children){
                        val user = h.getValue(Siswa::class.java)
                        list.add(user!!)
                    }
                    val adapter = AdapterListSiswa(applicationContext,R.layout.siswa,list)
                    listView.adapter = adapter
                }
            }
        })
    }
}
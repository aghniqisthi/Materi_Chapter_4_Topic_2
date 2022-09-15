package com.example.chapter4topic2.databindingrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chapter4topic2.R
import com.example.chapter4topic2.databinding.ActivityDosenBinding
import com.example.chapter4topic2.databinding.ActivityMhsBinding

class DosenActivity : AppCompatActivity() {

    lateinit var binding: ActivityDosenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dosen)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_dosen)

        var listDosen = arrayListOf(
            Dosen("Cahyo", "001", R.drawable.berita_twt),
            Dosen("Prisa", "002", R.drawable.ic_launcher_foreground)
        )
        binding.rvDosen.adapter = DosenAdapter(listDosen)
        binding.rvDosen.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}
package com.example.chapter4topic2.simpledatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.chapter4topic2.R
import com.example.chapter4topic2.databinding.ActivityMhsBinding

class MhsActivity : AppCompatActivity() {
    lateinit var binding: ActivityMhsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mhs)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_mhs)

        binding.txtFirstName.text = "Aghni"
        binding.txtLastName.text = "Qisthi"

        binding.mhsdata = Mhs("Hong", "Jisoo")
    }
}
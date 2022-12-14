package com.example.chapter4topic2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.chapter4topic2.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {

    lateinit var binding : FragmentBlankBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        //return inflater.inflate(R.layout.fragment_blank, container, false)
        binding = FragmentBlankBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.txtFragment.text = "Halo Fragment"
    }

}
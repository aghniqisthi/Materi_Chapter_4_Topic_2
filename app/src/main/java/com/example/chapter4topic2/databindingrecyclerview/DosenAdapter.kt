package com.example.chapter4topic2.databindingrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.chapter4topic2.databinding.ItemDosenBinding

class DosenAdapter(var listDosen:ArrayList<Dosen>) : RecyclerView.Adapter<DosenAdapter.ViewHolder>() {
    class ViewHolder(val binding: ItemDosenBinding):RecyclerView.ViewHolder(binding.root) {
        fun databind(itemData:Dosen){
            binding.dosen = itemData
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DosenAdapter.ViewHolder {
        var view = ItemDosenBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: DosenAdapter.ViewHolder, position: Int) {
        holder.databind(listDosen[position])
    }

    override fun getItemCount(): Int {
        return listDosen.size
    }
}
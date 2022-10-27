package com.example.parquesrecyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.parquesrecyclerview.Parque
import com.example.parquesrecyclerview.ParqueProvider.Companion.listaParque
import com.example.parquesrecyclerview.R

class ParquesAdapter(private val listaParque:List<Parque>) : RecyclerView.Adapter<ParqueViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParqueViewHolder {
        val LayoutInflater = LayoutInflater.from(parent.context)
        return ParqueViewHolder(LayoutInflater.inflate(R.layout.item_parque,parent,false))
    }

    override fun onBindViewHolder(holder: ParqueViewHolder, position: Int) {
        val item = listaParque[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return listaParque.size
    }
}
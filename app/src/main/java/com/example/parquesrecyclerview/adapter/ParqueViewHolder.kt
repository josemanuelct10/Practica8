package com.example.parquesrecyclerview.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.parquesrecyclerview.Parque
import com.example.parquesrecyclerview.databinding.ItemParqueBinding

class ParqueViewHolder (view : View):RecyclerView.ViewHolder(view) {
    val binding = ItemParqueBinding.bind(view)

    fun render(parqueModel : Parque){
        binding.nombreParque.text = parqueModel.nombreParque
        binding.descripcionParque.text = parqueModel.descripcion
        Glide.with(binding.fotoParque.context).load(parqueModel.fotoParque).into(binding.fotoParque)
        itemView.setOnClickListener{Toast.makeText(binding.fotoParque.context, parqueModel.nombreParque,Toast.LENGTH_LONG).show()}
    }
}
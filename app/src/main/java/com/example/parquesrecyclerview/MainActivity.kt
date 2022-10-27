package com.example.parquesrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.parquesrecyclerview.adapter.ParquesAdapter
import com.example.parquesrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val decoration = DividerItemDecoration(this, LinearLayoutManager.VERTICAL)
        val manager = LinearLayoutManager(this)

        binding.recycler.layoutManager = manager
        binding.recycler.adapter = ParquesAdapter(ParqueProvider.listaParque)
        binding.recycler.addItemDecoration(decoration)
    }
}
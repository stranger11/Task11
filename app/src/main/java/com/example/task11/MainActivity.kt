package com.example.task11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.task11.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CellClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecView()
    }

    private fun fetchList(): ArrayList<String> {
        val list = arrayListOf<String>()
        list.add("Anton")
        list.add("Sergei")
        list.add("Andrey")
        list.add("Arkadiy")
        list.add("Alexei")
        list.add("Michail")
        list.add("Maxim")
        list.add("Mikita")
        list.add("Simon")
        list.add("Yan")
        list.add("Kirill")
        return list
    }

    private fun initRecView() {
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = MyAdapter(this, fetchList(), this)
    }

    override fun onCellClickListener(data: String) {
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show()
    }
}
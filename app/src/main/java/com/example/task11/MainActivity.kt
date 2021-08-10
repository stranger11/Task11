package com.example.task11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.task11.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun fetchList(): List<String> {
        val list = listOf("Anton",
                "Sergei",
                "Andrey",
                "Arkadiy",
                "Alexei",
                "Michail",
                "Maxim",
                "Mikita"  )
        return list
    }

    private fun initRecyclerView() {
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = MyAdapter(list = fetchList()) {
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        }
    }
}
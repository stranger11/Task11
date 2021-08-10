package com.example.task11

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val list: List<String>,
                private val onClick: (String) -> Unit,
                //private val cellClickListener: CellClickListener
) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
                R.layout.custom_layout,
                parent,
                false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = list[position]
        holder.bind(data, onClick)
    }
}

class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
    private val titleTV: TextView = view.findViewById(R.id.textView)

    fun bind(data: String, onClick: (String) -> Unit) {
        titleTV.text = data
        titleTV.setOnClickListener {
            onClick(data)
        }
    }
}
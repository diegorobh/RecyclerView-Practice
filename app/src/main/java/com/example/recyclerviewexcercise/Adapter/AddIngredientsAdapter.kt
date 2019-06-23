package com.example.recyclerviewexcercise.Adapter

import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexcercise.Adapter.AddIngredientsAdapter.*
import com.example.recyclerviewexcercise.R
import com.example.recyclerviewexcercise.ViewGroupExtensions.inflate
import kotlinx.android.synthetic.main.activity_main.view.*
import org.json.JSONArray

class AddIngredientsAdapter(val ingredients: ArrayList<String>): RecyclerView.Adapter<AddIngredientsAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(parent.inflate(R.layout.header_cell))
    }

    override fun getItemCount() = ingredients.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    class ViewHolder(v: View): RecyclerView.ViewHolder(v){

    }


}
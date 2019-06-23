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
import kotlinx.android.synthetic.main.header_cell.view.*
import org.json.JSONArray

class AddIngredientsAdapter(val ingredients: ArrayList<String>): RecyclerView.Adapter<AddIngredientsAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(parent.inflate(R.layout.header_cell))
    }

    override fun getItemCount() = ingredients.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(ingredients[position])
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        lateinit var ingredient: String

        fun bind(ingredient:String){
            this.ingredient = ingredient
            itemView.header_cell_text_tfd.text = ingredient
        }

    }


}
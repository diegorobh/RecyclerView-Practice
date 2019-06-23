package com.example.recyclerviewexcercise.Adapter

import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexcercise.Adapter.AddIngredientsAdapter.*
import com.example.recyclerviewexcercise.Model.CompositeItem
import com.example.recyclerviewexcercise.R
import com.example.recyclerviewexcercise.ViewGroupExtensions.inflate
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.header_cell.view.*
import kotlinx.android.synthetic.main.ingredient_cell.view.*
import org.json.JSONArray
import java.lang.IllegalArgumentException

class AddIngredientsAdapter(val ingredients: ArrayList<CompositeItem>): RecyclerView.Adapter<AddIngredientsAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return when(viewType){
            ViewType.HEADER.ordinal -> ViewHolder(parent.inflate(R.layout.header_cell))
            ViewType.INGREDIENT.ordinal -> ViewHolder(parent.inflate(R.layout.ingredient_cell))
            else -> throw IllegalArgumentException()
        }
    }

    override fun getItemCount() = ingredients.size

    override fun getItemViewType(position: Int): Int {
        return if (ingredients[position].isHeader) {
            ViewType.HEADER.ordinal
        } else {
            ViewType.INGREDIENT.ordinal
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(ingredients[position])
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener {

        lateinit var ingredient: String

        init {
            itemView.setOnClickListener(this)
        }

        fun bind(ingredient:CompositeItem){
            if (ingredient.isHeader){
                itemView.header_cell_text_tfd.text = ingredient.header
            } else {
                this.ingredient = ingredient.ingredient
                itemView.ingredient_cell_text.text = ingredient.ingredient
            }
        }

        override fun onClick(view: View) {
            Log.d("clicked: ", ingredient)
        }

    }

//for sections
    enum class ViewType {
        HEADER, INGREDIENT
    }

}
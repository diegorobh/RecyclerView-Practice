package com.example.recyclerviewexcercise


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewexcercise.Adapter.AddIngredientsAdapter
import kotlinx.android.synthetic.main.fragment_basic_recycler_view.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class basicRecyclerView : Fragment() {

    var ingredients = arrayListOf<String>("uno","dos","tres")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_basic_recycler_view, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        basic_recycler_list_rv.layoutManager = LinearLayoutManager(activity)
        basic_recycler_list_rv.adapter = AddIngredientsAdapter(ingredients)

    }



}

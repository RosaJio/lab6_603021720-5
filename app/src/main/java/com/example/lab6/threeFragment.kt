package com.example.lab6


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_three.view.*

/**
 * A simple [Fragment] subclass.
 */
class threeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =inflater.inflate(R.layout.fragment_three,container,false)
        view.btnClickFragThree.setOnClickListener(){
            val toast = Toast.makeText(context,"click on fragment three", Toast.LENGTH_SHORT)
            toast.show()
        }

        // Inflate the layout for this fragment
        return view
    }


}

package com.example.muslimroad.ui.e_code

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.muslimroad.adapter.E_Code_Adapter
import com.example.muslimroad.databinding.FragmentECodeBinding
import com.example.muslimroad.model.ProductModel


class E_Code_Fragment : Fragment() {

private lateinit var binding: FragmentECodeBinding
private lateinit var adapter:E_Code_Adapter
private lateinit var list: List<ProductModel>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentECodeBinding.inflate(layoutInflater)
        initRecycler()
        return binding.root
    }

    private fun initRecycler() {
        binding.recyclerView.layoutManager=LinearLayoutManager(context)
        list=ArrayList<ProductModel>()
        list.apply {
            
        }
        adapter=E_Code_Adapter(list)
        binding.recyclerView.adapter=adapter

    }


}
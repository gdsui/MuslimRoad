package com.example.muslimroad.adapter

import android.view.LayoutInflater.*
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.muslimroad.databinding.ListProductBinding
import com.example.muslimroad.model.ProductModel

class E_Code_Adapter(private val list: List<ProductModel>) :
    RecyclerView.Adapter<E_Code_Adapter.E_Code_ViewHolder>() {
    private lateinit var binding: ListProductBinding

    class E_Code_ViewHolder(private val binding: ListProductBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(productModel: ProductModel) {
            binding.tvProductName.text = productModel.productName
            binding.productTitle.text = productModel.productTitle
            binding.eCodeHaram.text = productModel.haram
            binding.tvECodeKumon.text = productModel.kumon
            binding.productHalal.text=productModel.halal
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): E_Code_ViewHolder {
        binding = ListProductBinding.inflate(from(parent.context), parent, false)
        return E_Code_ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: E_Code_ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
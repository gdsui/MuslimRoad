package com.example.muslimroad.ui.halalMain

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.muslimroad.R
import com.example.muslimroad.databinding.FragmentMainBinding


class MainFragment : Fragment() {
private lateinit var mainBinding: FragmentMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mainBinding= FragmentMainBinding.inflate(layoutInflater)
        val navController=Navigation.findNavController(requireActivity(),R.id.fragmentContainerView)
        mainBinding.cardECode.setOnClickListener {
            navController.navigate(R.id.action_mainFragment_to_e_Code_Fragment)
        }
        return mainBinding.root
    }


}
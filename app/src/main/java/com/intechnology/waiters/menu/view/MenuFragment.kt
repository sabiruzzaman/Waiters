package com.intechnology.waiters.menu.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.intechnology.waiters.R
import com.intechnology.waiters.databinding.FragmentMenuBinding
import com.intechnology.waiters.menu.adapter.MenuAdapter

class MenuFragment : Fragment(){
    lateinit var binding: FragmentMenuBinding
    lateinit var adapter: MenuAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentMenuBinding.inflate(layoutInflater)
        binding.root.setOnClickListener() {
            return@setOnClickListener
        }
        viewInit()
        return binding.root
    }

    private fun viewInit() {
        adapter = MenuAdapter( requireContext())
        binding.menuRvId.layoutManager = LinearLayoutManager(context)
        binding.menuRvId.adapter = adapter

    }

}
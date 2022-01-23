package com.intechnology.waiters

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.intechnology.waiters.databinding.FragmentMenuCategoryListBinding
import com.intechnology.waiters.menu.adapter.MenuAdapter


class MenuCategoryListFragment : Fragment() {
    lateinit var binding: FragmentMenuCategoryListBinding
    lateinit var adapter: MenuCategoryAdapter
    lateinit var layoutManager: LinearLayoutManager
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMenuCategoryListBinding.inflate(layoutInflater)

        binding.root.setOnClickListener() {
            return@setOnClickListener
        }

        viewInit()
        return binding.root
    }

    private fun viewInit() {

        adapter = MenuCategoryAdapter(requireContext())
        layoutManager = LinearLayoutManager(requireContext())

        binding.menuCategoryListRvId.layoutManager =layoutManager
        binding.menuCategoryListRvId.adapter = adapter
    }


}
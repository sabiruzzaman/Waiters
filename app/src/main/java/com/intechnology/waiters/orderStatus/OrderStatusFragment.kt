package com.intechnology.waiters.orderStatus

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.intechnology.waiters.databinding.FragmentOrderStatusBinding
import com.intechnology.waiters.orderStatus.adapter.OrderStatusAdapter

class OrderStatusFragment : Fragment() {

    private lateinit var binding: FragmentOrderStatusBinding
    private lateinit var adapter:OrderStatusAdapter
    private lateinit var layoutManager: LinearLayoutManager
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentOrderStatusBinding.inflate(layoutInflater)
        binding.root.setOnClickListener(){
            return@setOnClickListener
        }

        viewInit()
        return binding.root
    }

    private fun viewInit() {
        adapter = OrderStatusAdapter(requireContext())
        layoutManager = LinearLayoutManager(requireContext())

        binding.orderStatusRvId.layoutManager = layoutManager
        binding.orderStatusRvId.adapter=adapter

    }

}
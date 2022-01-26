package com.intechnology.waiters.more

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.intechnology.waiters.R
import com.intechnology.waiters.databinding.FragmentMoreBinding

class MoreFragment : Fragment() {
    private lateinit var binding: FragmentMoreBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMoreBinding.inflate(layoutInflater)
        binding.root.setOnClickListener() {
            return@setOnClickListener
        }

        viewInit()
        return binding.root
    }

    private fun viewInit() {

    }

}
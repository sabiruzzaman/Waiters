package com.intechnology.waiters.more

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.intechnology.waiters.LogInActivity
import com.intechnology.waiters.databinding.FragmentMoreBinding
import com.shashank.sony.fancytoastlib.FancyToast

class MoreFragment : Fragment() {
    private lateinit var binding: FragmentMoreBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentMoreBinding.inflate(layoutInflater)
        binding.root.setOnClickListener() {
            return@setOnClickListener
        }

        viewInit()
        return binding.root
    }

    private fun viewInit() {

        binding.logoutBtnId.setOnClickListener() {
            FancyToast.makeText(
                requireContext(),
                "Logout Success!",
                FancyToast.LENGTH_SHORT,
                FancyToast.SUCCESS,
                false
            ).show()

            startActivity(Intent(requireContext(), LogInActivity::class.java))

        }

    }

}
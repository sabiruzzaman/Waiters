package com.intechnology.waiters.orderStatus

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.intechnology.waiters.databinding.ActivityOrderDetailsBinding
import com.intechnology.waiters.orderStatus.adapter.OrderReceiptAdapter

class OrderDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOrderDetailsBinding
    private lateinit var adapter: OrderReceiptAdapter
    private lateinit var layoutManager: LinearLayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityOrderDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewInit()

    }

    private fun viewInit() {

        adapter = OrderReceiptAdapter(this)
        layoutManager = LinearLayoutManager(this)

        binding.orderReceiptRvId.layoutManager = layoutManager
        binding.orderReceiptRvId.adapter=adapter


        binding.backImgId.setOnClickListener() {
            onBackPressed()
        }
    }


}
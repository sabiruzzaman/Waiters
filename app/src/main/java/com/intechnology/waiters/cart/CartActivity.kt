package com.intechnology.waiters.cart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.intechnology.waiters.R
import com.intechnology.waiters.databinding.ActivityCartBinding
import com.intechnology.waiters.MainActivity


class CartActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCartBinding
    lateinit var adapter: TableAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCartBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewInit()
    }

    private fun viewInit() {

        adapter = TableAdapter(this)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.tableRvId.layoutManager = layoutManager
        binding.tableRvId.adapter = adapter

        binding.backImgId.setOnClickListener() {
            onBackPressed()
        }

    }
}
package com.intechnology.waiters.cart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.intechnology.waiters.cart.adapter.CartAdapter
import com.intechnology.waiters.cart.adapter.TableAdapter
import com.intechnology.waiters.databinding.ActivityCartBinding


class CartActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCartBinding
    lateinit var tableAdapter: TableAdapter
    lateinit var cartAdapter: CartAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCartBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewInit()
    }

    private fun viewInit() {

        tableAdapter = TableAdapter(this)
        cartAdapter = CartAdapter(this)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.tableRvId.layoutManager = layoutManager
        binding.tableRvId.adapter = tableAdapter

        val layoutManager1 = LinearLayoutManager(this)
        binding.cartRvId.layoutManager = layoutManager1
        binding.cartRvId.adapter = cartAdapter



        binding.backImgId.setOnClickListener() {
            onBackPressed()
        }

    }
}
package com.intechnology.waiters.cart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.intechnology.waiters.MainActivity
import com.intechnology.waiters.cart.adapter.CartAdapter
import com.intechnology.waiters.cart.adapter.TableAdapter
import com.intechnology.waiters.databinding.ActivityCartBinding
import com.shashank.sony.fancytoastlib.FancyToast


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

        binding.placeOrderBtnId.setOnClickListener(){

            FancyToast.makeText(
                this,
                "Order Success!",
                FancyToast.LENGTH_SHORT,
                FancyToast.SUCCESS,
                false
            ).show()

            startActivity(Intent(applicationContext, MainActivity::class.java))

        }

        binding.cancelBtnId.setOnClickListener(){

            FancyToast.makeText(
                this,
                "Cancel Your Order.",
                FancyToast.LENGTH_SHORT,
                FancyToast.ERROR,
                false
            ).show()

            startActivity(Intent(applicationContext, MainActivity::class.java))

        }


    }
}
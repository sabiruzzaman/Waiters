package com.intechnology.waiters.orderStatus.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.intechnology.waiters.R
import com.intechnology.waiters.databinding.ItemOrderStatusBinding
import com.intechnology.waiters.orderStatus.OrderDetailsActivity

class OrderStatusAdapter(val context: Context) :
    RecyclerView.Adapter<OrderStatusAdapter.OrderStatusViewHolder>() {

    class OrderStatusViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ItemOrderStatusBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderStatusViewHolder {
        val view: View =
            LayoutInflater.from(context).inflate(R.layout.item_order_status, parent, false)
        return OrderStatusViewHolder(view)
    }

    override fun onBindViewHolder(holder: OrderStatusViewHolder, position: Int) {

        with(holder.binding) {

            orderDetailsBtnId.setOnClickListener(){
                val intent = Intent(context, OrderDetailsActivity::class.java)
                context.startActivity(intent)
            }
        }
    }

    override fun getItemCount(): Int {
        return 10
    }

}
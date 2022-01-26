package com.intechnology.waiters.orderStatus.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.intechnology.waiters.R
import com.intechnology.waiters.databinding.ItemOrderStatusBinding
import com.intechnology.waiters.databinding.ItemReceiptBinding
import com.intechnology.waiters.orderStatus.OrderDetailsActivity

class OrderReceiptAdapter (val context: Context) :
    RecyclerView.Adapter<OrderReceiptAdapter.OrderReceiptViewHolder>() {

    class OrderReceiptViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ItemReceiptBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderReceiptViewHolder {
        val view: View =
            LayoutInflater.from(context).inflate(R.layout.item_receipt, parent, false)
        return OrderReceiptViewHolder(view)
    }

    override fun onBindViewHolder(holder: OrderReceiptViewHolder, position: Int) {

        with(holder.binding) {

        }
    }

    override fun getItemCount(): Int {
        return 5
    }

}
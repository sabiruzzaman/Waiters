package com.intechnology.waiters.cart.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.intechnology.waiters.R

class CartAdapter ( val context: Context) :
    RecyclerView.Adapter<CartAdapter.CartViewHolder>() {

    class CartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // val binding = ItemMenuBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_cart, parent, false)
        return CartViewHolder(view)
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {

        /*      with(holder.binding) {
                  itemMenuId.setOnClickListener {
                      interaction.selectMenu()
                  }
              }

              holder.binding.itemMenuId.setOnClickListener {
                  interaction.selectMenu()
              }*/
    }

    override fun getItemCount(): Int {
        return 20
    }
    /*  interface Interaction {
          fun selectMenu()
      }*/
}
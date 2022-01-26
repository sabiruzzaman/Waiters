package com.intechnology.waiters.cart.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.intechnology.waiters.R

class TableAdapter  ( val context: Context) :
RecyclerView.Adapter<TableAdapter.TableViewHolder>() {

    class TableViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // val binding = ItemMenuBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TableViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_table, parent, false)
        return TableViewHolder(view)
    }

    override fun onBindViewHolder(holder: TableViewHolder, position: Int) {

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
package com.intechnology.waiters.menu.adapter


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.intechnology.waiters.R
import com.intechnology.waiters.databinding.ItemMenuBinding
import androidx.recyclerview.widget.LinearLayoutManager



class MenuAdapter(val context: Context) : RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {

    class MenuViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ItemMenuBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_menu, parent, false)
        return MenuViewHolder(view)
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {

        with(holder.binding) {

            menuItemRvId.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            menuItemRvId.adapter = SubMenuAdapter(context)

        }
    }

    override fun getItemCount(): Int {
        return 20
    }

}
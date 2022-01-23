package com.intechnology.waiters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.intechnology.waiters.databinding.ItemMenuBinding

class MenuCategoryAdapter ( val context: Context) :
    RecyclerView.Adapter<MenuCategoryAdapter.MenuCategoryViewHolder>() {

    class MenuCategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
       // val binding = ItemMenuBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuCategoryViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_menu_category_list, parent, false)
        return MenuCategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: MenuCategoryViewHolder, position: Int) {

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
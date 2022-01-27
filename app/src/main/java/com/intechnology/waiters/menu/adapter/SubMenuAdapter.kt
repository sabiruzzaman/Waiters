package com.intechnology.waiters.menu.adapter

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.recyclerview.widget.RecyclerView
import com.intechnology.waiters.R
import com.intechnology.waiters.databinding.ItemMenuBinding
import android.widget.ImageView
import com.intechnology.waiters.cart.CartActivity
import com.intechnology.waiters.databinding.ItemSubMenuBinding


class SubMenuAdapter(val context: Context) :
    RecyclerView.Adapter<SubMenuAdapter.MenuViewHolder>() {

    class MenuViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ItemSubMenuBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_sub_menu, parent, false)
        return MenuViewHolder(view)
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {

        with(holder.binding) {

            menuItemImgId.setOnClickListener() {
                val dialog = Dialog(context)
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
                dialog.setContentView(R.layout.food_details)
                dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)

                val closeImg: ImageView = dialog.findViewById(R.id.closeImgId)
                closeImg.setOnClickListener() {
                    dialog.dismiss()
                }
                dialog.setCanceledOnTouchOutside(false)
                dialog.show()
            }

            shoppingCartImgId.setOnClickListener() {
                val intent = Intent(context, CartActivity::class.java)
                context.startActivity(intent)
            }

        }


    }

    override fun getItemCount(): Int {
        return 20
    }

}
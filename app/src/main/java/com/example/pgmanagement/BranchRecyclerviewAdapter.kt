package com.example.pgmanagement

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BranchRecyclerviewAdapter(private val itemList : ArrayList<DummyBranchDC>) : RecyclerView.Adapter<BranchRecyclerviewAdapter.ViewHolder>() {

    inner class ViewHolder(item : View) : RecyclerView.ViewHolder(item)
    {
        var itemImage : ImageView
        var itemBranch : TextView
        var itemLocation : TextView

        init {
            itemImage = item.findViewById<ImageView>(R.id.branchImg) as ImageView
            itemBranch = item.findViewById<TextView>(R.id.branchName) as TextView
            itemLocation = item.findViewById<TextView>(R.id.branchLocation) as TextView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.branchrecycleritem , parent , false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = itemList[position]
        holder.itemImage.setImageResource(currentItem.image)
        holder.itemBranch.text = currentItem.branch
        holder.itemLocation.text = currentItem.location
    }

}
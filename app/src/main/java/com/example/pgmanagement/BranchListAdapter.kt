package com.example.pgmanagement

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.DiffUtil.ItemCallback
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.bumptech.glide.Glide

class BranchListAdapter : RecyclerView.Adapter<BranchListAdapter.BranchViewHolder>() {
    var img = R.drawable.pg3
    class BranchViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)

    val differCallBack = object : DiffUtil.ItemCallback<DummyBranchDC>(){
        override fun areItemsTheSame(oldItem: DummyBranchDC, newItem: DummyBranchDC): Boolean {
            return oldItem.branch == newItem.branch
        }

        override fun areContentsTheSame(oldItem: DummyBranchDC, newItem: DummyBranchDC): Boolean {
            return oldItem == newItem
        }

    }

    val diff = AsyncListDiffer(this , differCallBack)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BranchViewHolder {
        return BranchViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.branchrecycleritem , parent , false))
    }

    override fun getItemCount(): Int {
        return diff.currentList.size
    }

    override fun onBindViewHolder(holder: BranchViewHolder, position: Int) {
        val branchElement = diff.currentList[position]
        holder.itemView.apply {
            findViewById<TextView>(R.id.branchName).text = branchElement.branch
            findViewById<TextView>(R.id.branchLocation).text = branchElement.location
            Glide.with(context)
                .load(branchElement.image)
                .fitCenter()
                //.error(R.drawable.image_load_error)
                .placeholder(branchElement.image)
                .into(findViewById(R.id.branchImg))
        }

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(branchElement)
        }
    }

    var onItemClick : ((DummyBranchDC)->Unit)?=null

}
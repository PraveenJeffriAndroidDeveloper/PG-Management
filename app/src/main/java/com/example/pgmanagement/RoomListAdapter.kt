package com.example.pgmanagement

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.chip.Chip

class RoomListAdapter : RecyclerView.Adapter<RoomListAdapter.RoomListViewHolder>() {
    class RoomListViewHolder(itemView : View) :  RecyclerView.ViewHolder(itemView)

    val differCallBack = object : DiffUtil.ItemCallback<RoomsDataClass>(){
        override fun areItemsTheSame(oldItem: RoomsDataClass, newItem: RoomsDataClass): Boolean {
            return oldItem.roomName == newItem.roomName
        }

        override fun areContentsTheSame(oldItem: RoomsDataClass, newItem: RoomsDataClass): Boolean {
            return oldItem == newItem
        }

    }

    val diff = AsyncListDiffer(this,differCallBack)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoomListViewHolder {
        return RoomListViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.room_recycler_item,parent,false))
    }

    override fun getItemCount(): Int {
        return diff.currentList.size
    }

    override fun onBindViewHolder(holder: RoomListViewHolder, position: Int) {
        val room = diff.currentList[position]
        holder.itemView.apply {
            findViewById<TextView>(R.id.roomNumtextView).text = "Room No : ${room.roomName}"
            findViewById<Chip>(R.id.acChip).text = if(room.roomType) "AC" else "Non-AC"
            findViewById<Chip>(R.id.sharingChip).text = room.roomSharing
            findViewById<Chip>(R.id.isFullchip).text = if (room.isFullyOccupied) "Fully Occupiued" else "Not Occupiued"
        }

        holder.itemView.setOnClickListener {
            onItemClick?.let { it(room) }
        }
    }

    var onItemClick : ((RoomsDataClass)->Unit)?=null
}
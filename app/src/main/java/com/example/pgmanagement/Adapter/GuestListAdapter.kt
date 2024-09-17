package com.example.pgmanagement.Adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.pgmanagement.DataClass.GuestDataClass
import com.example.pgmanagement.R
import org.w3c.dom.Text

class GuestListAdapter : RecyclerView.Adapter<GuestListAdapter.GuestListViewHolder>() {

    val differCallback = object : DiffUtil.ItemCallback<GuestDataClass>(){
        override fun areItemsTheSame(oldItem: GuestDataClass, newItem: GuestDataClass): Boolean {
            return oldItem.personName == newItem.personName
        }

        override fun areContentsTheSame(oldItem: GuestDataClass, newItem: GuestDataClass): Boolean {
            return oldItem ==  newItem
        }

    }

    val diff = AsyncListDiffer(this , differCallback)
    class GuestListViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GuestListAdapter.GuestListViewHolder {
        return GuestListViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.guest_recy_item , parent , false))
    }

    override fun onBindViewHolder(holder: GuestListAdapter.GuestListViewHolder, position: Int) {
        val person = diff.currentList[position]
        holder.itemView.apply {
            Glide.with(context)
                .load(person.personImage)
                .into(findViewById(R.id.personImg))
            findViewById<TextView>(R.id.personName).text = person.personName
            if (person.isRentPaid){
                findViewById<TextView>(R.id.rentPaidorNot).text = "Paid"
                findViewById<TextView>(R.id.rentPaidorNot).setTextColor(resources.getColor(R.color.green))
            }else{
                findViewById<TextView>(R.id.rentPaidorNot).text = "Not Paid"
                findViewById<TextView>(R.id.rentPaidorNot).setTextColor(resources.getColor(R.color.Red))
            }
            if (person.isEbPaid){
                findViewById<TextView>(R.id.EbPaidorNot).text = "Paid"
                findViewById<TextView>(R.id.EbPaidorNot).setTextColor(resources.getColor(R.color.green))
            }else{
                findViewById<TextView>(R.id.EbPaidorNot).text = "Not Paid"
                findViewById<TextView>(R.id.EbPaidorNot).setTextColor(resources.getColor(R.color.Red))
            }

            setOnClickListener {
                onItemClickListner?.invoke(person)
            }
        }
    }

    override fun getItemCount(): Int {
        return diff.currentList.size
    }

    var onItemClickListner : ((GuestDataClass)->Unit)? = null
}
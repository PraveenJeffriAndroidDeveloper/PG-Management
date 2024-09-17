package com.example.pgmanagement.UI

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pgmanagement.Adapter.GuestListAdapter
import com.example.pgmanagement.DataClass.MockGuest
import com.example.pgmanagement.R
import com.example.pgmanagement.databinding.ActivityGuestListBinding

class GuestList : AppCompatActivity() {
    lateinit var binding : ActivityGuestListBinding
    lateinit var guest_adapter : GuestListAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGuestListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupAdapter()
        guest_adapter.diff.submitList(MockGuest.getGuest())

        guest_adapter.onItemClickListner = {
            var toGuestProfile  = Intent(this , UserProfile::class.java)
            startActivity(toGuestProfile)
        }

    }

    private fun setupAdapter(){
        guest_adapter = GuestListAdapter()
        binding.guestListrecyclerView.apply {
            adapter = guest_adapter
            layoutManager = GridLayoutManager(context , 2)
        }
    }
}
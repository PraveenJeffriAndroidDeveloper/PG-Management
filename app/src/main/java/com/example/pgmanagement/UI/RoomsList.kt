package com.example.pgmanagement.UI

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.pgmanagement.Adapter.RoomListAdapter
import com.example.pgmanagement.DataClass.MockRooms
import com.example.pgmanagement.databinding.ActivityRoomsListBinding

class RoomsList : AppCompatActivity() {
    private lateinit var binding: ActivityRoomsListBinding
    private lateinit var roomAdapter: RoomListAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRoomsListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupAdapter()
        roomAdapter.diff.submitList(MockRooms.getRooms())

        binding.branchName.text = intent.getStringExtra("branch")

        roomAdapter.onItemClick = {
            val toGuestList = Intent(this , GuestList::class.java)
            startActivity(toGuestList)
        }

    }

    private fun setupAdapter(){
        roomAdapter = RoomListAdapter()
        binding.roomsRecView.apply {
            adapter = roomAdapter
            layoutManager = GridLayoutManager(context , 2)
        }
    }

}


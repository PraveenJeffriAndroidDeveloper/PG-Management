package com.example.pgmanagement

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
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

    }

    private fun setupAdapter(){
        roomAdapter = RoomListAdapter()
        binding.roomsRecView.apply {
            adapter = roomAdapter
            layoutManager = GridLayoutManager(context , 2)
        }
    }

}


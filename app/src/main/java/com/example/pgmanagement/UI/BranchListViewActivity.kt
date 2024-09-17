package com.example.pgmanagement.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pgmanagement.Adapter.BranchListAdapter
import com.example.pgmanagement.DataClass.MockList
import com.example.pgmanagement.databinding.ActivityBranchListViewBinding

class BranchListViewActivity : AppCompatActivity() {
    private lateinit var binding : ActivityBranchListViewBinding
    lateinit var branchAdapter : BranchListAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBranchListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupAdapter()
        binding.fab.setOnClickListener {
            val toAddNewBranch = Intent(this, AddNewBranch::class.java)
            startActivity(toAddNewBranch)
        }
        branchAdapter.diff.submitList(MockList.getModel())

        branchAdapter.onItemClick = {
            val toRoomList = Intent(this , RoomsList::class.java).let { intent->
                intent.putExtra("branch" , it.branch)
            }
            startActivity(toRoomList)
        }
    }

    private fun setupAdapter() {
        branchAdapter = BranchListAdapter()
        binding.branchRecyView.apply {
            adapter = branchAdapter
            layoutManager = LinearLayoutManager(context)
        }
    }


}
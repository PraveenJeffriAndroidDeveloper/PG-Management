package com.example.pgmanagement.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pgmanagement.databinding.ActivityAddNewBranchBinding

class AddNewBranch : AppCompatActivity() {
    private lateinit var binding : ActivityAddNewBranchBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddNewBranchBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
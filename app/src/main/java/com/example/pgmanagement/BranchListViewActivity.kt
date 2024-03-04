package com.example.pgmanagement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.pgmanagement.databinding.ActivityBranchListViewBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class BranchListViewActivity : AppCompatActivity() {
    private lateinit var binding : ActivityBranchListViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBranchListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.fab.setOnClickListener {
            Toast.makeText(this , "Hello world" , Toast.LENGTH_SHORT).show()
        }
    }
}
package com.example.pgmanagement.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pgmanagement.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toBranchListViewActivity = Intent(this, BranchListViewActivity::class.java)
        startActivity(toBranchListViewActivity)
    }
}
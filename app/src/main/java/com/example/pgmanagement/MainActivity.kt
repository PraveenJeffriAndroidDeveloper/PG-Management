package com.example.pgmanagement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toBranchListViewActivity = Intent(this, BranchListViewActivity::class.java)
        startActivity(toBranchListViewActivity)
    }
}
package com.example.swipe_refresh_layout

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val swipeRefreshLayout = findViewById<SwipeRefreshLayout>(R.id.refreshLayout)
        val textView = findViewById<TextView>(R.id.tv1)

        swipeRefreshLayout.setOnRefreshListener{
            textView.text = "Refreshed"
            swipeRefreshLayout.isRefreshing = false
        }

    }
}


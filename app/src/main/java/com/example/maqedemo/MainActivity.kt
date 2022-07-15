package com.example.maqedemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("onCreate")
        setContentView(R.layout.activity_main)

        val btnNext = findViewById<FloatingActionButton>(R.id.fab_next_page)
        btnNext.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)

        }
    }

    override fun onRestart() {
        super.onRestart()
        println("onRestart")
    }

    override fun onStart() {
        super.onStart()
        println("onStart")
    }

    override fun onResume() {
        super.onResume()
        println("onResume")
    }

    override fun onPause() {
        super.onPause()
        println("onPause")
    }

    override fun onStop() {
        super.onStop()
        println("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy")
    }
}
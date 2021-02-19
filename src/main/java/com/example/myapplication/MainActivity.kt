package com.example.myapplication

import android.os.Bundle
import android.util.Log

import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity","оно рождается)))")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity","оно дышит)))")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity","оно работает)))")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity","оно свернулось(((")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity","оно остановилось...")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity","умер")
    }

}
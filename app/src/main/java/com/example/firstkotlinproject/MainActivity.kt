package com.example.firstkotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//Android activity Life Cycle(Activity yaşam döngüsü)
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("OnCreate Called")
    }
    override fun onStart(){
        super.onStart()
        println("OnStart Called")
    }
    override fun onResume(){
        super.onResume()
        println("OnResume Called")
    }
    override fun onPause(){
        super.onPause()
        println("OnPause Called")
    }
    override fun onStop(){
        super.onStop()
        println("OnStop Called")
    }
    override fun onDestroy(){
        super.onDestroy()
        println("OnDestroy Called")
    }
}
package com.example.MAD_PRACTICAL6_21012011071
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val playButton: FloatingActionButton = findViewById(R.id.playbtn)
        val stopButton: FloatingActionButton = findViewById(R.id.stopbtn)
        playButton.setOnClickListener() {
            startMusic()
        }
        stopButton.setOnClickListener(){
            stopMusic()
        }
    }
    fun startMusic(){
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERVALUE).apply {
            startService(this)
        }
    }
    fun stopMusic(){
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERVALUE).apply {
            stopService(this)
        }
    }
}

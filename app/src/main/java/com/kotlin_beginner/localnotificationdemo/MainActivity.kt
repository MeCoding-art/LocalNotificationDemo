package com.kotlin_beginner.localnotificationdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btCreateNotification)
        button.setOnClickListener {
            val service = CounterNotificationService(applicationContext)
            service.showNotification(Counter.value)
        }

    }
}
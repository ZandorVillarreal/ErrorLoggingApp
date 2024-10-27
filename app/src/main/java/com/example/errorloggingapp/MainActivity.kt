package com.example.errorloggingapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import timber.log.Timber


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val errorButton: Button = findViewById(R.id.errorButton)
        errorButton.setOnClickListener {
            // Simulate an error
            throw RuntimeException("This is a test crash")
        }
    }
}

package com.example.validator

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.validator.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private val viewBinding by lazy { ActivitySplashBinding.inflate(layoutInflater) }
    private val handler by lazy { Handler(mainLooper) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Hide the toolbar
        supportActionBar?.hide()
        setContentView(viewBinding.root)

        // Using a handler to delay loading the MainActivity
        handler.postDelayed({
            // start activity
            startActivity(Intent(this, MainActivity::class.java))
            // animate the loading of new activity
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }, 2000)
    }
}

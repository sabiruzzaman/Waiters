package com.intechnology.waiters

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.intechnology.waiters.databinding.ActivityLogInBinding

class LogInActivity : AppCompatActivity() {
    lateinit var binding: ActivityLogInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLogInBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewInit()

    }

    private fun viewInit() {
        binding.loginBtnId.setOnClickListener(){
            startActivity(Intent(applicationContext, MainActivity::class.java))
        }

    }
}
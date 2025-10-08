package com.example.changeskilltraining.oop.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.changeskilltraining.MainActivity
import com.example.changeskilltraining.R
import com.example.changeskilltraining.first_training.Student
import com.example.changeskilltraining.oop.datamanager.StudentDataManager

class LoginActivity : AppCompatActivity() {

    private var btnLogin : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnLogin = findViewById(R.id.btn_common)

        btnLogin?.setOnClickListener {
            val student = Student()
            StudentDataManager.student = student
            Log.e("LoginActivity", "onPause called")
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onPause() {
        super.onPause()
        Log.e("LoginActivity", "onPause called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("LoginActivity", "onDestroy called")
    }

    override fun onStop() {
        super.onStop()
        Log.e("LoginActivity", "onStop called")
    }
}
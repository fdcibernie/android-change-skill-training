package com.example.changeskilltraining

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.FrameLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.lifecycleScope
import com.example.changeskilltraining.oop.Student
import com.example.changeskilltraining.oop.StudentDetails
import com.example.changeskilltraining.oop.abstract.StudentAbstract
import com.example.changeskilltraining.oop.activities.LoginActivity
import com.example.changeskilltraining.oop.dialogs.DialogInFragment
import com.example.changeskilltraining.oop.fragments.TeacherDetailsFragment
import com.example.changeskilltraining.oop.interfaces.IStudentCallback
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutInflater.inflate(R.layout.activity_main, null))

        /**NOTE - SAMPLE POLYMORPHISM (OOP)*/
//        val btn = findViewById<TextView>(R.id.button)
//        btn.text = "Click ME"
//
//        val studentClass = Student(this)
//
//        btn.setOnClickListener {
//            Log.e("MainActivity","Button clicked")
//            studentClass.showStudentDetails()
//        }


        val container = findViewById<FrameLayout>(R.id.container)

        /**NOTE - FRAGMENT WITH BUNDLE)*/
//        val frag = TeacherDetailsFragment.newInstance("Data 1","Data 2")
//        supportFragmentManager.
//        beginTransaction().
//        add(
//            R.id.container,
//            frag,
//            "TeacherDetailsFragment")
//            .commit()

        /**NOTE - INTENT PRESENTATION*/
//        lifecycleScope.launch(Dispatchers.Main) {
//            delay(5000)
//            Intent(this@MainActivity, LoginActivity::class.java).also {
//                startActivity(it)
//            }
//        }


        /**NOTE - DIALOG FRAGMENT PRESENTATION*/
        DialogInFragment().show(supportFragmentManager, "MyDialog")
    }


    /**NOTE - LIFECYCLE PRESENTATION*/
    override fun onStart() {
        super.onStart()
        Log.e("MainActivity","onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.e("MainActivity","onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.e("MainActivity","onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.e("MainActivity","onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("MainActivity","onDestroy called")
    }
}
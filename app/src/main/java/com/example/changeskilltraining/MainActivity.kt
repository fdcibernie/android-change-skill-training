package com.example.changeskilltraining

import android.os.Bundle
import android.util.Log
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.changeskilltraining.first_training.Person
import com.example.changeskilltraining.first_training.Student
import com.example.changeskilltraining.first_training.StudentWithAbstract
import com.example.changeskilltraining.first_training.Teacher
import com.example.changeskilltraining.oop.model.TextBook
import com.example.changeskilltraining.oop.dialogs.DialogInFragment
import com.example.changeskilltraining.oop.fragments.TeacherDetailsFragment
import org.w3c.dom.Text
import java.sql.Array

class MainActivity : AppCompatActivity() {
    var listOfTextBook: ArrayList<TextBook> = ArrayList()
    var mapOfTextBook: HashMap<String, TextBook> = HashMap()
    var listOfTextBook2: MutableList<TextBook> = mutableListOf()
    var listOfTextBook3: ArrayList<TextBook> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutInflater.inflate(R.layout.activity_main, null))

        val student = Student()
        student.setStudentName(name = "Liel", age = 35)
        student.displayName()
        student.getStudentDayClass(3)

        val studentWithAbstract = StudentWithAbstract()
        studentWithAbstract.reviseClass()

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
        val frag = TeacherDetailsFragment.newInstance("Data 1","Data 2")
        supportFragmentManager.
        beginTransaction().
        add(
            R.id.container,
            frag,
            "TeacherDetailsFragment")
            .commit()

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
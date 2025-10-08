package com.example.changeskilltraining.first_training

import android.util.Log
import com.example.changeskilltraining.enums.DAYS

class Student : Person() {


//    fun setName(name: String) {
//        this.name = name
//    }
//
//    fun setAge(age: Int) {
//    }
//
//    fun getNameFromPerson(): String? {
//        return getCompleteName()
//    }
//
//    override fun onCreate() {
//        super.onCreate()
//    }

    fun displayName() {
        Log.e("Student", "Name: $name Age: $age")
    }

     fun setStudentName(name: String,age: Int = 25) {
         this.name = name
         this.age = age
     }

    fun getStudentDayClass(status: Int) {
        val day = DAYS.getDaysEnumThroughInt(status)
        Log.e("Student", "day: $day")
    }
    companion object {
        const val STUDENT_KEY = "STUDENT_KEY"
    }

}
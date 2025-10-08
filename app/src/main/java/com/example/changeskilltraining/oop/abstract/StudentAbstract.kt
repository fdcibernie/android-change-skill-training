package com.example.changeskilltraining.oop.abstract

import com.example.changeskilltraining.oop.StudentDetails

abstract class StudentAbstract {
    open fun onSuccess2(studentDetails: StudentDetails) {}
    open fun onError2(error: String) {
        println("Error: $error")
    }
    open fun reviseClass() {}

}
package com.example.changeskilltraining.oop.interfaces

import com.example.changeskilltraining.oop.StudentDetails

interface IStudentCallback {
    fun onSuccess(studentDetails: StudentDetails)
    fun onError(error: String)
    fun onClick(item: String)
}
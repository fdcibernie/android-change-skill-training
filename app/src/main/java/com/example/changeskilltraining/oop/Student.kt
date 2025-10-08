package com.example.changeskilltraining.oop

import com.example.changeskilltraining.oop.interfaces.IStudentCallback
import com.example.changeskilltraining.oop.model.TextBook

open class Student(private val callback: IStudentCallback? = null){
     var age: Int = 20
     var name: String = "John Doe"
     var mTextBook: TextBook? = null
     private var title: String = "Kotlin Programming"
     private var studentDetails: ArrayList<StudentDetails> = ArrayList()

     private var textBookManager: TextBookManager = TextBookManager
     private val mCallback: IStudentCallback? = null
     init {
          textBookManager.setTextBooks()
          textBookManager.setSelectedTextBook(0)
          setStudentDetails()
          studentTextBook()
     }

     //fun display

     private fun studentTextBook() {
          studentDetails.forEachIndexed { i,st ->
               textBookManager.setTextBookMap(
                    key = st.name,
                    textBook = textBookManager.textBookList[i])
          }
     }

     private fun setStudentDetails() {
          studentDetails.clear()
          studentDetails.add(StudentDetails(1,"A","city"))
          studentDetails.add(StudentDetails(2,"B","city"))
          studentDetails.add(StudentDetails(2,"C","city"))
          studentDetails.add(StudentDetails(3,"D","city"))
     }

     fun showStudentDetails() {
          callback?.onSuccess(studentDetails = studentDetails[0])
//          textBookManager.textBookMap.map {
//                Log.e("Student details","Student Name: ${it.key}, Book Title: ${it.value.title}")
//          }
//          textBookManager.textBookMap.forEach { s, textBook ->
//
//               Log.e("Student details","Student Name: ${s}, Book Title: ${textBook}")
//          }
     }
}

data class StudentDetails(
     var id: Int,
     var name: String?,
     var address: String?
)
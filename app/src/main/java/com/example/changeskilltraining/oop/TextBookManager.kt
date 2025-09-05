package com.example.changeskilltraining.oop

import android.content.Context
import com.example.changeskilltraining.R

object TextBookManager {

    var textBookList: ArrayList<TextBook> = ArrayList()
    var selectedTextBook: TextBook? = null
    var textBookMap: HashMap<String, TextBook> = HashMap()

    fun setTextBooks() {
        textBookList.clear()
        textBookList.add(TextBook("Kotlin Programming", "JetBrains", 300))
        textBookList.add(TextBook("Java Programming", "Oracle", 400))
        textBookList.add(TextBook("Python Programming", "Guido van Rossum", 350))
        textBookList.add(TextBook("C++ Programming", "Bjarne Stroustrup", 450))
        textBookList.add(TextBook("JavaScript Programming", "Brendan Eich", 250))
    }

    fun setSelectedTextBook(index: Int) {
        selectedTextBook = textBookList[index]
    }

    fun setTextBookMap(key: String?, textBook: TextBook?) {
        textBook?.let { tb ->
            key?.let { k ->
                textBookMap[k] = tb
            }
        }
    }
}
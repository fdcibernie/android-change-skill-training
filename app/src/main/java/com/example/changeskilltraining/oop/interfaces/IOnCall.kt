package com.example.changeskilltraining.oop.interfaces

import androidx.fragment.app.Fragment

interface IOnCall {
    fun navigateFragment(fragment:Fragment)
    fun popFragment()
}
package com.example.changeskilltraining.oop.dialogs

import android.app.Dialog
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Button
import androidx.fragment.app.DialogFragment
import com.example.changeskilltraining.R

class DialogInFragment: DialogFragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.dialog_in_fragment, container, false)
        Log.e("DialogInFragment","onCreateView")
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("DialogInFragment","onViewCreated")
        view.findViewById<Button>(R.id.btn_dismiss).setOnClickListener {
            dismiss()
            Log.e("DialogInFragment","onViewCreated-click")
        }
    }
}
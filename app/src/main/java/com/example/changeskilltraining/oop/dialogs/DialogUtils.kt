package com.example.changeskilltraining.oop.dialogs

import android.app.AlertDialog
import android.content.Context

object DialogUtils {
    fun showLoadingDialog(context:Context) {
        val builder: AlertDialog.Builder = AlertDialog.Builder(context)
        builder
            .setMessage("I am the message")
            .setTitle("I am the title")

        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    fun showLoadingDialogWithButton(context:Context) {
        val builder: AlertDialog.Builder = AlertDialog.Builder(context)
        builder
            .setMessage("I am the message")
            .setTitle("I am the title")
            .setPositiveButton("Positive") { _, _ ->
                // Do something.
            }
            .setNegativeButton("Negative") { _, _ ->
                // Do something else.
            }

        val dialog: AlertDialog = builder.create()
        dialog.show()
    }
}
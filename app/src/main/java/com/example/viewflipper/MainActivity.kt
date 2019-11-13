package com.example.viewflipper

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.TextView
import android.widget.ViewFlipper
import kotlinx.android.synthetic.main.activity_main.*
// it can be used for make tutorial for our app.
//view flipper adedd in our main.xml
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
// below code from 20 to 23 will be created new TextView.


        val textView = TextView(this)
        textView.text = "Dynamically created"
        textView.gravity = Gravity.CENTER
        view_flipper.addView(textView)


    }

    fun prev(v: View) {

        view_flipper.showPrevious()
    }

    fun next(v: View) {

        view_flipper.showNext()
    }
}

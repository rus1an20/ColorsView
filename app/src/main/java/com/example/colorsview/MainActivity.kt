package com.example.colorsview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.colorsview.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        var boxOne: TextView = findViewById(R.id.box_one_text)
        var boxTwo: TextView = findViewById(R.id.box_two_text)
        var boxThree: TextView = findViewById(R.id.box_three_text)
        var boxFour: TextView = findViewById(R.id.box_four_text)
        var boxFive: TextView = findViewById(R.id.box_five_text)
        var consLayout: ConstraintLayout = findViewById(R.id.constraint_layout)
        var redButton: Button = findViewById(R.id.red_button)
        var yellowButton: Button = findViewById(R.id.yellow_button)
        var greenButton: Button = findViewById(R.id.green_button)
        val clickableView: List<View> =
            listOf(boxOne,boxTwo,boxThree,boxFour,boxFive,consLayout,redButton,yellowButton,greenButton)

        for (item in clickableView) {
            item.setOnClickListener{makeColored(it)}
        }
    }


    fun makeColored(view: View) {
        var boxThree: TextView = findViewById(R.id.box_three_text)
        var boxFour: TextView = findViewById(R.id.box_four_text)
        var boxFive: TextView = findViewById(R.id.box_five_text)

        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custom colors for background
            R.id.red_button -> boxThree.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> boxFour.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> boxFive.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

}
package com.example.jenkins_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract
import androidx.annotation.ColorRes
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()


        val blue = R.color.blue
        val red = R.color.red
        val white = R.color.white
        val green = R.color.green
        val black = R.color.black

        val colorList = listOf(black, red, white, green, blue)

        cl_container.setOnClickListener {
            it.setBackgroundColor(colorList[i])
            i++

            if (i == colorList.size) {
                i = 0
            }
        }


    }
}

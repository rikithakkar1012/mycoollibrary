package com.android.helloworldlibrary

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.android.mycoollibrary.LatLonDistanceCalculator
import com.android.mycoollibrary.Point


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buenosAiresObeliscoPoint = Point((-34.6037389).toFloat(), (-58.3815704).toFloat())

        val nycStatueOfLibertyPoint = Point(40.6892494.toFloat(), (-74.0445004).toFloat())

        val distanceBetweenPoints = LatLonDistanceCalculator.calculateDistance(
            buenosAiresObeliscoPoint,
            nycStatueOfLibertyPoint
        )

        val kilometersLabel = findViewById<View>(R.id.kilometersLabel) as TextView

        kilometersLabel.setText("Between the Obelisco and the Statue of Liberty there are: \n" + distanceBetweenPoints + "KM");


    }
}
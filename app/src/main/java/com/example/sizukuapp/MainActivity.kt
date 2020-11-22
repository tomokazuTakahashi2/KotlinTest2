package com.example.sizukuapp

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        animateTranslationY()
        animateScaleX()
        animateScaleY()

    }



    private fun animateTranslationY() {
        val sizuku_image = findViewById<ImageView>(R.id.sizuku_image)
        val objectAnimator = ObjectAnimator.ofFloat(sizuku_image, "translationY", 1500f)
        objectAnimator.duration = 1000
        objectAnimator.repeatCount = -1
        objectAnimator.start()
    }
    private fun animateScaleX() {
        val circle_image = findViewById<ImageView>(R.id.circle_image)
        val objectAnimator = ObjectAnimator.ofFloat(circle_image, "scaleX", 2f)
        objectAnimator.duration = 1000
        objectAnimator.repeatCount = -1
        objectAnimator.start()
    }
    private fun animateScaleY() {
        val circle_image = findViewById<ImageView>(R.id.circle_image)
        val objectAnimator = ObjectAnimator.ofFloat(circle_image, "scaleY", 2f)
        objectAnimator.duration = 1000
        objectAnimator.repeatCount = -1
        objectAnimator.start()
    }

}
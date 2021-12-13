package com.example.vectordrawable

import android.graphics.drawable.AnimatedVectorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val img: ImageView = findViewById(R.id.image)
        var cara =true


        img.setOnClickListener{
            when(cara){
                true->{
                    cara =false
                    val anim = getDrawable(R.drawable.ad_animaciones) as AnimatedVectorDrawable
                    img.setImageDrawable(anim)
                    anim.start()
                }
                false->{
                    cara=true
                    val anim2 = getDrawable(R.drawable.ad_animaciones2) as AnimatedVectorDrawable
                    img.setImageDrawable(anim2)
                    anim2.start()
                }
            }

        }

    }
}
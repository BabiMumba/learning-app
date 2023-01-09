package com.babimumba.e_learning.hm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.babimumba.e_learning.R
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel

class NestedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nested)

        val imageList = ArrayList<SlideModel>() // Create image list

// imageList.add(SlideModel("String Url" or R.drawable)
// imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title

        imageList.add(SlideModel("https://www.esisalama.com/assets/img/carousel/banner_principale.jpg", "Ecole superieur d'informatique salama"))
        imageList.add(SlideModel("https://www.esisalama.com/assets/img/carousel/banner_genie_log.png", "reseau informatique"))
        imageList.add(SlideModel("https://www.esisalama.com/assets/img/carousel/banner_design.png", "DEsign est multimedia"))

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)

    }
}
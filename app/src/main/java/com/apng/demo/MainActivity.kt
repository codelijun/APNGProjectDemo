package com.apng.demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import oupson.apng.ApngAnimator

class MainActivity : AppCompatActivity() {

    companion object {
//        private const val imageUrl = "file:///android_asset/image.png"
//        private const val imageUrl = "file:///android_asset/apng_geneva_drive.png"
        private const val imageUrl =
            "https://raw.githubusercontent.com/sahasbhop/apng-view/master/app/src/main/assets/apng/apng_geneva_drive.png" // image url could be an url, or a file path. You could also load byteArray and file
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ApngAnimator(this).load(imageUrl).loadInto(imageView)
    }
}
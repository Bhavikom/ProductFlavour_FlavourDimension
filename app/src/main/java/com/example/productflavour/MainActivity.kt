package com.example.productflavour

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.masaibar.flavordimensionssample.BuildConfig
import com.masaibar.flavordimensionssample.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, BuildConfig.FLAVOR,Toast.LENGTH_SHORT).show()
    }
}
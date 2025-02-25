package com.faceu.faceu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.faceu.faceu.databinding.ActivityCreateMethodBinding

class CreateMethodActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCreateMethodBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCreateMethodBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backToHome.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }

        binding.ivCamera.setOnClickListener {
            startActivity(Intent(this, FaceCameraActivity::class.java))
        }
    }
}
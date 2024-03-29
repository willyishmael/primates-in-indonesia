package com.ngab.primatesinindonesia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import com.ngab.primatesinindonesia.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val profile = ProfileData.listData[0]

        binding.tvProfilePicture.setImageResource(profile.photo)
        binding.tvProfileName.text = profile.name
        binding.tvProfileEmail.text = profile.email
    }
}
package com.ngab.primatesinindonesia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ngab.primatesinindonesia.databinding.ActivityItemDetailBinding

class ItemDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityItemDetailBinding

    companion object {
        const val EXTRA_ITEM_POSITION = "extra_item_position"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityItemDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val primate = intent.getIntExtra(EXTRA_ITEM_POSITION, 0)
    }
}
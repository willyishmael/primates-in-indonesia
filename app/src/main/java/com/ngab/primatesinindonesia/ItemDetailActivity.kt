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

        val primatePosition = intent.getIntExtra(EXTRA_ITEM_POSITION, 0)
        val primate : Primate = PrimatesData.listData[primatePosition]

        binding.imgPrimateBig.setImageResource(primate.photo)
        binding.tvPrimateName.text = primate.name
        binding.tvPrimateLatinName.text = primate.latinName
        binding.tvPrimateDescription.text = primate.detail
    }
}
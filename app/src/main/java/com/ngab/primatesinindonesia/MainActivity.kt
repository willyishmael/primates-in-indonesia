package com.ngab.primatesinindonesia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ngab.primatesinindonesia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    private var list: ArrayList<Primate> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvPrimates.setHasFixedSize(true)
        binding.rvPrimates.setOnClickListener(this)

        list.addAll(PrimatesData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        binding.rvPrimates.layoutManager = LinearLayoutManager(this)
        val listPrimateAdapter = ListPrimateAdapter(list)
        binding.rvPrimates.adapter = listPrimateAdapter
    }

    override fun onClick(v: View?) {

    }
}
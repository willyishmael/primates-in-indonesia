package com.ngab.primatesinindonesia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.ngab.primatesinindonesia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var list: ArrayList<Primate> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvPrimates.setHasFixedSize(true)

        list.addAll(PrimatesData.listData)
        showRecyclerList()
    }

    private fun moveToItemDetailActivity(data: Primate){
        Toast.makeText(this, data.name, Toast.LENGTH_SHORT).show()
    }

    private fun showRecyclerList() {
        binding.rvPrimates.layoutManager = LinearLayoutManager(this)
        val listPrimateAdapter = ListPrimateAdapter(list)
        binding.rvPrimates.adapter = listPrimateAdapter

        listPrimateAdapter.setOnItemClickCallback(object : ListPrimateAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Primate) {
                moveToItemDetailActivity(data)
            }
        })
    }

}
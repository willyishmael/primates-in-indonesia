package com.ngab.primatesinindonesia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
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

    private fun moveToItemDetailActivity(position: Int){
        val moveIntent = Intent(this@MainActivity, ItemDetailActivity::class.java)
        moveIntent.putExtra(ItemDetailActivity.EXTRA_ITEM_POSITION, position)
        startActivity(moveIntent)
    }

    private fun showRecyclerList() {
        binding.rvPrimates.layoutManager = LinearLayoutManager(this)
        val listPrimateAdapter = ListPrimateAdapter(list)
        binding.rvPrimates.adapter = listPrimateAdapter

        listPrimateAdapter.setOnItemClickCallback(object : ListPrimateAdapter.OnItemClickCallback {
            override fun onItemClicked(position: Int) {
                moveToItemDetailActivity(position)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.profile, menu)
        return super.onCreateOptionsMenu(menu)
    }

    fun onOptionItemSelected(item: MenuItem): Boolean {
        selectAction(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun selectAction(selectedAction: Int) = when (selectedAction){
        R.id.action_profile -> {

        }
        else -> {
            //do nothing
        }
    }

}
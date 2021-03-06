package com.ngab.primatesinindonesia

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import javax.security.auth.callback.Callback

class ListPrimateAdapter(private val listPrimate: ArrayList<Primate>) : RecyclerView.Adapter<ListPrimateAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_primates, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val primate = listPrimate[position]

        Glide.with(holder.itemView.context)
                .load(primate.photo)
                .apply(RequestOptions().override(55,55))
                .into(holder.imgPhoto)

        holder.tvName.text = primate.name
        holder.tvDetail.text = primate.detail
        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(holder.adapterPosition)
        }
    }

    override fun getItemCount(): Int {
        return listPrimate.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(position: Int)
    }
}
package com.teste.thiago.adapter
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.view.LayoutInflater
import com.teste.thiago.MainActivity
import com.teste.thiago.R
import com.teste.thiago.shared.Utils
import com.teste.thiago.model.GameItem
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.list_item.view.*

class TopGamesAdapter(var gameItemList: List<GameItem>, var activity: MainActivity) : RecyclerView.Adapter<TopGamesAdapter.ViewHolder>(){

    override fun onBindViewHolder(holder: ViewHolder, position: Int)  = holder.bind(gameItemList[position])

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(parent)

    override fun getItemCount(): Int = gameItemList.size

    private fun loadImage(gameItem: GameItem, img: ImageView) {
        Picasso.with(img.context)
                .load(Utils.getBoxUrl(gameItem.game?.box!!.template, Utils.getDensity(img.context)))
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.placeholder)
                .into(img)
    }

    private fun loadText(gameItem: GameItem, txt: TextView) {
        txt.text = gameItem.game?.name
    }

    inner class ViewHolder(itemView: ViewGroup) : RecyclerView.ViewHolder(
            LayoutInflater.from(itemView.context).inflate(R.layout.list_item, itemView, false)) {

        fun bind(item: GameItem) = with(itemView) {
            item?.let {
                loadImage(it, list_item_image)
                loadText(it, list_item_title)

                itemView.list_item_main_layout.setOnClickListener {
                    activity.loadDetails(item)
                }
            }
        }
    }
}
package com.edandaniel.mygames.gamelist

import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.View
import com.edandaniel.mygames.model.Game
import kotlinx.android.synthetic.main.my_games_item.view.*

class GameViewHolder(itemView: View):
        RecyclerView.ViewHolder(itemView){

    fun bindView(game: Game,
                 listener: (Game) -> Unit) = with(itemView){
        tvTitle.text = game.title
        tvYear.text = game.year.toString()
        tvDescription.text = game.description
        ivGameBoxArt.setImageDrawable(
                ContextCompat.getDrawable(itemView.context,game.resourceId)
        )

        setOnClickListener{listener(game)}
    }
}
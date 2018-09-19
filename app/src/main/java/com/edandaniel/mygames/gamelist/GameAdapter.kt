package com.edandaniel.mygames.gamelist

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.edandaniel.mygames.R
import com.edandaniel.mygames.model.Game

class GameAdapter(val context: Context,
                  val games:List<Game>,
                  val listener: (Game)->Unit): RecyclerView.Adapter<GameViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.my_games_item,
                parent, false)
        return GameViewHolder(view)
    }

    override fun getItemCount(): Int {
        return games.size
    }

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        val game = games[position]
        holder.let{
            it.bindView(game,listener)
        }

    }

}
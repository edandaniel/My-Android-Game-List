package com.edandaniel.mygames.gamelist

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import android.widget.Toast
import com.edandaniel.mygames.DetailActivity
import com.edandaniel.mygames.R
import com.edandaniel.mygames.model.Game
import kotlinx.android.synthetic.main.activity_game_list.*

class GameListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_list)

        rvGames.adapter = GameAdapter(this, getGames(),{game ->
            //rip toast "All toasters toast toast" - Mario
            val detailIntent = Intent(this, DetailActivity::class.java)
            detailIntent.putExtra("GAME", game) //serializable not performatic, user parceable
            startActivity(detailIntent)
        })

        rvGames.layoutManager = LinearLayoutManager(this)
    }

    private fun getGames(): List<Game> {
        return listOf(
            Game(R.drawable.mariobros,"Mario brothas", 1983,"uma dupla de encanadores da pesada"),
            Game(R.drawable.et,"ET", 1982,"Um alienigena do barulho aprontando altas confusoes"),
            Game(R.drawable.meia_vida,"Half Life", 1998,"Primeiro jogo da melhor trilogia que nunca existirá"),
            Game(R.drawable.splat,"Splatoon", 2015,"Jogo de tiro com tinta e polvos"),
            Game(R.drawable.escairrim,"Skyrim", 2011,"Andar por 30h e matar dragoes"),
            Game(R.drawable.hamtaro,"Hamtaro", 2002,"Hamster")
        )
    }
}

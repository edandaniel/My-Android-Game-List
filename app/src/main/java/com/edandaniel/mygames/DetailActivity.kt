package com.edandaniel.mygames

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.edandaniel.mygames.model.Game
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setSupportActionBar(toolbar)

        val game = intent.getParcelableExtra<Game>("GAME")

        Toast.makeText(this, game.title, Toast.LENGTH_LONG).show()
        this.title = game.title
        /*val year =
        val description =
        detailIntent.putExtra("YEAR", game.year)
        detailIntent.putExtra("DESCRIPTION", game.description)
        detailIntent.putExtra("RES_ID", game.resourceId)*/

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }
}

package com.example.recylerviewkotlin_mharis_17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val  INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val superherolistm = listOf<Superhero>(
        Superhero(
            R.drawable.antman,
            nameSuperhero = "Ant-man",
            descSuperhero = "Ant-Man bisa mengubah ukuranya menjadi kecil ataupun besar",
        ),Superhero(
            R.drawable.black,
            nameSuperhero = "Black Panter",
            descSuperhero = "Black Panter Memiliki otak yang cerdas dan fisik yang kuat",
        ),Superhero(
            R.drawable.captain,
            nameSuperhero = "Captain Amerika",
            descSuperhero = "Captain Amerika memiliki fisik yang cukup kuat dan sifatnya yang tegas",
        ),Superhero(
            R.drawable.doctor,
            nameSuperhero = "Doctor Strange",
            descSuperhero = "Doctor Strange adalah penyihir yang handal dan juga dai bisa meramal masa depan",
        ),Superhero(
            R.drawable.gamora,
            nameSuperhero = "Gamora",
            descSuperhero = "Gamora adalaha anak angkata tanos yang menghianati tanos itu sendiri",
        ),Superhero(
            R.drawable.hawkeye,
            nameSuperhero = "Hawkeye",
            descSuperhero = "Hawkeye pemanah handal dan tangguh dari anggota marvel",
        ),Superhero(
            R.drawable.hulk,
            nameSuperhero = "Hulk",
            descSuperhero = "Berbadan besar bertubuh hijau dan fisik yang sangat kuat",
        ),Superhero(
            R.drawable.iron,
            nameSuperhero = "Iron man",
            descSuperhero = "Iron man memiliki otak yang super jenius dan selalu menciptakan ide yang cemerlang",
        ),Superhero(
            R.drawable.loki,
            nameSuperhero = "loki",
            descSuperhero = "Loki sendiri adalah adik dari tor dia memiliki watak yang  jahat",
        ),Superhero(
            R.drawable.marvel,
            nameSuperhero = "Captain Marvel",
            descSuperhero = "Captain Marvel memiliki fisik yang sangat kuat dan kemampuan yang hebat",
        ),Superhero(
            R.drawable.nebula,
            nameSuperhero = "Nebula",
            descSuperhero = "Nebula adalah adik dari gamora anak angkat dari tanos tetapi dia merupakan seorang robot",
        ),Superhero(
            R.drawable.panter,
            nameSuperhero = "Black Panter",
            descSuperhero = "Black Panter merupakan pemimpin dari negara/planet yang bernama wakanda",
        ),
    )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this,superherolistm){
            val intent = Intent (this,DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE,it)
            startActivity(intent)

        }
    }
}
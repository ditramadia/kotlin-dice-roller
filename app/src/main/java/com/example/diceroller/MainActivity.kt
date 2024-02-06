package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.Random

class MainActivity : AppCompatActivity() {

    lateinit var ivDice: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ivDice = findViewById<ImageView>(R.id.ivDice)

        val btnRoll = findViewById<Button>(R.id.btnRoll)
        btnRoll.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val drawableDice = when (Random().nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        ivDice.setImageResource(drawableDice)
    }
}
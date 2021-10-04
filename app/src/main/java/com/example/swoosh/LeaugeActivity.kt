package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class LeaugeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leauge)

        getStratedButton.setOnClickListener {
            val leagueIntent = Intent(this,LeaugeActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}
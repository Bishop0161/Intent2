package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gotoSecondeBtn.setOnClickListener {

            val inputName = inputName.text.toString()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("სახელი", inputName)
            startActivity(intent)


            finish()

        }

    }

}

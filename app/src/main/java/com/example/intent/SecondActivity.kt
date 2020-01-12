package com.example.intent

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.second_activity.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val name = intent.extras?.getString("NAME", "")

        finishBtn.setOnClickListener {

            val inputEmail = inputEmail.text.toString()

            val intent = Intent(this, ForthActivity::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("EMAIL", inputEmail)
            startActivity(intent)

            finish()

        }

    }

}
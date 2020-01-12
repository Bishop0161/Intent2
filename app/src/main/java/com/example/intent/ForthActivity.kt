package com.example.intent

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.forth_activity.*


class ForthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.forth_activity)

        genderbtn.setOnClickListener(){
            val gender = inputgender.text.toString()
            val name = intent.extras?.getString("NAME","")
            val email = intent.extras?.getString("EMAIL","")

            val intent = Intent(this,ThirdActivity::class.java)
            intent.putExtra("NAME", name)

            intent.putExtra("EMAIL", email)

            intent.putExtra("GENDER", gender)

            startActivity(intent)
            finish()


        }

    }
}
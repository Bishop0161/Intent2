package com.example.intent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.third_activity.*

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_activity)

        val name = intent.extras?.getString("NAME", "")


        val email = intent.extras?.getString("EMAIL", "")

        val gender =intent.extras?.getString("GENDER","")
        showName.text = "შეყვანილი სახელი: $name"

        showEmail.text = "შეყვანილი მეილი: $email"

        showgender.text = "შეყვანილი სქესი: $gender"

    }
}

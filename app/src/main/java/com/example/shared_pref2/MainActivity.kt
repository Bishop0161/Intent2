package com.example.shared_pref2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var editText = findViewById(R.id.text) as EditText
        val imp = editText.text
        val toast = Toast.makeText(applicationContext, imp, Toast.LENGTH_LONG)
        toast.show()



        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        pref.apply {

            val input = getString("input", "")
            text.setText(input)

        }
    }

    fun button(v: View){
        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        val editor = pref.edit()

        editor
            .putString("input", text.text.toString())
            .apply()


        var editText = findViewById(R.id.text) as EditText
        val toast = Toast.makeText(applicationContext, editText.text, Toast.LENGTH_LONG)
        toast.show()

        val imp = editText.text


    }
}
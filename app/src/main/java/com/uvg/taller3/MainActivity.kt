package com.uvg.taller3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        suma.setOnClickListener {
            val intent = Intent(this, Ingreso::class.java)
            intent.putExtra("operacion", "+")
            startActivityForResult(intent, 1)
        }

        resta.setOnClickListener {
            val intent = Intent(this, Ingreso::class.java)
            intent.putExtra("operacion", "-")
            startActivityForResult(intent, 1)
        }

        multiplicacion.setOnClickListener {
            val intent = Intent(this, Ingreso::class.java)
            intent.putExtra("operacion", "*")
            startActivityForResult(intent, 1)
        }

        division.setOnClickListener {
            val intent = Intent(this, Ingreso::class.java)
            intent.putExtra("operacion", "/")
            startActivityForResult(intent, 1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }
}
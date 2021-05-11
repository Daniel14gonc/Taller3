package com.uvg.taller3

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
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

    @SuppressLint("SetTextI18n")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(resultCode == Activity.RESULT_OK){
            if(requestCode == 1){
                val bundle = data?.extras
                if(bundle != null){
                    val resultado = bundle.getString("resultado")
                    res.setText("Resultado: $resultado")
                }
            }
        }
    }
}
package com.uvg.taller3

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_ingreso.*
import java.lang.Exception

class Ingreso : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingreso)

        var bundle = intent.extras
        val op  = bundle?.getString("operacion")
        print(op+"AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA")

        calcular.setOnClickListener {
            if(op != null){
                val intent = Intent()
                var v1: Int = Valor1.text.toString().toInt()
                var v2: Int = Valor2.text.toString().toInt()
                try {
                    var res = 0
                    when (op) {
                        "+" -> {
                            res = v1 + v2
                        }
                        "-" -> {
                            res = v1 - v2
                        }
                        "*" -> {
                            res = v1 * v2
                        }
                        "/" -> {
                            res = v1 / v2
                        }
                    }
                    intent.putExtra("resultado", res.toString())
                }
                catch (e:Exception){
                    intent.putExtra("resultado", "error")
                }
                setResult(Activity.RESULT_OK, intent)
                finish()
            }
        }
    }
}
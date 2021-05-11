package com.uvg.taller3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_ingreso.*
import java.lang.Exception

class Ingreso : AppCompatActivity() {
    lateinit var op: String
    lateinit var input1: EditText
    lateinit var input2: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingreso)

        input1 = Valor1
        input2 = Valor2

        var bundle:Bundle? = intent.extras
        op  = bundle?.getString("operacion").toString()

        calcular.setOnClickListener {
            if(op != null){
                val intent = Intent()
                var v1: Int = input1.text.toString().toInt()
                var v2: Int = input2.text.toString().toInt()
                try {
                    var res: Int = 0
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
                finish()
            }
        }
    }
}
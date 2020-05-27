package com.tiagoborges.alcoolougasolina

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var txtAlc : EditText
    lateinit var txtGaso : EditText
    lateinit var txtResultado : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtAlc = findViewById(R.id.editTextAlcool)
        txtGaso = findViewById(R.id.editTextGasolina)
        txtResultado = findViewById(R.id.textViewResultado)
    }

    fun calcValor(view : View) {
        var alc : Double? = txtAlc.text.toString().toDoubleOrNull()
        var gas : Double? = txtGaso.text.toString().toDoubleOrNull()
        if(alc != null && gas != null){
            var res : Double = alc / gas
            if(res < 0.7) txtResultado.text = "Álcool!"
                else txtResultado.text = "Gasolina!"
            }
            txtResultado.visibility = View.VISIBLE
    }
}

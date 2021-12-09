package ucb.imiot.proyectoingeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class time_converter : AppCompatActivity() {

    lateinit var convertirBtn: Button
    lateinit var unidadAConvertir : EditText
    lateinit var unidadConvertida : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_converter)

        convertirBtn = findViewById(R.id.longitudeConversionBtn)
        unidadAConvertir = findViewById(R.id.unidadAConvertir)
        unidadConvertida = findViewById(R.id.unidadConvertida)

        convertirBtn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val skm: String = unidadAConvertir.getText().toString()
                val hrs = skm.toFloat()
                val seg = hrs * 3600
                val smillas = String.format("%f", seg)
                unidadConvertida.setText(smillas)
            }
        })

    }
}
package ucb.imiot.proyectoingeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_form.*
import kotlinx.android.synthetic.main.activity_physics_forms.*

class physicsForms : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_physics_forms)

        mru_button.setOnClickListener{startActivity(Intent(applicationContext,mruForms::class.java))}

        mrua_button.setOnClickListener{startActivity(Intent(applicationContext,mruaForms::class.java))}

        clibre_button.setOnClickListener{startActivity(Intent(applicationContext,clibreForms::class.java))}

        dinamica_button.setOnClickListener{startActivity(Intent(applicationContext,dinamicaForms::class.java))}

        choques_button.setOnClickListener{startActivity(Intent(applicationContext,choquesForms::class.java))}

    }
}
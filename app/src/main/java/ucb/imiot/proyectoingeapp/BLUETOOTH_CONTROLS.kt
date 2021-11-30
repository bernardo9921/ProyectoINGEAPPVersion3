package ucb.imiot.proyectoingeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bluetooth_controls.*
import kotlinx.android.synthetic.main.activity_physics_forms.*

class BLUETOOTH_CONTROLS : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_bluetooth_controls)

        info_button.setOnClickListener{startActivity(Intent(applicationContext,InformationBluetoothControl::class.java))}

    }
}
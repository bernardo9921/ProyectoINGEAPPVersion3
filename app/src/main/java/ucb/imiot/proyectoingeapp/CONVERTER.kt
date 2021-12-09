package ucb.imiot.proyectoingeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_converter.*
import kotlinx.android.synthetic.main.activity_main.*

class CONVERTER : AppCompatActivity() {

    lateinit var velocitybutton: Button
    lateinit var timebutton: Button
    lateinit var degreesbutton: Button
    lateinit var massbutton: Button
    lateinit var longitudebutton: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_converter)

        val picasso = Picasso.get()
        picasso.load(
            "https://saveatrain-12e85.kxcdn.com/blog/wp-content/uploads/2019/09/units-converter.jpg")
            .into(converterImagen)

        velocitybutton = findViewById(R.id.velocity_button)
        velocitybutton.setOnClickListener{startActivity(Intent(applicationContext,velocity_converter::class.java))}

        timebutton = findViewById(R.id.time_button)
        timebutton.setOnClickListener{startActivity(Intent(applicationContext,time_converter::class.java))}

        massbutton = findViewById(R.id.mass_button)
        massbutton.setOnClickListener{startActivity(Intent(applicationContext,mass_converter::class.java))}

        longitudebutton = findViewById(R.id.longitude_button)
        longitudebutton.setOnClickListener{startActivity(Intent(applicationContext,longitude_converter::class.java))}

        degreesbutton = findViewById(R.id.degrees_button)
        degreesbutton.setOnClickListener{startActivity(Intent(applicationContext,degrees_converter::class.java))}

    }
}

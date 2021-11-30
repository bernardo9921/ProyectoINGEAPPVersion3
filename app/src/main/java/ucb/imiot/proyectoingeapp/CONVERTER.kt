package ucb.imiot.proyectoingeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_converter.*
import kotlinx.android.synthetic.main.activity_main.*

class CONVERTER : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_converter)

        val picasso = Picasso.get()
        picasso.load(
            "https://saveatrain-12e85.kxcdn.com/blog/wp-content/uploads/2019/09/units-converter.jpg")
            .into(converterImagen)

        velocity_button.setOnClickListener{startActivity(Intent(applicationContext,velocityConverter::class.java))}

        longitude_button.setOnClickListener{startActivity(Intent(applicationContext,timeConverter::class.java))}

        mass_button.setOnClickListener{startActivity(Intent(applicationContext,massConverter::class.java))}

        time_button.setOnClickListener{startActivity(Intent(applicationContext,timeConverter::class.java))}

        degrees_button.setOnClickListener{startActivity(Intent(applicationContext,degreesConverter::class.java))}

    }

    }

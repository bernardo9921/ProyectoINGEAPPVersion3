package ucb.imiot.proyectoingeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_form.*
import kotlinx.android.synthetic.main.activity_main.*

class FORMS : AppCompatActivity() {

    lateinit var fisicaBtn:Button
    lateinit var mateBtn:Button
    lateinit var calculoBtn:Button
    lateinit var cppBtn:Button
    lateinit var pythonBtn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        val picasso = Picasso.get()
        picasso.load(
            "https://media.istockphoto.com/vectors/content-writing-icon-vector-graphics-vector-id1257231138?b=1&k=20&m=1257231138&s=612x612&w=0&h=h2zSnbVT6UoW3k5q87W2VwmVfCOXvDUsju4-wwPI7-o=")
            .into(formImagen)

        fisicaBtn = findViewById(R.id.fisica_button)
        fisicaBtn.setOnClickListener{startActivity(Intent(applicationContext,physicsForms::class.java))}

        mateBtn = findViewById(R.id.matematicas_button)
        mateBtn.setOnClickListener{startActivity(Intent(applicationContext,mathForms::class.java))}

        calculoBtn = findViewById(R.id.calculo_button)
        calculoBtn.setOnClickListener{startActivity(Intent(applicationContext,calculusForms::class.java))}

        cppBtn = findViewById(R.id.cpp_button)
        cppBtn.setOnClickListener{startActivity(Intent(applicationContext,cppForms::class.java))}

        pythonBtn = findViewById(R.id.python_button)
        pythonBtn.setOnClickListener{startActivity(Intent(applicationContext,pythonForms::class.java))}

    }
}
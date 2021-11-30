package ucb.imiot.proyectoingeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.media.RingtoneManager
import androidx.core.app.NotificationCompat
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private lateinit var firstButton : Button
    private lateinit var secondButton : Button
    private lateinit var thirdButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val picasso = Picasso.get()
        picasso.load(
            "https://media.istockphoto.com/vectors/artificial-intelligence-isometric-composition-vector-id1201171303?k=20&m=1201171303&s=612x612&w=0&h=NHMeWDNCDriHvGuptTp73YelAxnAzjB_a_y9DGlzjxs=")
            .into(appImagen)

        firstButton = findViewById(R.id.forms_button)
        secondButton = findViewById(R.id.conversor_button)
        thirdButton = findViewById(R.id.controls_button)

        firstButton.setOnClickListener{startActivity(Intent(this,FORMS::class.java))}
        secondButton.setOnClickListener{startActivity(Intent(this,CONVERTER::class.java))}
        thirdButton.setOnClickListener{startActivity(Intent(this,BLUETOOTH_CONTROLS::class.java))}

        val sound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
        val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        val channelId = "com.caller.appoint"
        val name = getString(R.string.channel_name)
        val descriptionText = getString(R.string.channel_description)
        val importance = NotificationManager.IMPORTANCE_DEFAULT
        val channel = NotificationChannel(channelId, name, importance).apply {
            description = descriptionText
        }


        notificationManager.createNotificationChannel(channel)
        val notification = NotificationCompat.Builder(this, channelId)
            .setSmallIcon(R.drawable.notification_bg)
            .setContentTitle("Mensaje Diario de IngeApp:")
            .setContentText("Aplicacion de ingenieros para ingenieros ;)")
            .setSound(sound)
            .setAutoCancel(true)
        notificationManager.notify(0, notification.build())

    }

    }




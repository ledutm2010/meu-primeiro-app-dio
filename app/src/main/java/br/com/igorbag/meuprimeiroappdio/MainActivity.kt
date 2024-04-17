package br.com.igorbag.meuprimeiroappdio

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    //complementando o desafio
    lateinit var logo: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logo = findViewById(R.id.imageView)

        if (Locale.getDefault().language.equals("pt")) {
            logo.setImageResource(R.drawable.brasil)
        }
        if (Locale.getDefault().language.equals("en")) {
            logo.setImageResource(R.drawable.eua)
        }
        if (Locale.getDefault().language.equals("es")) {
            logo.setImageResource(R.drawable.espanha)
        }
        if (Locale.getDefault().language.equals("ja")) {
            logo.setImageResource(R.drawable.japao)
        }
        if (Locale.getDefault().language.equals("de")) {
            logo.setImageResource(R.drawable.alemanha)
        }
    }
}
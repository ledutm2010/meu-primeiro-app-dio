package br.com.igorbag.meuprimeiroappdio

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var logo: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (Locale.getDefault().getLanguage().equals("pt")) {
            logo.setImageResource(R.drawable.brasil);
        }
        if (Locale.getDefault().getLanguage().equals("en")) {
            logo.setImageResource(R.drawable.eua);
        }
        if (Locale.getDefault().getLanguage().equals("es")) {
            logo.setImageResource(R.drawable.espanha);
        }
        if (Locale.getDefault().getLanguage().equals("ja")) {
            logo.setImageResource(R.drawable.japao);
        }
        if (Locale.getDefault().getLanguage().equals("de")) {
            logo.setImageResource(R.drawable.alemanha);
        }
    }
}
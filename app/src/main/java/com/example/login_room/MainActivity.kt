package com.example.login_room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.Toolbar
import com.example.login_room.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var mBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        // Configura la Toolbar
        val toolbar: Toolbar = findViewById(R.id.app_bar_material)
        setSupportActionBar(toolbar)

        // Puedes personalizar la Toolbar aquí
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.title = "Mi Toolbar"

        toolbar.setNavigationOnClickListener {
            // Tu lógica aquí cuando se hace clic en el botón de retroceso
            Toast.makeText(this, "BACK", Toast.LENGTH_SHORT).show()
        }
    }
}
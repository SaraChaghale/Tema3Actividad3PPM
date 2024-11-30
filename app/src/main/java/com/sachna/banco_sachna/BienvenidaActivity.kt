package com.sachna.banco_sachna

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sachna.banco_sachna.databinding.BienvenidaBinding

class BienvenidaActivity : AppCompatActivity() {
    private lateinit var binding: BienvenidaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = BienvenidaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val dni = intent.getStringExtra("USER_DNI")
        binding.textViewWelcome.text = "Bienvenido/a, \n$dni!"



    }
}
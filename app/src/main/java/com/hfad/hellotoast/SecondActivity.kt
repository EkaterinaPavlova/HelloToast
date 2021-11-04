package com.hfad.hellotoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hfad.hellotoast.MainActivity.Companion.EXTRA_MESSAGE
import com.hfad.hellotoast.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        binding = ActivitySecondBinding.inflate(layoutInflater).also { setContentView(it.root) }


        val intent = intent
        val count = intent.getStringExtra(EXTRA_MESSAGE)
        binding.textCount.text = count


    }
}
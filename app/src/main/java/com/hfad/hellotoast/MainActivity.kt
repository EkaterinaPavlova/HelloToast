package com.hfad.hellotoast

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.hfad.hellotoast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var mCount = 0
    private lateinit var binding: ActivityMainBinding


    companion object {
        private const val KEY_COUNT = "KEY_COUNT"
        const val EXTRA_MESSAGE = "extra_message"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        mCount = savedInstanceState.getInt(KEY_COUNT)
        binding.showCount.text = mCount.toString()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(KEY_COUNT, mCount)
    }

    fun showSecondActivity(view: android.view.View) {
        val intent = Intent(this, SecondActivity::class.java)
        val text = mCount.toString()
        intent.putExtra(EXTRA_MESSAGE, text)
        startActivity(intent)

    }

    fun countUp(view: android.view.View) {
        mCount ++
        binding.showCount.text = mCount.toString()
    }

}
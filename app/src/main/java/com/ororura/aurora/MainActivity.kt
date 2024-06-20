package com.ororura.aurora

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import com.ororura.aurora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding
        get() = _binding ?: throw IllegalStateException("Error")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.layoutAnswer3.setOnClickListener {
            markAnswerCorrect()
        }

    }

    private fun markAnswerCorrect() {
        binding.layoutAnswer3.background = ContextCompat.getDrawable(
            this@MainActivity, R.drawable.shape_correct_rounded_container
        )

        binding.textViewNumber3.background =
            ContextCompat.getDrawable(this@MainActivity, R.drawable.shape_rounded_correct_variants)

        binding.textViewNumber3.setTextColor(
            ContextCompat.getColor(
                this@MainActivity,
                R.color.white
            )
        )

        binding.textViewVariant3.setTextColor(
            ContextCompat.getColor(
                this@MainActivity,
                R.color.green
            )
        )

        binding.buttonSkip.isVisible = false

        binding.nextButton.isVisible = true
    }
}
package com.example.firstandroid

import android.graphics.Color
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.firstandroid.databinding.NewLayoutFileBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: NewLayoutFileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = NewLayoutFileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.containerFirstAnswer.setOnClickListener {
            makeUncorrect(binding.containerFirstAnswer)
        }
        binding.containerSecondAnswer.setOnClickListener {
            makeUncorrect(binding.containerSecondAnswer)
        }
        binding.containerThirdAnswer.setOnClickListener {
            makeUncorrect(binding.containerThirdAnswer)
        }
        binding.containerFourthAnswer.setOnClickListener {
            makeCorrect(binding.containerFourthAnswer)
        }
        binding.btnSkip.setOnClickListener { makeNeutral() }

    }
    private fun makeCorrect(container: LinearLayout) {
        container.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
    }
    private fun makeUncorrect(container:LinearLayout) {
        container.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
    }
    private fun makeNeutral() {
        binding.containerFirstAnswer.setBackgroundColor(Color.WHITE)
        binding.containerSecondAnswer.setBackgroundColor(Color.WHITE)
        binding.containerThirdAnswer.setBackgroundColor(Color.WHITE)
        binding.containerFourthAnswer.setBackgroundColor(Color.WHITE)
    }
}

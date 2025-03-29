package com.example.firstandroid

import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
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
            showResult(false)
        }
        binding.containerSecondAnswer.setOnClickListener {
            makeUncorrect(binding.containerSecondAnswer)
            showResult(false)
        }
        binding.containerThirdAnswer.setOnClickListener {
            makeUncorrect(binding.containerThirdAnswer)
            showResult(false)
        }
        binding.containerFourthAnswer.setOnClickListener {
            makeCorrect(binding.containerFourthAnswer)
            showResult(true)
        }
        binding.btnContinue.setOnClickListener { makeNeutral() }

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
    private fun showResult(IsCorrect: Boolean){
        var color:Int
        var image:Int
        var text:String
        if(IsCorrect){
            color = ContextCompat.getColor(this, R.color.green)
            image= R.drawable.ic_icon
            text = "Correct"
        }else {
            color = ContextCompat.getColor(this, R.color.red)
            image= R.drawable.ic_wrong
            text = "Wrong"
        }
        binding.ResultContainer.setBackgroundColor(color)
        binding.finger.setImageResource(image)
        binding.correctWrong.setText(text)
    }
}

package com.necatdede.myapplication


import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.necatdede.myapplication.databinding.ActivityMainBinding
import java.io.InputStream


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)


        setContentView(binding.root)

        binding.buttonCalculate.setOnClickListener {
            if (binding.editTextNumber1.text.isNotEmpty() && binding.editTextNumber2.text.isNotEmpty()) {
                var result = binding.editTextNumber1.text.toString()
                    .toInt() * 0.4 + binding.editTextNumber2.text.toString().toInt() * 0.6
                binding.label.text = result.toString()

                if (result >= 40) {
                    binding.imageView.setImageResource(R.drawable.good)
                } else {
                    binding.imageView.setImageResource(R.drawable.lazy)
                }


            } else {
                binding.label.text = "Please enter a Vize and Final"
                binding.imageView.setImageResource(0)
            }


        }

    }


}
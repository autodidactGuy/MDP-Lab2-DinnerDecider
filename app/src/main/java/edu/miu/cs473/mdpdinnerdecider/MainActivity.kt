package edu.miu.cs473.mdpdinnerdecider

import android.os.Bundle
import androidx.activity.ComponentActivity
import edu.miu.cs473.mdpdinnerdecider.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : ComponentActivity() {

    val foods = mutableListOf<String>("Hamburger", "Pizza", "Mexican", "Mexican", "Chinese")
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.addNewFoodBtn.setOnClickListener {
            foods.add(binding.addNewFoodEditText.text.toString())
        }
        binding.deciderBtn.setOnClickListener{
            binding.addNewFoodEditText.setText(foods[Random.nextInt(foods.size)])
        }
    }
}
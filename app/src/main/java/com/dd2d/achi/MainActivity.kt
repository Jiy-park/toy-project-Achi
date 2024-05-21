package com.dd2d.achi

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.dd2d.achi.ViewBuilder.textOf
import com.dd2d.achi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val tv = textOf(context = this@MainActivity){
            width = MATCH_PARENT
            height = 50.dp
            backgroundColor = Color.CYAN
            gravity = Gravity.CENTER or Gravity.BOTTOM
        }


        binding.root.addView(tv)


    }
}
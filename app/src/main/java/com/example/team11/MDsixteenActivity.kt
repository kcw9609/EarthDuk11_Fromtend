package com.example.team11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.team11.databinding.ActivityMdeightBinding
import com.example.team11.databinding.ActivityMdsixteenBinding

class MDsixteenActivity : AppCompatActivity() {
    lateinit var binding: ActivityMdsixteenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMdsixteenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 뒤로 가기 버튼 클릭 시 액티비티 종료
        binding.chevronArr.setOnClickListener {
            onBackPressed()
        }
    }
}
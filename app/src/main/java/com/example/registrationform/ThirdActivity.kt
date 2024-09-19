package com.example.registrationform

import android.os.Bundle
import android.util.Log
import com.example.registrationform.databinding.ActivityThirdBinding
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    private val TAG = "THIRD_ACTIVITY"
    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate called")
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Retrieve data from SecondActivity
        val email = intent.getStringExtra("EXTRA_EMAIL") ?: ""
        val fullname = intent.getStringExtra("EXTRA_FULLNAME") ?: ""
        val newUsername = intent.getStringExtra("EXTRA_NEW_USERNAME") ?: ""
        val newPassword = intent.getStringExtra("EXTRA_NEW_PASSWORD") ?: ""

        with(binding) {
            tvFullname.text = "Hai, $fullname! Selamat datang!"
            tvEmail.text = "Pendaftaran berhasil dengan email: $email"
            tvUsername.text = "Nama pengguna kamu: $newUsername"
            tvPassword.text = "Kata sandi telah berhasil disimpan"

        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy called")
    }
}

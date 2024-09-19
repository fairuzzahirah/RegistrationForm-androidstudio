package com.example.registrationform

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.registrationform.databinding.ActivitySecondBinding
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    private val TAG = "SECOND_ACTIVITY"
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate called")
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Retrieve data from MainActivity
        val email = intent.getStringExtra("EXTRA_EMAIL") ?: ""
        val fullname = intent.getStringExtra("EXTRA_FULLNAME") ?: ""
        val username = intent.getStringExtra("EXTRA_USERNAME") ?: ""
        val password = intent.getStringExtra("EXTRA_PASSWORD") ?: ""

        with(binding) {
            btnToThirdActivity.setOnClickListener {
                val enteredUsername = editusername.text.toString()
                val enteredPassword = editpassword.text.toString()

                // Verify if the entered data matches the data from MainActivity
                if (enteredUsername == username && enteredPassword == password) {
                    val intentToThirdActivity = Intent(this@SecondActivity, ThirdActivity::class.java)
                    intentToThirdActivity.putExtra("EXTRA_EMAIL", email)
                    intentToThirdActivity.putExtra("EXTRA_FULLNAME", fullname)
                    intentToThirdActivity.putExtra("EXTRA_OLD_USERNAME", username)
                    intentToThirdActivity.putExtra("EXTRA_OLD_PASSWORD", password)
                    intentToThirdActivity.putExtra("EXTRA_NEW_USERNAME", enteredUsername)
                    intentToThirdActivity.putExtra("EXTRA_NEW_PASSWORD", enteredPassword)
                    startActivity(intentToThirdActivity)
                } else {
                    Toast.makeText(this@SecondActivity, "Data yang Anda masukkan tidak valid", Toast.LENGTH_SHORT).show()
                }
            }
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

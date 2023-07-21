package com.example.lms
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up)
    }

    fun onButtonBackSignUp(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun onButtonSubmitSignUp(view: View) {
        val intent = Intent(this, EmailOTPConfirmation::class.java)
        startActivity(intent)
    }
}

package com.example.lms
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_in)
    }

    fun onButtonBackSignIn(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun onButtonSubmitSignIn(view: View) {
        val intent = Intent(this, EmailOTPConfirmation::class.java)
        startActivity(intent)
    }
}

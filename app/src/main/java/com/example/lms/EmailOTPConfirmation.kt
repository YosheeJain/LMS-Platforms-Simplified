package com.example.lms
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class EmailOTPConfirmation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.email_otp_confirmation)
    }

    fun onButtonConfirmOTP(view: View) {
        val intent = Intent(this, AfterSignIn::class.java)
        startActivity(intent)
    }

//    fun onButtonResendOTP(view: View) {
//        val intent = Intent(this, SignUp::class.java)
//        startActivity(intent)
//    }
}

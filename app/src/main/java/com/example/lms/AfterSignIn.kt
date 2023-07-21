package com.example.lms
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class AfterSignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.after_sign_in_main)
    }

//    fun onButtonClickSignInMainScreen(view: View) {
//        val intent = Intent(this, SignIn::class.java)
//        startActivity(intent)
//    }
//
//    fun onButtonClickSignUpMainScreen(view: View) {
//        val intent = Intent(this, SignUp::class.java)
//        startActivity(intent)
//    }

    fun onButtonSignOut(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}

package com.example.lms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        // DATABASE HANDLING
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            // opening the db
            val databaseHelper = DatabaseInit(this)

            // reading the csv
            // for course list
            val csvParser = CSVParse()
            val assetManager = applicationContext.assets
            val filename = "course_list.csv"
            csvParser.parseCSV_COURSE_LIST(assetManager, filename)

            // handle adding to table 1

            // gpa
            val csvParser_GPA = CSVParse()
            val assetManager_GPA = applicationContext.assets
            val filename_GPA = "gpa.csv"
            csvParser_GPA.parseCSV_GPA(assetManager, filename_GPA)

            // handle adding to table 2

        // OTHER CODE
    }

        fun onButtonClickSignInMainScreen(view: View) {
                val intent = Intent(this, SignIn::class.java)
                startActivity(intent)
        }

        fun onButtonClickSignUpMainScreen(view: View) {
                val intent = Intent(this, SignUp::class.java)
                startActivity(intent)
        }
}
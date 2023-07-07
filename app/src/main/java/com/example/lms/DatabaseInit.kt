package com.example.lms
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseInit(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_NAME = "LMSmanager.db"
        private const val DATABASE_VERSION = 1

        // TABLE 1
        const val TABLE_NAME_1 = "COURSE_LIST"
        const val Subject = "Subject"
        const val Number = "Number"
        const val Name = "Name"
        const val Description = "Description"
        const val Credit_Hours = "Credit_Hours"
        const val CRN = "CRN"
        const val Instructors = "Instructors"

        // TABLE 2
        const val TABLE_NAME_2 = "GPA"
        const val Subject_GPA = "Subject_GPA"
        const val Course_Number = "Course"
        const val CRN_GPA = "CRN_GPA"
        const val Course_Title = "Course_Title"
        const val Course_Section = "Course_Section"
        const val Average_Grade = "Average_Grade"
        const val Primary_Instructor = "Primary_Instructor"
    }

    override fun onCreate(db: SQLiteDatabase) {
        // table 1
        val createTableCOURSE_LIST = "CREATE TABLE IF NOT EXISTS COURSE_LIST (Subject VARCHAR(255),Number INT,Name VARCHAR(255),Description VARCHAR(255),Credit_Hours INT,CRN INT PRIMARY KEY, Instructors VARCHAR(255))"
        db.execSQL(createTableCOURSE_LIST)

        // table 2
        val createTableGPA = "CREATE TABLE IF NOT EXISTS GPA (Subject_GPA VARCHAR(255), Course INT, CRN_GPA INT PRIMARY KEY, Course_Title VARCHAR(255), Course_Section VARCHAR(255), Average_Grade REAL, Primary_Instructor VARCHAR(255))"
        db.execSQL(createTableGPA)
    }


    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        // Handle database schema upgrades here
    }

    // TO DO -- EDIT insert function, do we need the onUpgrade version??
//
//    fun insertData(name: String) {
//        val db = writableDatabase
//        val insertQuery = "INSERT INTO MyTable (name) VALUES ('$name')"
//        db.execSQL(insertQuery)
//        db.close()
//    }
}

package com.example.lms
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

// ADD USER DATABASE TOO

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

    // CREATE
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

    // INSERT
    fun insertDataintoCourseList(Subject: String, Number: Int, Name: String, Description: String, Credit_Hours: Int, CRN: Int, Instructors: String) {
        val db = writableDatabase
        val insertQuery = "INSERT INTO COURSE_LIST VALUES ('$Subject', $Number, '$Name', '$Description', $Credit_Hours, $CRN, '$Instructors')"
        db.execSQL(insertQuery)
        db.close()
    }

    fun insertDataintoGPA(Subject_GPA: String, Course_Number: Int, CRN_GPA: Int, Course_Title: String, Course_Section: String, Average_Grade: Double, Primary_Instructor: String) {
        val db = writableDatabase
        val insertQuery = "INSERT INTO GPA VALUES ('$Subject_GPA', $Course_Number, $CRN_GPA, '$Course_Title', '$Course_Section', $Average_Grade, '$Primary_Instructor')"
        db.execSQL(insertQuery)
        db.close()
    }

    // SELECT
    fun selectFromCourseList() {
        val db = writableDatabase
        val selectQuery = "SELECT * FROM COURSE_LIST"
        db.execSQL(selectQuery)
        db.close()
    }

    fun selectFromGPA() {
        val db = writableDatabase
        val selectQuery = "SELECT * FROM GPA"
        db.execSQL(selectQuery)
        db.close()
    }
}

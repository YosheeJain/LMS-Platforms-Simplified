package com.example.lms
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseInit(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_NAME = "LMSmanager.db"
        private const val DATABASE_VERSION = 1

//        // TABLE 1
//        const val TABLE_NAME_1 = "COURSE_LIST"
//        const val Year = "Year"
//        const val Term = "Term"
//        const val YearTerm = "YearTerm"
//        const val Subject = "Subject"
//        const val Number = "Number"
//        const val Name = "Name"
//        const val Description = "Description"
//        const val Credit_Hours = "Credit Hours"
//        const val Section_Info = "Section Info"
//        const val Degree_Attributes = "Degree"
//        const val Schedule_Information = "Schedule Information"
//        const val CRN = "CRN"
//        const val Section = "Section"
//        const val Status_Code = "Status Code"
//        const val Part_of_Term = "Part of Term"
//        const val Section_Title = "Section Title"
//        const val Section_Credit_Hours = "Section Credit Hours"
//        const val Section_Status = "Section Status"
//        const val Enrollment_Status = "Enrollment Status"
//        const val Type = "Type"
//        const val Type_Code = "Type Code"
//        const val Start_Time = "Start Time"
//        const val End_Time = "End Time"
//        const val Days_of_Week = "Days of Week"
//        const val Room = "Room"
//        const val Building = "Building"
//        const val Instructors = "Instructors"
//
//        // TABLE 2
//        const val TABLE_NAME_2 = "GPA"
//        const val Subject
//        const val Course
//        const val CRN
//        const val Course Title
//        const val Course Section
//        const val Sched Type
//        const val Term
//        const val A+
//        const val A
//        const val A-
//        const val B+
//        const val B
//        const val B-
//        const val C+
//        const val C
//        const val C-
//        const val D+
//        const val D
//        const val D-
//        const val F
//        const val W
//        const val Average_Grade
//        const val Primary Instructor
//    }
//
//    override fun onCreate(db: SQLiteDatabase) {
//        // table 1
//        val createTableCOURSE_LIST = "CREATE TABLE IF NOT EXISTS COURSE_LIST (Year,Term,YearTerm,Subject,Number,Name,Description,Credit Hours,Section Info,Degree Attributes,Schedule Information,CRN,Section,Status Code,Part of Term,Section Title,Section Credit Hours,Section Status,Enrollment Status,Type,Type Code,Start Time,End Time,Days of Week,Room,Building,Instructors)"
//        db.execSQL(createTableCOURSE_LIST)
//
//        // table 2
//        val createTableGPA = "CREATE TABLE IF NOT EXISTS GPA (Subject,Course,CRN,Course Title,Course Section,Sched Type,Term,A+,A,A-,B+,B,B-,C+,C,C-,D+,D,D-,F,W,Average Grade,Primary Instructor)"
//        db.execSQL(createTableGPA)
//    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        // Handle database schema upgrades here
    }

    fun insertData(name: String) {
        val db = writableDatabase
        val insertQuery = "INSERT INTO MyTable (name) VALUES ('$name')"
        db.execSQL(insertQuery)
        db.close()
    }
}

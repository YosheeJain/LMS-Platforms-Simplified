package com.example.lms
import com.opencsv.CSVReader
import java.io.InputStreamReader
import android.content.res.AssetManager


class CSVParse {
    // parse and add to database here

    fun parseCSV_COURSE_LIST(assetManager: AssetManager, filename: String) {
        val csvReader = CSVReader(InputStreamReader(assetManager.open(filename)))
        var line: Array<String> = csvReader.readNext()// lets make it non nullable for now, we'll see if the data has breakpoint
        while(csvReader.readNext() != null) {
            // process the read values
            val Subject = line[3]
            val Number = line[4]
            val Name = line[5]
            val Description = line[6]
            val Credit_Hours = line[7]
            val CRN = line[11]
            val Instructors = line[26]

            // increment
            line = csvReader.readNext()
        }
        csvReader.close()
    }

    fun parseCSV_GPA(assetManager: AssetManager, filename: String) {
        val csvReader = CSVReader(InputStreamReader(assetManager.open(filename)))
        var line: Array<String> = csvReader.readNext()// lets make it non nullable for now, we'll see if the data has breakpoint
        while(csvReader.readNext() != null) {
            // process the read values
            val Subject_GPA = "Subject_GPA"
            val Course_Number = "Course"
            val CRN_GPA = "CRN_GPA"
            val Course_Title = "Course_Title"
            val Course_Section = "Course_Section"
            val Average_Grade = "Average_Grade"
            val Primary_Instructor = "Primary_Instructor"

            // increment
            line = csvReader.readNext()
        }
        csvReader.close()
    }
}
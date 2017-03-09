/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca1attendanceprogram.DAL;

import ca1attendanceprogram.BE.Student;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Mecaa
 */
public class StudentHandler {

    private ArrayList<Student> studentData = new ArrayList();

    public StudentHandler() {
        try {
            readStudents();
        } catch (IOException ex) {
            Logger.getLogger(StudentHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void readStudents() throws IOException {
        //a try/catch block
        try (BufferedReader studFile
                = new BufferedReader(new FileReader("DATA/StudentNames.csv"))) {
            studFile.readLine();// Throws away the header, first line.
            String dataLine = studFile.readLine();
            int i = 0;
            while (dataLine != null) { //process all lines
                i++;
                String[] splitData = dataLine.split(",");

                String name = splitData[0] + " " + splitData[1];

                studentData.add(
                        new Student("name", "email", i, "pas", name)
                );

                dataLine = studFile.readLine();
            }
        }
    }

    public ArrayList<Student> getStudents() {
        return studentData;
    }

}

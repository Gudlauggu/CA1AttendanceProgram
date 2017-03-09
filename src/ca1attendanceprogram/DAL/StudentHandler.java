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
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
    
    SQLConnectionManager conManager;

    private ArrayList<Student> studentData = new ArrayList();
    
    public StudentHandler()
      {
        conManager = new SQLConnectionManager();

      }
    
    
    public ArrayList<String> getStudent()
      {
        try (Connection con = conManager.getConnection())
          {
            String query = "SELECT * FROM [Student]";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            ArrayList<String> students = new ArrayList<>();
            while (rs.next())
              {
                String studentString = "";
                studentString += rs.getString("id") + " ";
                studentString += rs.getString("Name") + " ";
                studentString += rs.getString("username" + " ");
                studentString += rs.getString("password");
                students.add(studentString);
              }
            return students;
          } catch (SQLException sqle)
          {
            System.err.println(sqle);
            return null;
          }
      }
    
    public ArrayList<String> getStudUsername()
      {
        try (Connection con = conManager.getConnection())
          {
            String query = "SELECT * FROM [Student]";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            ArrayList<String> students = new ArrayList<>();
            while (rs.next())
              {
                String studentString = "";
                
                studentString += rs.getString("username" + " ");
               
                students.add(studentString);
              }
            return students;
          } catch (SQLException sqle)
          {
            System.err.println(sqle);
            return null;
          }
      }
    
    public ArrayList<String> getStudPassword()
      {
        try (Connection con = conManager.getConnection())
          {
            String query = "SELECT * FROM [Student]";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            ArrayList<String> students = new ArrayList<>();
            while (rs.next())
              {
                String studentString = "";
                studentString += rs.getString("password");
                students.add(studentString);
              }
            return students;
          } catch (SQLException sqle)
          {
            System.err.println(sqle);
            return null;
          }
      }

//    public StudentHandler() {
//        try {
//            readStudents();
//        } catch (IOException ex) {
//            Logger.getLogger(StudentHandler.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca1attendanceprogram.DAL;

import ca1attendanceprogram.BE.Person;
import ca1attendanceprogram.BE.Student;
import ca1attendanceprogram.BE.Teacher;
import java.util.ArrayList;

/**
 *
 * @author Mechaa
 */
public class LoginHandler {

    private static final int NOT_LOGGED_IN = 1;
    private static final int LOGGED_IN_STUDENT = 2;
    private static final int WRONG_PASSWORD = 3;
    private static final int LOGGED_IN_TEACHER = 4;

    StudentHandler dm = new StudentHandler();
          
    //private ArrayList<Person> persons = new ArrayList();
    
    private ArrayList<String> students = dm.getStudent();
    //private Student testStudent = new Student("Stud1234", "stud9874@easv365", 1, "pas", "Student Tester");
    ;
    //private Teacher testTeacher = new Teacher("Teac1234", "Teac1234@easv365", 2, "pas", "Teacher Tester");

    ;

    public LoginHandler() {

//        persons.add(testStudent);
//        persons.add(testTeacher);

        
        for (String student : students)
          {
            
              System.out.println(student);
          }
        
    }

//    public Student LoginChecker(String username, String password) {
//        for (String student : students) {
//            if (student.getUserName().equals(username)) {
//                if (student.getPassword().equals(password)) {
//                    return student;
//                }
//            }
//        }
//        return null;
//    }
    
    public String LoginChecker (String username, String password)
      {
          for (String student : students)
            {
              if(dm.getStudUsername().equals(username)){
                  if(dm.getStudPassword().equals(password))
                      return student;
              }
            }
          return null;
      }
}

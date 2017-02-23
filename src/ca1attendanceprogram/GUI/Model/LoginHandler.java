/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca1attendanceprogram.GUI.Model;

import ca1attendanceprogram.BE.Person;
import ca1attendanceprogram.BE.Student;
import ca1attendanceprogram.BE.Teacher;
import java.util.ArrayList;

/**
 *
 * @author Mechaa
 */
public class LoginHandler {

    private ArrayList<Person> persons = new ArrayList();
    private Student testStudent;
    private Teacher testTeacher;

    public LoginHandler() {
        this.testStudent = new Student("stud1234", "stud9874@easv365", 1, "password", "Student Tester");
        this.testTeacher = new Teacher("Teac1234", "Teac1234@easv365", 2, "password", "name");
        persons.add(testStudent);
        persons.add(testTeacher);
    }

}

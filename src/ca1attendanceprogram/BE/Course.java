/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca1attendanceprogram.BE;

import java.util.ArrayList;

/**
 *
 * @author Mecaa
 */
public class Course {

    private String name;
    private String abreviation;
    private ArrayList<Student> students;
    private ArrayList<Lesson> lessons;

    public Course(String name, String abreviation, ArrayList<Student> students) {
        this.name = name;
        this.abreviation = abreviation;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbreviation() {
        return abreviation;
    }

    public void setAbreviation(String abreviation) {
        this.abreviation = abreviation;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student stud) {
        this.students.add(stud);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca1attendanceprogram.BE;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Mechaa
 */
public class Lesson {

    private Teacher teacher;
    private ArrayList<Student> students = new ArrayList();
    private Date date;

    public Lesson(Teacher teacher, Date date) {
        this.teacher = teacher;
        this.date = date;

    }

    public Teacher getTeacher() {
        return teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Date getDate() {
        return date;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}

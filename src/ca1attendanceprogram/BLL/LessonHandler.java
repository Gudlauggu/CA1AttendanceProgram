/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca1attendanceprogram.BLL;

import ca1attendanceprogram.BE.Lesson;
import ca1attendanceprogram.BE.Student;
import java.util.ArrayList;

/**
 *
 * @author Mechaa
 */
public class LessonHandler {

    private ArrayList<Lesson> lessons = new ArrayList();

    public LessonHandler() {
        for (int i = 0; i < 10; i++) {
            Lesson lesson = new Lesson("Jeppe Moritz Led", "SCO");
            lesson.getStudents().add(new Student("stev1234", "Email", 0, "", "Steven Nielsen"));
            lessons.add(lesson);
        }
    }

    public ArrayList<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(ArrayList<Lesson> lessons) {
        this.lessons = lessons;
    }

}

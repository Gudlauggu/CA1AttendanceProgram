/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca1attendanceprogram.BLL;

import ca1attendanceprogram.BE.Lesson;
import ca1attendanceprogram.DAL.LessonHandler;
import java.util.ArrayList;

/**
 *
 * @author Mecaa
 */
public class LessonManager {

    private LessonHandler lessonHandler = new LessonHandler();

    public ArrayList<Lesson> getLessons() {
        return lessonHandler.getLessons();
    }
}

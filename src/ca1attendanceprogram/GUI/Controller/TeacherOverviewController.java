/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca1attendanceprogram.GUI.Controller;

import ca1attendanceprogram.BE.Student;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Mecaa
 */
public class TeacherOverviewController implements Initializable
{

    @FXML
    private TableView<Student> tblAllLessons;
    @FXML
    private TableColumn<Student, String> clmName;
    @FXML
    private TableColumn<Student, String> clmAbsence;
    @FXML
    private TableColumn<Student, String> clmAttending;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
      {
        makeAStudent();
        updateFields();

      }

    @FXML
    private void logOff(ActionEvent event)
      {
      }

    private void updateFields()
      {
        clmName.setCellValueFactory(
                new PropertyValueFactory("name"));
      }

    private void makeAStudent()
      {
        for (int i = 0; i < 10; i++)
          {
            tblAllLessons.getItems().add(new Student("stefaan" + i, "steven@gmail.com", 1 + i, "***", "Steven Nielssen"));
          }
      }

}

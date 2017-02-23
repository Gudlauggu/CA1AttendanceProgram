/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca1attendanceprogram.GUI.Controller;

import ca1attendanceprogram.BE.Student;
import ca1attendanceprogram.BE.Teacher;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Mechaa
 */
public class AbsenceOverviewController implements Initializable
{

    @FXML
    private TableView<?> tblAllAbsence;//TODO we should make this a Lesson instead of a Student
    @FXML
    private TableColumn<Student, String> clmClass;
    @FXML
    private TableColumn<Teacher, String> clmTeacher;
    @FXML
    private Button btnLogOff;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
      {
        makeATeacher();
        updateFields();

      }

    @FXML
    private void sendRequest(ActionEvent event)
      {
      }

    @FXML
    private void logOff(ActionEvent event)
      {
        Stage stage = (Stage) btnLogOff.getScene().getWindow();
        stage.close();
      }
    
    private void updateFields()
      {
        clmTeacher.setCellValueFactory(
                new PropertyValueFactory("name"));
       
        
      }
    
    private void makeATeacher()
      {
        for (int i = 0; i < 13; i++)
          {
            //tblAllAbsence.getItems().add(new Lesson("", "", 1, "", ""));
            
            
          }
      }

}

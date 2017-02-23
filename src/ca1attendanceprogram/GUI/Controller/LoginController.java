/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca1attendanceprogram.GUI.Controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Mecaa
 */
public class LoginController implements Initializable {

    @FXML
    private TextField txtUsername;
    @FXML
    private TextField txtPassword;
    @FXML
    private CheckBox boxRemUsername;
    @FXML
    private ImageView imgLogo;
    @FXML
    private Button btnLogin;
    @FXML
    private Button btnClose;

    // 0 = not logged int // 1 = logged in // 2 = wrong password, not logged in
    private static final int NOT_LOGGED_IN = 1;
    private static final int LOGGED_IN = 2;
    private static final int WRONG_PASSWORD = 3;
    private int loginState = NOT_LOGGED_IN;

    @FXML
    private Button btnHiddenButton;
    @FXML
    private AnchorPane ancAttendence;
    @FXML
    private Label lblAttendenceAll;
    @FXML
    private Label lblCurrentClass;
    @FXML
    private Label lblClassAttendance;
    @FXML
    private Label lblConfirmation;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Image logo = new Image("file:DATA/BASYDVEST_negativ.png");
        imgLogo.setImage(logo);
    }

    @FXML
    private void loginEvent(ActionEvent event) {
        //Test Login
        if (loginState != LOGGED_IN && txtUsername.getText().equals("Haj")
                && txtPassword.getText().equals("123")) {
            loginState = LOGGED_IN;
            activeState();
        } else if (loginState == NOT_LOGGED_IN && txtUsername.getText().equals("Haj")
                && !txtPassword.getText().equals("123")) {

            loginState = WRONG_PASSWORD;
            activeState();
        } else if (loginState == LOGGED_IN) {

        }
    }

    @FXML
    /**
     * @Param closeEvent a dual event that triggers differently based on
     * loginState
     *
     */
    private void closeEvent(ActionEvent event) {
        if (loginState != LOGGED_IN) {
            Platform.exit();
        }
        if (loginState == LOGGED_IN) {
            loginState = NOT_LOGGED_IN;
            activeState();

        }
    }

    public void activeState() {
        switch (loginState) {
            case LOGGED_IN:
                txtUsername.setDisable(true);
                txtPassword.setDisable(true);
                btnLogin.setText("Attend Class");
                btnClose.setText("Log Off");
                ancAttendence.setVisible(true);
                btnHiddenButton.getStyleClass().remove("button-small");
                btnHiddenButton.getStyleClass().add("button");
                btnHiddenButton.setVisible(true);
                btnHiddenButton.setText("See Absense");
                lblConfirmation.setVisible(false);
                break;
            case NOT_LOGGED_IN:
                txtUsername.setDisable(false);
                txtPassword.setDisable(false);
                if (boxRemUsername.isIndeterminate()) {
                    txtUsername.clear();
                }
                txtPassword.clear();

                ancAttendence.setVisible(false);
                btnHiddenButton.setVisible(false);
                btnLogin.setText("Login");
                btnClose.setText("Quit");
                break;
            case WRONG_PASSWORD:
                btnHiddenButton.setVisible(true);
                btnHiddenButton.setText("Forgotten password?");
                btnHiddenButton.getStyleClass().remove("button");
                btnHiddenButton.getStyleClass().add("button-small");
                break;
        }
    }

    @FXML
    private void HiddenButtonEvent(ActionEvent event) {
        if (loginState == LOGGED_IN) {

        } else if (loginState == WRONG_PASSWORD) {
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Forgotten Password");
            alert.setHeaderText("Email: " + txtUsername.getText() + "@easv365.dk");
            alert.setContentText("Send password to this email");

            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {
                lblConfirmation.setVisible(true);
                lblConfirmation.setText("This Feature is not supported");
            } else {
                // ... user chose CANCEL or closed the dialog
                //Do nothing
            }
        }
    }
}

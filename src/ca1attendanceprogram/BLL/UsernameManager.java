/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca1attendanceprogram.BLL;

import ca1attendanceprogram.DAL.UsernameHandler;
import java.util.ArrayList;

/**
 *
 * @author Mecaa
 */
public class UsernameManager {

    private UsernameHandler userHandler = new UsernameHandler();

    public void saveUsername(String username, String password) {
        userHandler.saveUsername(username, password);
    }
    public ArrayList<String> loadProp(){
    return userHandler.loadProp();
    }
    public void resetFile() {
    userHandler.resetFile();
    }
}

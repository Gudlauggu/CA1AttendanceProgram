/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca1attendanceprogram.BLL;

import ca1attendanceprogram.BE.Person;
import ca1attendanceprogram.DAL.LoginHandler;

/**
 *
 * @author Mecaa
 */
public class LoginManager {

    private LoginHandler loginHandler = new LoginHandler();

    public Person LoginChecker(String username, String password) {
        return loginHandler.LoginChecker(username, password);    
    }
}

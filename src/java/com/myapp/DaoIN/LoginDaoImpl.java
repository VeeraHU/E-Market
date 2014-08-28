/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.DaoIN;

import com.myapp.javaclasses.LoginBean;

/**
 *
 * @author trainee
 */
public interface LoginDaoImpl {

    int loginUser(LoginBean lb);
    String name(LoginBean lb);
    

}

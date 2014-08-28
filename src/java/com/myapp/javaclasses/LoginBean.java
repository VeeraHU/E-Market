/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.javaclasses;

/**
 *
 * @author trainee
 */
public class LoginBean {

    private String userName;
    private String password;
    private int roleId;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

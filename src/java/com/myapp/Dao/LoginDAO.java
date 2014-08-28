
package com.myapp.Dao;

import com.myapp.DaoIN.LoginDaoImpl;
import com.util.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.myapp.javaclasses.LoginBean;


public class LoginDAO implements LoginDaoImpl {

    public int loginUser(LoginBean lb) {
        //throw new UnsupportedOperationException("Not supported yet.");

        int UserId = 0;
        Connection connection = null;
        PreparedStatement pst = null;
        try {
            connection = DBUtil.getConnection();
            pst = connection.prepareStatement("select RoleId,UserId,Name from UserDetails where UserName=? and Password=?");

            pst.setString(1, lb.getUserName());
            pst.setString(2, lb.getPassword());


            ResultSet rs = pst.executeQuery();


            while (rs.next()) {
                UserId = rs.getInt("UserId");
                lb.setRoleId(rs.getInt(1));


                return UserId;
            }

        } catch (Exception e) {
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                pst = null;
                connection = null;

            }

            return UserId;
        }

    }

    public String name(LoginBean lb) {
        //throw new UnsupportedOperationException("Not supported yet.");

        String name = null;
        Connection connection = null;
        PreparedStatement pst = null;
        try {
            connection = DBUtil.getConnection();
            pst = connection.prepareStatement("select Name from UserDetails where UserName=? and Password=?");

            pst.setString(1, lb.getUserName());
            pst.setString(2, lb.getPassword());


            ResultSet rs = pst.executeQuery();


            while (rs.next()) {
                name = rs.getString("Name");
               

            }

        } catch (Exception e) {
        }
        return name;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.Dao;

import com.myapp.DaoIN.BookingOrdersInterface;

import com.util.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.myapp.javaclasses.BookingOrdersBean;

/**
 *
 * @author trainee
 */
public class BookingOrdersDAOImplementation implements BookingOrdersInterface {

    public List bookingOrders(BookingOrdersBean bob) {
       // throw new UnsupportedOperationException("Not supported yet.");

          List ls = new ArrayList();

        try{
             Connection connection = DBUtil.getConnection();
            System.out.println("connection" + connection);

            PreparedStatement pst = connection.prepareStatement("select BookingId, UserDetails.Name,VegetableDetails.VegetableName,Booking.BookingQuantity from Booking INNER JOIN UserDetails ON Booking.UserId = UserDetails.UserId INNER JOIN VegetableDetails ON Booking.VegetableId=VegetableDetails.VegetableId where Booking.BookingTo=?");

            pst.setString(1, bob.getUserId());

            ResultSet rs = pst.executeQuery();
            

            while(rs.next()){
                BookingOrdersBean bob1 = new  BookingOrdersBean();

                bob1.setBookingId(rs.getString(1));
                bob1.setName(rs.getString(2));
                bob1.setVegetableName(rs.getString(3));
                bob1.setVegetableQuantity(rs.getInt(4));

                ls.add(bob1);
            }


        }catch(Exception e){

            e.printStackTrace();
        }

        return ls;

    }



}

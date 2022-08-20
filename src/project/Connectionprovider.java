/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Deepika
 */
public class Connectionprovider {
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver"); //dynamically load the driver's class file into memory,which automatically registers it
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel","root","Deepika@123"); //establish connection to database by using the given database url
            return con;
            
        }
        catch(Exception  e)
        {
            return null;
        }
       
    }
    
 }

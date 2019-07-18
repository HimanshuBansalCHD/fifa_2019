/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packg;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author jishant
 */
public class Conn 
{
            public static Connection getCon()
            {
            Connection con;
            con =null;
            String driverName = "org.apache.hive.jdbc.HiveDriver";	      	
            try 
            {
                
                
                Class.forName(driverName);
		con = DriverManager.getConnection("jdbc:hive2://localhost:10000/DB", "hive", "");
                   return con;
            }
            catch(Exception e)
            {
               System.out.println("Error While Connecting");
            }
            return con;
            }
}

    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author User
 */
public class DBconnect {
    public static Connection connect (){
        
        Connection conn = null;
        
        try{
            Class.forName("com.mysql.jdbc.driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tutionclass?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]","","");
        }catch (Exception e){
            
        }
        
        
        return conn;
    }
}

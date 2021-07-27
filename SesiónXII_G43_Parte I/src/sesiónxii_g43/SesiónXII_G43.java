/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesiónxii_g43;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author apmejiar
 */
public class SesiónXII_G43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String driver = "com.mysql.cj.jdbc.Driver";
        String user = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/gestion_usuarios_db";
        Connection connection;
        
        try{
            Class.forName(driver);
            connection = (Connection) DriverManager.getConnection(url, user, password);
            if (connection != null) {
                System.out.println("Conexión exitosa");
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("No se pudo establecer conexión");
        }
    }
    
}

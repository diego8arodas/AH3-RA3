/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author diego
 */
public class Conexion {

    Connection con;
    String url = "jdbc:mysql://localhost:3306/evalti";
    String user = "root";
    String pass = "";

    public Connection Conectar() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.out.println("No funciona");
        }
        return con;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Hamilton
 */
public class ConexaoDAO {

    public Connection conectaBD() {
        Connection con = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/db_usuarios?user=root&password=projetopronatec123";
            con = DriverManager.getConnection(url);
            
                    
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"ConexaoDAO" + erro.getMessage());
        }  
        return con;
    }   
}

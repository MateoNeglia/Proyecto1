/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Digital Gate
 */
public class Connex {
    private String USERNAME="root";
    private String PASS = "MDNmdn1234";
    private String HOST = "localhost";
    private String PORT = "3306";
    private String DATABASE = "loginjsp";
    private String CLASSNAME = "com.mysql.jdbc.Driver";
    private String URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
    private Connection con;
    
    
    public Connex(){
        try {
            Class.forName(CLASSNAME);
            con = DriverManager.getConnection(URL, USERNAME, PASS);
            
        }catch (ClassNotFoundException e){
            System.err.println("ERROR"+e);
        }catch (SQLException e){
            System.err.println("ERROR"+e);
        }
    }
    
    public Connection getConnex(){
        return con;
    }
            
    public static void main (String[] args ){
        Connex conn = new Connex();
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author temporario
 */
public class Connection extends Database{
    private Connection con;
    
    public Connection(){
        openCon();
    }
    
    protected void finalize(){
        System.out.println("destructor");
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    private void openCon(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        this.setCon((Connection) DriverManager.getConnection("jdbc:mysql://"+this.getHostName()+"/"+this.getDatabase(),this.getUserName(),this.getPassword()));
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println(ex);
        }
    }
    private void closeCon(){
       
    }
}

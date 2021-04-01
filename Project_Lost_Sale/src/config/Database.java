/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

/**
 *
 * @author temporario
 */
public class Database {
    
    private String hostName;
    private String userName;
    private String password;
    private String database;
    
    public Database(){
        this.setDatabase("comand28_DDE");
        this.setHostName("162.241.203.62");
        this.setPassword("ifrodde");
        this.setUserName("comand28_dde");
    }
    
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Huu
 */
public class Config {
    private final String connectionUrl = "jdbc:sqlserver://localhost;" +
                "databaseName=test;integratedSecurity=true;";
    
    private final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    
    private static Config instance = null;
    protected Config() {
        
    }
    public static Config getInstance() {
      if(instance == null) {
         instance = new Config();
      }
      return instance;
   }
    
    public final String getConnectionString(){
        return connectionUrl;
    }
    
    public final String getDriver(){
        return driver;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Huu
 */
public class CaNhanDAO {

    private Config config = Config.getInstance();
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private CallableStatement cstmt = null;
    
    // openc connect
    public void connectPerformed(){
        try {
            // Establish the connection.
            System.out.println("Connectiong ... ");
            Class.forName(config.getDriver());
            conn = DriverManager.getConnection(config.getConnectionString());
            System.out.println("Connected");
            // Create and execute an SQL statement that returns some data.
                                  
        }
        // Handle any errors that may have occurred.
        catch (Exception e) {
            System.out.println("---------- CONNECTION ERROR \"----------");
            e.printStackTrace();
        }
    }
    
    // close connect
    public void closeConnection(){
        if (rs != null) try { rs.close(); } catch(Exception e) {}
        if (stmt != null) try { stmt.close(); } catch(Exception e) {}
        if(cstmt != null) try { cstmt.close(); } catch(Exception e) {}
        if (conn != null) try { conn.close(); } catch(Exception e) {}
    }
    
    public int insertCaNhan(CaNhanDTO caNhan){
        connectPerformed();
        try{
            
            String sql = "{call spThemCaNhan(?,?,?,?,?,?,?)}";
            cstmt = conn.prepareCall(sql);   
            cstmt.setString(1,caNhan.getTenKh());
            cstmt.setString(2,caNhan.getSoDienThoai());
            cstmt.setString(3,caNhan.getDiaChi());
            cstmt.setString(4,caNhan.getSoCmnd());
            cstmt.setString(5,caNhan.getTheTinDung());
            cstmt.setString(6,caNhan.getSoTaiKhoan());
            cstmt.setString(7,caNhan.getCmndNguoiDaiDien());
            int n = cstmt.executeUpdate();
            return n;
        }catch(Exception e){
            System.out.println("---------- ERROR \"----------");
            e.printStackTrace();
            return 0;
        }
        finally{
            closeConnection();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;

import DTO.*;
import java.util.ArrayList;
/**
 *
 * @author Huu
 */
public class KhachHangDAO {  
   
    
    Config config = Config.getInstance();
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    CallableStatement cstmt = null;
    
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
    
    public ArrayList<KhachHangDTO> getKhachHangByName(String name){
        ArrayList<KhachHangDTO> dsKh = new ArrayList<KhachHangDTO>();
        connectPerformed();
        try{
            String sql = "SELECT * FROM KhachHang WHERE TenKH LIKE '%" + name + "%'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            if(rs != null){
                while(rs.next()){
                    int maKh = rs.getInt(1);
                    String tenKh = rs.getString(2);
                    String soDienThoai = rs.getString(3);
                    String diaChi = rs.getString(4);
                    KhachHangDTO kh = new KhachHangDTO();
                    kh.setMaKhachHang(maKh);
                    kh.setDiaChi(diaChi);
                    kh.setSoDienThoai(soDienThoai);
                    kh.setTenKh(tenKh);
                    System.out.print(tenKh);
                    dsKh.add(kh);
                }
            }
            
        }catch(Exception e){
            System.out.println("---------- ERROR \"----------");
            e.printStackTrace();
        }
        finally{
            closeConnection();
        }
        
        return dsKh;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;
import DTO.*;
import DAO.*;
import java.util.ArrayList;
/**
 *
 * @author Huu
 */
public class KhachHangBUS {
    private static KhachHangDAO khachHangDAO = new KhachHangDAO();
    public static ArrayList<KhachHangDTO> getKhachHangByName(String name){
        return khachHangDAO.getKhachHangByName(name);
    }
}

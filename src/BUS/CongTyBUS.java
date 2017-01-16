/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.*;
import DTO.*;
/**
 *
 * @author Huu
 */
public class CongTyBUS {
    private static CongTyDAO congTyDAO = new CongTyDAO();
    public static int addCaNhan(CongTyDTO congTyDTO){
        int n = congTyDAO.insertCongTy(congTyDTO);
        return n;
    }
}

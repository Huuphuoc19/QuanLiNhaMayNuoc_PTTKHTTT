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
public class CaNhanBUS {
    private static CaNhanDAO caNhanDAO = new CaNhanDAO();
    public static int addCaNhan(CaNhanDTO caNhan){
        int n = caNhanDAO.insertCaNhan(caNhan);
        return n;
    }
}

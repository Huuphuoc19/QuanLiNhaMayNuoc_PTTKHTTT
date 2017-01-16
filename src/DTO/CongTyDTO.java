/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Huu
 */
public class CongTyDTO extends KhachHangDTO{
    private int maCongTy;
    private String maSoVAT;
    private int thueGTGT;

    public String getMaSoVAT() {
        return maSoVAT;
    }

    public void setMaSoVAT(String maSoVAT) {
        this.maSoVAT = maSoVAT;
    }

    public int getThueGTGT() {
        return thueGTGT;
    }

    public void setThueGTGT(int thueGTGT) {
        this.thueGTGT = thueGTGT;
    }
    
}

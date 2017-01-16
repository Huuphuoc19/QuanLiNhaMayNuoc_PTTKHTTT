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
public class CaNhanDTO extends KhachHangDTO{
    private int maCaNhan;
    private String soCmnd;
    private String theTinDung;
    private String soTaiKhoan;
    private String cmndNguoiDaiDien;

    public String getSoCmnd() {
        return soCmnd;
    }

    public void setSoCmnd(String soCmnd) {
        this.soCmnd = soCmnd;
    }

    public String getTheTinDung() {
        return theTinDung;
    }

    public void setTheTinDung(String theTinDung) {
        this.theTinDung = theTinDung;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getCmndNguoiDaiDien() {
        return cmndNguoiDaiDien;
    }

    public void setCmndNguoiDaiDien(String cmndNguoiDaiDien) {
        this.cmndNguoiDaiDien = cmndNguoiDaiDien;
    }
    
}

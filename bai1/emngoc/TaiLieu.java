/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1.emngoc;

import java.util.Scanner;

/**
 *
 * @author boyqb2212
 */
public class TaiLieu {
    String maTaiLieu;
    String tenNXB;
    int soBanPhatHanh;

    public TaiLieu() {
    }

    public TaiLieu(String maTaiLieu, String tenNXB, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNXB = tenNXB;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }
    public void nhapTT(){
        Scanner Input=new Scanner(System.in);
        System.out.println("Nhap ma tai lieu");
        this.maTaiLieu=Input.nextLine();
        System.out.println("Nhap ten nha xuat ban");
        this.tenNXB=Input.nextLine();
        System.out.println("Nhap so ban phat hanh");
        this.soBanPhatHanh=Input.nextInt();
        Input.nextLine();
    }

    @Override
    public String toString() {
        return "TaiLieu{" + "maTaiLieu=" + maTaiLieu + ", tenNXB=" + tenNXB + ", soBanPhatHanh=" + soBanPhatHanh + '}';
    }
    
}

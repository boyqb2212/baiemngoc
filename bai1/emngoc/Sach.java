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
public class Sach extends TaiLieu {
    String tenTacGia;
    int soTrang;

    public Sach() {
    }

    public Sach(String tenTacGia, int soTrang) {
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public Sach(String tenTacGia, int soTrang, String maTaiLieu, String tenNXB, int soBanPhatHanh) {
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    public void nhapTT(){
        super.nhapTT();
        Scanner Input=new Scanner(System.in);
        System.out.println("Nhap ten tac gia");
        this.tenTacGia=Input.nextLine();
        System.out.println("Nhap so trang");
        this.soTrang=Input.nextInt();
    }

    @Override
    public String toString() {
        return super.toString()+"Sach{" + "tenTacGia=" + tenTacGia + ", soTrang=" + soTrang + '}';
    }
    
}

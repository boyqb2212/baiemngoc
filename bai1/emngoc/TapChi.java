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
public class TapChi extends TaiLieu{
    int soPhatHanh;
    int thangPhatHanh;

    public TapChi() {
    }

    public TapChi(int soPhatHanh, int thangPhatHanh) {
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public TapChi(int soPhatHanh, int thangPhatHanh, String maTaiLieu, String tenNXB, int soBanPhatHanh) {
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }
    public void nhapTT(){
        super.nhapTT();
        Scanner Input=new Scanner(System.in);
        System.out.println("Nhap so phat hanh");
        this.soPhatHanh=Input.nextInt();
        System.out.println("Nhap thang phat hanh");
        this.thangPhatHanh=Input.nextInt();
    }

    @Override
    public String toString() {
        return super.toString()+"TapChi{" + "soPhatHanh=" + soPhatHanh + ", thangPhatHanh=" + thangPhatHanh + '}';
    }
    
}

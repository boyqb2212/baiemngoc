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
public class Bao extends TaiLieu{
    String ngayPhatHanh;

    public Bao() {
    }

    public Bao(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Bao(String ngayPhatHanh, String maTaiLieu, String tenNXB, int soBanPhatHanh) {
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }
    public void nhapTT(){
        super.nhapTT();
        Scanner Input=new Scanner(System.in);
        System.out.println("Nhap ngay phat hanh");
        Input.nextLine();
        this.ngayPhatHanh=Input.nextLine();
    }

    @Override
    public String toString() {
        return super.toString()+"Bao{" + "ngayPhatHanh=" + ngayPhatHanh + '}';
    }
    
}

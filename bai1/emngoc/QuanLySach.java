/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1.emngoc;

import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author boyqb2212
 */
public class QuanLySach {
    ArrayList <TaiLieu> quanly;

    public QuanLySach() {
    }

    public QuanLySach(ArrayList<TaiLieu> quanly) {
        this.quanly = quanly;
    }

    public ArrayList<TaiLieu> getQuanly() {
        return quanly;
    }

    public void setQuanly(ArrayList<TaiLieu> quanly) {
        this.quanly = quanly;
    }
    public void QLS(){
        Scanner Input=new Scanner(System.in);
        this.quanly=new ArrayList<>();
        while(true){
        System.out.println("1.Nhap thong tin tai lieu");
        System.out.println("2.Hien thi thong tin tai lieu");
        System.out.println("3.Tim kiem tai lieu");
        System.out.println("4.Thoat");
        int luachon=Input.nextInt();
        switch(luachon){
            case 1:{
                System.out.println("5.Sach");
                System.out.println("6.Tap chi");
                System.out.println("7.Bao");
                int luachon1=Input.nextInt();
                switch(luachon1){
                    case 5:{
                        Sach s=new Sach();
                        s.nhapTT();
                        this.quanly.add(s);
                    }break;
                    case 6:{
                        TapChi s=new TapChi();
                        s.nhapTT();
                        this.quanly.add(s);
                    }break;
                    case 7:{
                        Bao s=new Bao();
                        s.nhapTT();
                        this.quanly.add(s);
                    }break;
                }
            }break;
            case 2:{
                for(TaiLieu x:this.quanly){
                    System.out.println(x);
                }
                
            }break;
            case 3:{
                System.out.println("8.Sach");
                System.out.println("9.Tap chi");
                System.out.println("10.Bao");
                int luachon2=Input.nextInt();
                switch(luachon2){
                    case 8:{
                        for(TaiLieu x:this.quanly){
                            if(x instanceof Sach){
                                System.out.println(x.toString());
                            }
                        }
                    }break;
                    case 9:{
                        for(TaiLieu x:this.quanly){
                            if(x instanceof TapChi){
                                System.out.println(x.toString());
                            }
                        }
                    }break;
                    case 10:{
                        for(TaiLieu x:this.quanly){
                            if(x instanceof Bao){
                                System.out.println(x.toString());
                            }
                        }
                    }break;
                }
                
            }break;
            case 4:{
                
                exit(0);
            }
        }
    }
    
}
}

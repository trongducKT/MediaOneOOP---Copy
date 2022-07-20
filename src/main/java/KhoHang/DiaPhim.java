package KhoHang;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author minhd
 */
public class DiaPhim extends SanPham {

    String daodien, dienvien;
    String theloai;
    int namsanxuat;

    public DiaPhim() {
    }

    public String getDaodien() {
        return daodien;
    }

    public void setDaodien(String daodien) {
        this.daodien = daodien;
    }

    public String getDienvien() {
        return dienvien;
    }

    public void setDienvien(String dienvien) {
        this.dienvien = dienvien;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public int getNamsanxuat() {
        return namsanxuat;
    }

    public void setNamsanxuat(int namsanxuat) {
        this.namsanxuat = namsanxuat;
    }

    public DiaPhim(String daodien, String dienvien, String theloai, int namsanxuat) {
        this.daodien = daodien;
        this.dienvien = dienvien;
        this.theloai = theloai;
        this.namsanxuat = namsanxuat;
    }
//    public void thongtin()
//    {
//        System.out.println("Ten dao dien: "+ daodien);
//        System.out.println("Ten dien vien: " +dienvien);
//        System.out.println("The loai phim: "+theloai);
//        System.out.println("Nam san xuat: "+namsanxuat);
//        super.thongtin();
//    }
}

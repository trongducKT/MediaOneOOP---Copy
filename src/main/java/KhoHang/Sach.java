package KhoHang;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author minhd
 */
public class Sach extends SanPham {

    String tentacgia, nhaxuatban;
    String theloai;
    int namphathanh;

    public Sach() {
    }

    public String getTentacgia() {
        return tentacgia;
    }

    public void setTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }

    public String getNhaxuatban() {
        return nhaxuatban;
    }

    public void setNhaxuatban(String nhaxuatban) {
        this.nhaxuatban = nhaxuatban;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public int getNamphathanh() {
        return namphathanh;
    }

    public void setNamphathanh(int namphathanh) {
        this.namphathanh = namphathanh;
    }

    public Sach(String tentacgia, String nhaxuatban, String theloai, int namphathanh) {
        this.tentacgia = tentacgia;
        this.nhaxuatban = nhaxuatban;
        this.theloai = theloai;
        this.namphathanh = namphathanh;
    }

    /**
     *
     */
//    @Override
//    public void thongtin()
//    {
//        System.out.println("Ten tac gia: "+tentacgia);
//        System.out.println("Ten nha xuat ban: "+nhaxuatban);
//        System.out.println("The loai sach: "+theloai);
//        System.out.println("Nam phat hanh: "+namphathanh);
//        super.thongtin();
//    }
}

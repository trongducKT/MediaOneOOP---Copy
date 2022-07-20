package KhoHang;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author minhd
 */
public class DiaNhac extends SanPham {

    String tencasi;
    String theloai;
    int namphathanh;

    public DiaNhac() {
    }

    public String getTencasi() {
        return tencasi;
    }

    public void setTencasi(String tencasi) {
        this.tencasi = tencasi;
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

    public DiaNhac(String tencasi, String theloai, int namphathanh) {
        this.tencasi = tencasi;
        this.theloai = theloai;
        this.namphathanh = namphathanh;
    }
//    public void thongtin()
//    {
//        System.out.println("Ten ca si: "+tencasi);
//        System.out.println("The loai nhac: "+theloai);
//        System.out.println("Nam phat hanh: "+namphathanh);
//        super.thongtin();
//    }    
}

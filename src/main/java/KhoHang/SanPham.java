package KhoHang;

public class SanPham {

    public SanPham() {
    }

    private String tensanpham;
    private int gianhap, giaban;
    private int soluong = 0;

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    public int getGianhap() {
        return gianhap;
    }

    public void setGianhap(int gianhap) {
        this.gianhap = gianhap;
    }

    public int getGiaban() {
        return giaban;
    }

    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }

    public int getSoluong() {
        return soluong;
    }
    
    public void setSoLuong(int soLuongMoi){
        this.soluong = soLuongMoi;
    }

    public String getTheloai() {
        return "";
    }

//    public void setSoluong(int soluong) {
//        this.soluong = soluong;
//    }
    public SanPham(String tensanpham, int gianhap, int giaban) {
        this.tensanpham = tensanpham;
        this.gianhap = gianhap;
        this.giaban = giaban;
        //this.soluong = soluong;
    }

}

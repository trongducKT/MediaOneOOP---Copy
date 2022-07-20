package DoanhThu;

import KhoHang.SanPham;

import java.util.Date;

public class SuKien {

    private String tenSuKien;
    private String loaiSuKien;

    public SuKien(String tenSK, String loaiSK) {
        this.tenSuKien = tenSK;
        this.loaiSuKien = loaiSK;
    }

    public String getTenSuKien() {
        return this.tenSuKien;
    }

    public String getLoaiSuKien() {
        return this.loaiSuKien;
    }

    public void setTenSuKien(String tenSuKien) {
        this.tenSuKien = tenSuKien;
    }

    public void setLoaiSuKien(String loaiSuKien) {
        this.loaiSuKien = loaiSuKien;
    }
//    public SuKien() {
//    }
//
//    private SanPham sp;
//    private Date ngay;
//    private String hanhdong;
//    private int soluong_hd;
//
//    public int getSoluong_hd() {
//        return soluong_hd;
//    }
//
//    public void setSoluong_hd(int soluong_hd) {
//        this.soluong_hd = soluong_hd;
//    }
//
//    public SanPham getSp() {
//        return sp;
//    }
//
//    public void setSp(SanPham sp) {
//        this.sp = sp;
//    }
//
//    public Date getNgay() {
//        return ngay;
//    }
//
//    public void setNgay(Date ngay) {
//        this.ngay = ngay;
//    }
//
//    public String getHanhdong() {
//        return hanhdong;
//    }
//
//    public void setHanhdong(String hanhdong) {
//        this.hanhdong = hanhdong;
//    }
//
//    public SuKien(SanPham sp, Date ngay, String hanhdong, int soluong_hd) {
//        this.sp = sp;
//        this.ngay = ngay;
//        this.hanhdong = hanhdong;
//        this.soluong_hd = soluong_hd;
//    }
//
//    public void isRealSK() {
//        if (this.hanhdong.equals("mua")) {
//            this.sp.setSoLuong(this.sp.getSoluong() + this.soluong_hd);
//        } else if (this.hanhdong.equals("ban") & this.sp.getSoluong() > this.soluong_hd - 1) {
//            this.sp.setSoLuong(this.sp.getSoluong() - this.soluong_hd);
//        }
//    }
}

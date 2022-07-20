package NhanVien;

public class NhanVienCoDinh extends NhanVien {

    private String viTri;

    private double heSoLuong;

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }
    private static double luongCoBan = 5000000;

    public NhanVienCoDinh() {
    }

    public void setLuongCoBan(double s) {
        luongCoBan = s;
    }

    public double getLuongCoBan() {
        return this.luongCoBan;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }
    public String getLoaiNhanVien(){
       return "Full-time";
    }

    public NhanVienCoDinh(String name, String viTri, double heSoLuong) {
        super.setTenNhanVien(name);
        this.viTri = viTri;
        this.heSoLuong = heSoLuong;
    }
}

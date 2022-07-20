package NhanVien;

public class NVPartTime extends NhanVien {

    private double thoiGianLamViec;
    private static double luongTheoGio=18000;

    public NVPartTime() {
    }

    public void setLuongTheoGio(double s) {
        luongTheoGio = s;
    }

    public double getThoiGianLamViec() {
        return thoiGianLamViec;
    }

    public double getLuongTheoGio() {
        return this.luongTheoGio;
    }

    public void setThoiGianLamViec(double s) {
        this.thoiGianLamViec = s;
    }

    @Override
    public double tinhLuong() {
        return this.thoiGianLamViec * luongTheoGio;
    }
    @Override
    public String getLoaiNhanVien(){
       return "Part-time";
    }
    public NVPartTime(String name, double thoiGianLamViec) {
        setTenNhanVien(name);
        this.thoiGianLamViec = thoiGianLamViec;
    }
}

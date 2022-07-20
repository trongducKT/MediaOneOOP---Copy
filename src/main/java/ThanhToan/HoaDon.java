/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThanhToan;

/**
 *
 * @author minhd
 */
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HoaDon {

    private LocalDateTime ngay;
    private ArrayList<String> danhSachSanPham;
    private ArrayList<Integer> danhSachSoLuong;
    private ArrayList<Double> danhSachGia;

    public HoaDon() {
        this.ngay = LocalDateTime.now();
        this.danhSachSanPham = new ArrayList<>();
        this.danhSachSoLuong = new ArrayList<>();
        this.danhSachGia = new ArrayList<>();
    }

    public double tongHoaDon() {
        Double tongHoaDon = 0D;
        for (int i = 0; i < danhSachSanPham.size(); ++i) {
            tongHoaDon += danhSachSoLuong.get(i) * danhSachGia.get(i);
        }
        return tongHoaDon;
    }

    public ArrayList<String> getDanhSachSanPham() {
        return this.danhSachSanPham;
    }

    public ArrayList<Integer> getDanhSachSoLuong() {
        return this.danhSachSoLuong;
    }

    public ArrayList<Double> getDanhSachGia() {
        return this.danhSachGia;
    }

    public String ngayThanhToan() {
        return this.ngay.format(DateTimeFormatter.ISO_DATE);
    }
}

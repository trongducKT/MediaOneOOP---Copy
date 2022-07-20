/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoanhThu;

import IO.IO;
import ThongBao.ThongBao;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author XPS
 */
public class QuanLySuKien {

    private ArrayList<SuKienMotLan> dsSKML;
    private ArrayList<SuKienDinhKy> dsSKDK;

    public QuanLySuKien() {
        IO IO = new IO();
        this.dsSKML = IO.docSKMotLan();
        this.dsSKDK = IO.docSKDinhKy();
    }

    public ArrayList<SuKienMotLan> getThongKeSuKien(LocalDateTime start, LocalDateTime end) {
        ArrayList<SuKienMotLan> dsThongKeSuKien = new ArrayList<>();
        for (SuKienMotLan obj : dsSKML) {
            if ((obj.getDate()).compareTo(start) >= 0 && (obj.getDate()).compareTo(end) < 0) {
                dsThongKeSuKien.add(obj);
            }
        }
        return dsThongKeSuKien;
    }

    private boolean isSameDay(LocalDateTime a, LocalDateTime b) {
        LocalDateTime c = LocalDateTime.of(a.getDayOfYear(), a.getMonthValue(), a.getDayOfMonth(), 0, 0, 0);
        LocalDateTime d = LocalDateTime.of(a.getDayOfYear(), a.getMonthValue(), a.getDayOfMonth(), 23, 59, 59);
        return b.isAfter(c) && b.isBefore(d);
    }

    public void checkSKDK() {
        LocalDateTime tdht = LocalDateTime.now();
        IO io = new IO();
        ArrayList<ThongBao> tb = io.docThongBao();
        for (SuKienDinhKy skdk : dsSKDK) {
            if (isSameDay(tdht, skdk.getNgayTiepTheo())) {
                tb.add(new ThongBao(skdk.getTenSuKien(), false));
                if (skdk instanceof SuKienHangThang) {
                    skdk.setNgayTiepTheo(skdk.getNgayTiepTheo().plusMonths(1));
                } else if (skdk instanceof SuKienTheoChuKy) {
                    SuKienTheoChuKy skdk1 = (SuKienTheoChuKy) skdk;
                    skdk.setNgayTiepTheo(skdk.getNgayTiepTheo().plusDays(skdk1.getSoNgayMotChuKy()));
                }
            }
        }
        io.ghiSKDinhKy(dsSKDK);
    }

    public int getDoanhThu(LocalDateTime start, LocalDateTime end) {
        int doanhthu = 0;
        for (SuKienMotLan obj : this.getThongKeSuKien(start, end)) {
            if ((obj.getLoaiSuKien()).equals("Bán")) {
                doanhthu += obj.getGiatri();
            }
        }
        return doanhthu;
    }

    public int getLoiNhuan(LocalDateTime start, LocalDateTime end) {
        int doanhthu = 0;
        for (SuKienMotLan obj : this.getThongKeSuKien(start, end)) {
            if ((obj.getLoaiSuKien()).equals("Bán")) {
                doanhthu += obj.getGiatri();
            } else {
                doanhthu -= obj.getGiatri();
            }
        }
        return doanhthu;
    }

    public void themSKML(SuKienMotLan skml) {
        this.dsSKML.add(skml);
        IO io = new IO();
        io.ghiSKMotLan(this.dsSKML);
    }

    public void themSKDK(SuKienDinhKy skdk) {
        this.dsSKDK.add(skdk);
        IO io = new IO();
        io.ghiSKDinhKy(this.dsSKDK);
    }

    public void xoaSKDK(String tenSK) {
        for (int i = 0; i < this.dsSKDK.size(); ++i) {
            SuKienDinhKy skdk = this.dsSKDK.get(i);
            if (skdk.getTenSuKien().equals(tenSK)) {
                this.dsSKDK.remove(i);
                break;
            }
        }
        IO io = new IO();
        io.ghiSKDinhKy(dsSKDK);
    }

    public ArrayList<SuKienMotLan> getDanhSachSuKienMotLan() {
        return this.dsSKML;
    }

    public void setDanhSachSuKienMotLan(ArrayList<SuKienMotLan> s) {
        this.dsSKML = s;
    }

    public ArrayList<SuKienDinhKy> getDanhSachSuKienDinhKy() {
        return this.dsSKDK;
    }

    public void setDanhSachSuKienDinhKy(ArrayList<SuKienDinhKy> s) {
        this.dsSKDK = s;
    }
}

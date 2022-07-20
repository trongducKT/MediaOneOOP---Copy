/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoanhThu;

import java.time.LocalDateTime;

/**
 *
 * @author XPS
 */
public class SuKienTheoChuKy extends SuKienDinhKy {

    private int soNgayMotChuKy;

    public SuKienTheoChuKy(String tenSK, String loaiSK, LocalDateTime ngayBatDau, int soNgayMotChuKy) {
        super(ngayBatDau, tenSK, loaiSK);
        this.soNgayMotChuKy = soNgayMotChuKy;
    }
    
    public int getSoNgayMotChuKy(){
        return this.soNgayMotChuKy;
    }
}

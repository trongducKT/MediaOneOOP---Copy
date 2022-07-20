/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KhoHang;

import DoanhThu.SuKienMotLan;
import IO.IO;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class KhoHang {
    ArrayList<SanPham> danhsachsanpham;
    private ArrayList<SuKienMotLan> listSanPham_SuKien;
    public KhoHang(){
        IO fileIO = new IO();
        this.danhsachsanpham = fileIO.docSP();
        this.listSanPham_SuKien = fileIO.docSKMotLan();
    }
    public void themSP(SanPham sp){
        this.danhsachsanpham.add(sp);
    }
    public ArrayList getdanhsachsanpham(){
        return this.danhsachsanpham;
    }
    public ArrayList getlistSanPham_SuKien(){
        return this.listSanPham_SuKien;
    }
}


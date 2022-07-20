/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThongBao;

import java.util.ArrayList;
import IO.IO;

/**
 *
 * @author XPS
 */
public class QuanLyThongBao {

    ArrayList<ThongBao> danhSachThongBao;
    Integer soThongBaoChuaDoc;

    public QuanLyThongBao() {
        IO fileIO = new IO();
        this.danhSachThongBao = fileIO.docThongBao();
        this.soThongBaoChuaDoc = 0;
        for (ThongBao tb : danhSachThongBao) {
            if (tb.getRead() == false) {
                this.soThongBaoChuaDoc++;
            }
        }
    }

    public void themThongBao(ThongBao tb) {
        this.danhSachThongBao.add(tb);
    }

    public ArrayList<ThongBao> getDanhSachThongBao() {
        return this.danhSachThongBao;
    }

    public void setDanhSachThongBao(ArrayList<ThongBao> t) {
        this.danhSachThongBao = t;
    }

    public Integer getSoThongBaoChuaDoc() {
        return this.soThongBaoChuaDoc;
    }

    public void setSoThongBaoChuaDoc(Integer n) {
        this.soThongBaoChuaDoc = n;
    }
}

package IO;

import DoanhThu.SuKienDinhKy;
import DoanhThu.SuKienHangThang;
import KhoHang.DiaNhac;
import KhoHang.DiaPhim;
import KhoHang.Sach;
import NhanVien.NVPartTime;
import NhanVien.NhanVien;
import NhanVien.NhanVienCoDinh;
import KhoHang.SanPham;
import DoanhThu.SuKienMotLan;
import DoanhThu.SuKienTheoChuKy;
import ThongBao.ThongBao;

import java.io.File;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class IO {

    public void ghiSP(ArrayList<SanPham> list) {
        try ( PrintWriter pw = new PrintWriter(new File("src\\main\\java\\IO\\SP.DAT"))) {
            for (SanPham sp : list) {
                if (sp instanceof Sach) {
                    pw.println(0);
                    pw.println(sp.getTensanpham());
                    pw.println(sp.getGianhap());
                    pw.println(sp.getGiaban());
                    pw.println(sp.getSoluong());
                    pw.println(((Sach) sp).getTentacgia());
                    pw.println(((Sach) sp).getNhaxuatban());
                    pw.println(((Sach) sp).getTheloai());
                    pw.println(((Sach) sp).getNamphathanh());

                } else if (sp instanceof DiaPhim) {
                    pw.println(1);
                    pw.println(sp.getTensanpham());
                    pw.println(sp.getGianhap());
                    pw.println(sp.getGiaban());
                    pw.println(sp.getSoluong());
                    pw.println(((DiaPhim) sp).getDaodien());
                    pw.println(((DiaPhim) sp).getDienvien());
                    pw.println(((DiaPhim) sp).getTheloai());
                    pw.println(((DiaPhim) sp).getNamsanxuat());
                } else if (sp instanceof DiaNhac) {
                    pw.println(2);
                    pw.println(sp.getTensanpham());
                    pw.println(sp.getGianhap());
                    pw.println(sp.getGiaban());
                    pw.println(sp.getSoluong());
                    pw.println(((DiaNhac) sp).getTencasi());
                    pw.println(((DiaNhac) sp).getTheloai());
                    pw.println(((DiaNhac) sp).getNamphathanh());
                }
            }
        } catch (Exception e) {
            System.out.println("got an exception!");
        }
    }

    public ArrayList<SanPham> docSP() {
        ArrayList<SanPham> list = new ArrayList<>();
        try ( Scanner sc = new Scanner(new File("src\\main\\java\\IO\\SP.DAT"))) {
            while (sc.hasNext()) {
                int number = Integer.parseInt(sc.nextLine());
                switch (number) {
                    case 0 -> {
                        Sach sp = new Sach();
                        sp.setTensanpham(sc.nextLine());
                        sp.setGianhap(Integer.parseInt(sc.nextLine()));
                        sp.setGiaban(Integer.parseInt(sc.nextLine()));
                        sp.setSoLuong(Integer.parseInt(sc.nextLine()));
                        sp.setTentacgia(sc.nextLine());
                        sp.setNhaxuatban(sc.nextLine());
                        sp.setTheloai(sc.nextLine());
                        sp.setNamphathanh(Integer.parseInt(sc.nextLine()));
                        list.add(sp);
                    }
                    case 1 -> {
                        DiaPhim sp = new DiaPhim();
                        sp.setTensanpham(sc.nextLine());
                        sp.setGianhap(Integer.parseInt(sc.nextLine()));
                        sp.setGiaban(Integer.parseInt(sc.nextLine()));
                        sp.setSoLuong(Integer.parseInt(sc.nextLine()));
                        sp.setDaodien(sc.nextLine());
                        sp.setDienvien(sc.nextLine());
                        sp.setTheloai(sc.nextLine());
                        sp.setNamsanxuat(Integer.parseInt(sc.nextLine()));
                        list.add(sp);
                    }
                    case 2 -> {
                        DiaNhac sp = new DiaNhac();
                        sp.setTensanpham(sc.nextLine());
                        sp.setGianhap(Integer.parseInt(sc.nextLine()));
                        sp.setGiaban(Integer.parseInt(sc.nextLine()));
                        sp.setSoLuong(Integer.parseInt(sc.nextLine()));
                        sp.setTencasi(sc.nextLine());
                        sp.setTheloai(sc.nextLine());
                        sp.setNamphathanh(Integer.parseInt(sc.nextLine()));
                        list.add(sp);
                    }
                    default -> {
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("got an exception");
        }
        return list;
    }

    public void ghiSKMotLan(ArrayList<SuKienMotLan> dsSuKien) {
        try ( PrintWriter pw = new PrintWriter(new File("src\\main\\java\\IO\\dsSuKienMotLan.csv"))) {
            for (SuKienMotLan sk : dsSuKien) {
                pw.print(sk.getDate().toString() + "," + sk.getTenSuKien() + "," + sk.getLoaiSuKien() + "," + sk.getGiatri() + "\n");
            }
        } catch (Exception e) {
            System.out.println("got an exception!");
        }
    }

    public ArrayList<SuKienMotLan> docSKMotLan() {
        ArrayList<SuKienMotLan> dsSuKienMotLan = new ArrayList<>();

        try ( Scanner sc = new Scanner(new File("src\\main\\java\\IO\\dsSuKienMotLan.csv"))) {
            sc.useDelimiter("\n");
            while (sc.hasNext()) {
                String nextLine = sc.next();
                String cacTruong[] = nextLine.split(",");
                LocalDateTime ngay = LocalDateTime.parse(cacTruong[0]);
                String tenSK = cacTruong[1];
                String loaiSK = cacTruong[2];
                int giaTri = Integer.parseInt(cacTruong[3]);
                SuKienMotLan skml = new SuKienMotLan(ngay, tenSK, loaiSK, giaTri);
                dsSuKienMotLan.add(skml);
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("got an exception");
        }
        return dsSuKienMotLan;

    }

    public void ghiSKDinhKy(ArrayList<SuKienDinhKy> dsSuKien) {
        try ( PrintWriter pw = new PrintWriter(new File("src\\main\\java\\IO\\dsSuKienDinhKy.csv"))) {
            for (SuKienDinhKy sk : dsSuKien) {
                if (sk instanceof SuKienHangThang) {
                    pw.print("0," + sk.getNgayTiepTheo().toString() + "," + sk.getTenSuKien() + "," + sk.getLoaiSuKien()
                            + "," + ((SuKienHangThang) sk).getNgay() + "\n");
                } else if (sk instanceof SuKienTheoChuKy) {
                    pw.print("1," + sk.getNgayTiepTheo().toString() + "," + sk.getTenSuKien() + "," + sk.getLoaiSuKien()
                            + "," + ((SuKienTheoChuKy) sk).getSoNgayMotChuKy() + "\n");
                } else {
                    System.out.println("error");
                }

            }
        } catch (Exception e) {
            System.out.println("got an exception!");
        }
    }

    public ArrayList<SuKienDinhKy> docSKDinhKy() {
        ArrayList<SuKienDinhKy> dsSuKien = new ArrayList<>();
        try ( Scanner sc = new Scanner(new File("src\\main\\java\\IO\\dsSuKienDinhKy.csv"))) {
            sc.useDelimiter("\n");
            while (sc.hasNext()) {
                String nextLine = sc.next();
                String cacTruong[] = nextLine.split(",");
                LocalDateTime ngayTiepTheo = LocalDateTime.parse(cacTruong[1]);
                String tenSK = cacTruong[2];
                String loaiSK = cacTruong[3];
                int songay = Integer.parseInt(cacTruong[4]);
                int loai = Integer.parseInt(cacTruong[0]);
                if (loai == 0) {
                    SuKienHangThang skdk = new SuKienHangThang(tenSK, loaiSK, songay);
                    dsSuKien.add(skdk);
                } else if (loai == 1) {
                    SuKienTheoChuKy skdk = new SuKienTheoChuKy(tenSK, loaiSK, ngayTiepTheo, songay);
                    dsSuKien.add(skdk);
                } else {
                    System.out.print("error");
                }

            }
            sc.close();
        } catch (Exception e) {
            System.out.println("got an exception");
        }
        return dsSuKien;

    }

    public void ghiNV(ArrayList<NhanVien> list) {
        try ( PrintWriter pw = new PrintWriter(new File("src\\main\\java\\IO\\NV.DAT"))) {
            for (NhanVien nv : list) {
                if (nv instanceof NhanVienCoDinh) {
                    pw.println(((NhanVienCoDinh) nv).getLoaiNhanVien());
                    pw.println(nv.getTenNhanVien());
                    pw.println(((NhanVienCoDinh) nv).getViTri());
                    pw.println(((NhanVienCoDinh) nv).getLuongCoBan());
                    pw.println(((NhanVienCoDinh) nv).getHeSoLuong());
                } else if (nv instanceof NVPartTime) {
                    pw.println(((NVPartTime) nv).getLoaiNhanVien());
                    pw.println(nv.getTenNhanVien());
                    pw.println(((NVPartTime) nv).getThoiGianLamViec());
                    pw.println(((NVPartTime) nv).getLuongTheoGio());
                }

            }
        } catch (Exception e) {
            System.out.println("got an exception!");
        }
    }

    public ArrayList<NhanVien> docNV() {
        ArrayList<NhanVien> list = new ArrayList<>();
        try ( Scanner sc = new Scanner(new File("src\\main\\java\\IO\\NV.DAT"))) {
            while (sc.hasNext()) {
                String number =sc.nextLine();
                if (number.equals("Full-time")) {
                    NhanVienCoDinh nv = new NhanVienCoDinh();
                    nv.setTenNhanVien(sc.nextLine());
                    nv.setViTri(sc.nextLine());
                    nv.setLuongCoBan(Double.parseDouble(sc.nextLine()));
                    nv.setHeSoLuong(Double.parseDouble(sc.nextLine()));
                    list.add(nv);
                } else if (number.equals("Part-time")) {
                    NVPartTime nv = new NVPartTime();
                    nv.setTenNhanVien(sc.nextLine());
                    nv.setThoiGianLamViec(Double.parseDouble(sc.nextLine()));
                    list.add(nv);
                }

            }
        } catch (Exception e) {
            System.out.println("got an exception");
        }
        return list;
    }

    public ArrayList<ThongBao> docThongBao() {
        ArrayList<ThongBao> dsThongBao = new ArrayList<>();
        
        try ( Scanner sc = new Scanner(new File("src\\main\\java\\IO\\dsThongBao.csv"))) {

            sc.useDelimiter("\r\n");
            boolean a;
//            System.out.print(sc.hasNext());
            while (sc.hasNext()) {
                String nextLine = sc.next();
//                System.out.print(nextLine);
                String cacTruong[] = nextLine.split(",");
                if(cacTruong[1].toLowerCase().contains("true")){a=true;}else{a=false;}
                dsThongBao.add(new ThongBao(cacTruong[0], a));
            }
            sc.close();

        } catch (Exception e) {
            System.out.println("got an exception");
        }
        return dsThongBao;
    }

    public void ghiThongBao(ArrayList<ThongBao> dsThongBao) {
        try ( PrintWriter pw = new PrintWriter(new File("src\\main\\java\\IO\\dsThongBao.csv"))) {
            for (ThongBao tb : dsThongBao) {
                pw.print(tb.getMessage() + "," + tb.getRead() + "\n");
            }
        } catch (Exception e) {
            System.out.println("got an exception!");
        }
    }

}

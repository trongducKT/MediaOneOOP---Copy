
package NhanVien;
import IO.IO;
import java.util.ArrayList;

public class QuanLyNhanVien {

    private final int MAX_PARTTIME = 15;
    private final int MAX_CODINH = 15;
    ArrayList <NhanVien> danhsachNhanViens;
    IO IO;
    public QuanLyNhanVien(){
       IO = new IO();
       this.danhsachNhanViens = IO.docNV();
    }
    public int getSoNhanVienPartTime() {
        int cout = 0;
        for(NhanVien obj: danhsachNhanViens){
            if(obj instanceof NVPartTime){
               cout++;
            }
        }
        return cout;
    }
    public int getSoNhanVienCoDinh() {
        int cout = 0;
        for(NhanVien obj : danhsachNhanViens){
           if(obj instanceof NhanVienCoDinh) cout++;
        }
        return cout;
    }
    public boolean themNhanVien(NhanVien nv){
         if(nv instanceof NVPartTime){
             if(this.getSoNhanVienPartTime() < this.MAX_PARTTIME){
                danhsachNhanViens.add(nv);
                IO.ghiNV(danhsachNhanViens);
                return true;
             }
             return false;
         }
          if(nv instanceof NhanVienCoDinh){
             if(this.getSoNhanVienCoDinh()< this.MAX_CODINH){
                danhsachNhanViens.add(nv);
                IO.ghiNV(danhsachNhanViens);
                return true;
             }
             return false;
         }
        return false;
    }
    public double tongLuong() {
        double sum = 0;
        for (NhanVien obj: danhsachNhanViens) {
            sum += obj.tinhLuong();
        }
        return sum;
    }
    public boolean changeTG(String tenNhanVien, double time){
        for(NhanVien obj : danhsachNhanViens){
            if(obj.getTenNhanVien().equals(tenNhanVien)){
                if(obj instanceof NVPartTime){
               NVPartTime nvpt = (NVPartTime) obj;
               nvpt.setThoiGianLamViec(time);
               IO.ghiNV(danhsachNhanViens);
               return true;
               }
            }
        }
        return false;
    }
        public boolean traLuong(){
        for(NhanVien obj : danhsachNhanViens){
                if(obj instanceof NVPartTime){
               NVPartTime nvpt = (NVPartTime) obj;
               nvpt.setThoiGianLamViec(0);
               IO.ghiNV(danhsachNhanViens);
               return true;
               }
            }
        return false;
    }
    public boolean xoaNhanVien(String name){
       for(NhanVien obj : danhsachNhanViens){
         if(obj.getTenNhanVien().equals(name)){
            danhsachNhanViens.remove(obj);
            IO.ghiNV(danhsachNhanViens);
            return true;
         }
       }
       return false;
    }
}
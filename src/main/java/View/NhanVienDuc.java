/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import IO.IO;
import NhanVien.NVPartTime;
import NhanVien.NhanVien;
import NhanVien.NhanVienCoDinh;
import NhanVien.QuanLyNhanVien;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class NhanVienDuc extends javax.swing.JFrame {

    private ArrayList<NhanVien> list_NhanVien;

    DefaultTableModel model;
    int key = 0;
    IO io = new IO();
    QuanLyNhanVien qlnv;
    public NhanVienDuc() {
        initComponents();
        qlnv=new QuanLyNhanVien();
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
//        list = new ArrayList<> (); // list = io.docSP();
//        list_NhanVien = new ArrayList<>();
        model = (DefaultTableModel) jTable1.getModel();
        list_NhanVien = io.docNV();
//        System.out.println(list_NhanVien.size());
        showResultCPNV();
    }

        private void showResultCPNV() {

        for (int i = 0; i < list_NhanVien.size(); i++) {
            NhanVien nv = list_NhanVien.get(i);
            model.addRow(new Object[]{
                nv.getTenNhanVien(), nv.getLoaiNhanVien(), (int)nv.tinhLuong()
            });
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        LbtenNhanVien = new javax.swing.JLabel();
        LbtenNhanVien1 = new javax.swing.JLabel();
        TFtenNhanVien = new javax.swing.JTextField();
        BtnTimKiem = new javax.swing.JButton();
        BtnClear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Back = new javax.swing.JToggleButton();
        changeBTN = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên Nhân Viên", "Part or Full", "Tiền Lương"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        LbtenNhanVien.setText("Tên nhân viên");

        LbtenNhanVien1.setText("Tên nhân viên");

        BtnTimKiem.setText("Search");
        BtnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTimKiemActionPerformed(evt);
            }
        });

        BtnClear.setText("Clear");
        BtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClearActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        changeBTN.setText("Change");
        changeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeBTNActionPerformed(evt);
            }
        });

        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Back)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(LbtenNhanVien1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TFtenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(BtnClear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(changeBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(18, 18, 18))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(163, 163, 163)
                    .addComponent(LbtenNhanVien)
                    .addContainerGap(435, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(Back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbtenNhanVien1)
                    .addComponent(TFtenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnTimKiem)
                    .addComponent(BtnClear)
                    .addComponent(changeBTN)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(142, 142, 142)
                    .addComponent(LbtenNhanVien)
                    .addContainerGap(273, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTimKiemActionPerformed
        // TODO add your handling code here:
        if(TFtenNhanVien.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Nhập thông tin tên nhân viên", "Thông báo lỗi", 
           JOptionPane.ERROR_MESSAGE);
        }else{
        NhanVien nv = null;
        int cout = 0;
        for (int i = 0; i < list_NhanVien.size(); i++) {
            if (list_NhanVien.get(i).getTenNhanVien().equals(TFtenNhanVien.getText())) {
                nv = list_NhanVien.get(i);
                cout++;
//              list.add(sp);
                showResultTKNV(nv);
            }
        }
        if(cout==0){
           JOptionPane.showMessageDialog(null, "Không có nhân viên cần tìm!", "Thông báo lỗi", 
           JOptionPane.ERROR_MESSAGE); 
        }
        }
    }//GEN-LAST:event_BtnTimKiemActionPerformed

    private void BtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClearActionPerformed
        // TODO add your handling code here:
        String text = "";
        jTextArea1.setText(text);
        TFtenNhanVien.setText(text);
    }//GEN-LAST:event_BtnClearActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
       JFrame Mainviews = new MainViews();
        Mainviews.setVisible(true);
        this.setVisible(false);
       // TODO add your handling code here:
    }//GEN-LAST:event_BackActionPerformed

    private void changeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeBTNActionPerformed
        JFrame SetNVPartTimes = new SetNVPartTime();
        SetNVPartTimes.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_changeBTNActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFrame ThemNhanViens = new ThemNhanVien();
        ThemNhanViens.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      if(TFtenNhanVien.getText().equals("")){
          JOptionPane.showMessageDialog(null, "Nhập thông tin tên nhân viên", "Thông báo lỗi", 
           JOptionPane.ERROR_MESSAGE); 
      }else{
          if(qlnv.xoaNhanVien(TFtenNhanVien.getText())){
          JOptionPane.showMessageDialog(null, "Xác nhận xóa nhân viên.", "", 
           JOptionPane.WARNING_MESSAGE); 
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
                  this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
//        list = new ArrayList<> (); // list = io.docSP();
//        list_NhanVien = new ArrayList<>();
        model = (DefaultTableModel) jTable1.getModel();
        list_NhanVien = io.docNV();
//        System.out.println(list_NhanVien.size());
        showResultCPNV();
          }else{
           JOptionPane.showMessageDialog(null, "Không tồn tại nhân viên!", "Thông báo lỗi", 
           JOptionPane.ERROR_MESSAGE);          
          }
      }      
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void showResultTKNV(NhanVien nv) {
        String text = "";
        if (nv instanceof NhanVienCoDinh) {

            text += "Nhân viên cố định:\n";
            text += "Họ và tên: " + ((NhanVienCoDinh) nv).getTenNhanVien() + "\n";
            text += "Vị trí: " + ((NhanVienCoDinh) nv).getViTri() + "\n";
            text += "Lương: " + (int)((NhanVienCoDinh) nv).tinhLuong() + "VND\n";
        } else if (nv instanceof NVPartTime) {
            text += "Nhân viên Part-Time:\n";
            text += "Họ và tên: " + ((NVPartTime) nv).getTenNhanVien() + "\n";
            text += "Thời gian làm việc: " + ((NVPartTime) nv).getThoiGianLamViec()+"h" + "\n";
            text += "Lương theo giờ: "+((NVPartTime)nv).getLuongTheoGio()+"\n";
            text += "Lương: " + (int)((NVPartTime) nv).tinhLuong() + "VND\n";
        }

        jTextArea1.append(text);
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Back;
    private javax.swing.JButton BtnClear;
    private javax.swing.JButton BtnTimKiem;
    private javax.swing.JLabel LbtenNhanVien;
    private javax.swing.JLabel LbtenNhanVien1;
    private javax.swing.JTextField TFtenNhanVien;
    private javax.swing.JButton changeBTN;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}

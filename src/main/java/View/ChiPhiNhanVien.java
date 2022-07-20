package View;

import IO.IO;
import NhanVien.NVPartTime;
import NhanVien.NhanVien;
import NhanVien.NhanVienCoDinh;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ChiPhiNhanVien extends javax.swing.JFrame {
//    private ArrayList<SanPham> list;

    private ArrayList<NhanVien> list_NhanVien;

    DefaultTableModel model;
    int key = 0;
    IO io = new IO();

    public ChiPhiNhanVien() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
//        list = new ArrayList<> (); // list = io.docSP();
        list_NhanVien = new ArrayList<>();
        model = (DefaultTableModel) jTable1.getModel();
        list_NhanVien = io.docNV();
//        System.out.println(list_NhanVien.size());
        showResultCPNV();
    }

    private void showResultCPNV() {

        for (int i = 0; i < list_NhanVien.size(); i++) {
            NhanVien nv = list_NhanVien.get(i);
            model.addRow(new Object[]{
                nv.getTenNhanVien(), 0, nv.tinhLuong()
            });
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        LbtenNhanVien = new javax.swing.JLabel();
        TFtenNhanVien = new javax.swing.JTextField();
        BtnTimKiem = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        BtnClear = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên Nhân Viên", "Part or Full", "Tiền Lương"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        LbtenNhanVien.setText("Tên nhân viên");

        BtnTimKiem.setText("Tìm Kiếm");
        BtnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTimKiemActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        BtnClear.setText("Clear");
        BtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(LbtenNhanVien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TFtenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(BtnTimKiem)
                .addGap(38, 38, 38)
                .addComponent(BtnClear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbtenNhanVien)
                    .addComponent(TFtenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnTimKiem)
                    .addComponent(BtnClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTimKiemActionPerformed
        // TODO add your handling code here:
        NhanVien nv = null;

        for (int i = 0; i < list_NhanVien.size(); i++) {
            if (list_NhanVien.get(i).getTenNhanVien().equals(TFtenNhanVien.getText())) {
                nv = list_NhanVien.get(i);
//              list.add(sp);
                showResultTKNV(nv);
            }
        }
    }//GEN-LAST:event_BtnTimKiemActionPerformed

    private void BtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClearActionPerformed
        // TODO add your handling code here:
        String text = "";
        jTextArea1.setText(text);
    }//GEN-LAST:event_BtnClearActionPerformed
    private void showResultTKNV(NhanVien nv) {
        String text = "";
        if (nv instanceof NhanVienCoDinh) {

            text += "Nhan vien co dinh:\n";
            text += "Ho va ten: " + ((NhanVienCoDinh) nv).getTenNhanVien() + "\n";
            text += "Vi tri: " + ((NhanVienCoDinh) nv).getViTri() + "\n";
            text += "Luong: " + ((NhanVienCoDinh) nv).tinhLuong() + "\n";
        } else if (nv instanceof NVPartTime) {
            text += "Nhan vien Past-Time:\n";
            text += "Ho va ten: " + ((NVPartTime) nv).getTenNhanVien() + "\n";
            text += "Vi tri: " + ((NVPartTime) nv).getThoiGianLamViec() + "\n";
            text += "Luong: " + ((NVPartTime) nv).tinhLuong() + "\n";
        }

        jTextArea1.append(text);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnClear;
    private javax.swing.JButton BtnTimKiem;
    private javax.swing.JLabel LbtenNhanVien;
    private javax.swing.JTextField TFtenNhanVien;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}

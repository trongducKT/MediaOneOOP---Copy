/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Exception.ChuaNhapDuThongTin;
import Exception.GiaTriKhongHopLe;
import Exception.KhongDuSoSanPhamYeuCau;
import Exception.SanPhamKhongCoTrongHoaDon;
import Exception.SanPhamKhongCoTrongKho;
import ThanhToan.ChucNangThanhToan;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class ThanhToanView extends javax.swing.JFrame {

    private ChucNangThanhToan TT;

    /**
     * Creates new form HoaDonViews
     */
    public ThanhToanView() {
        this.TT = new ChucNangThanhToan();

        initComponents();
        this.setLocationRelativeTo(null);
        TAHoaDon.setEditable(false);
        showResultHD();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        popupMenu1 = new java.awt.PopupMenu();
        popupMenu2 = new java.awt.PopupMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        TAHoaDon = new javax.swing.JTextArea();
        BtnThemSPHD = new javax.swing.JButton();
        TFtenSanPhamHD = new javax.swing.JTextField();
        TFsoluongHD = new javax.swing.JTextField();
        lbtenSanPham = new javax.swing.JLabel();
        lbsoluong = new javax.swing.JLabel();
        BTNBotSPHD = new javax.swing.JButton();
        BtnXoaSPHD = new javax.swing.JButton();
        BtnBack = new javax.swing.JButton();
        BtnIn = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        popupMenu1.setLabel("popupMenu1");

        popupMenu2.setLabel("popupMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TAHoaDon.setColumns(20);
        TAHoaDon.setRows(5);
        jScrollPane2.setViewportView(TAHoaDon);

        BtnThemSPHD.setText("Thêm");
        BtnThemSPHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnThemSPHDActionPerformed(evt);
            }
        });

        lbtenSanPham.setText("Tên sản phẩm");

        lbsoluong.setText("Số lượng");

        BTNBotSPHD.setText("Bớt");
        BTNBotSPHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBotSPHDActionPerformed(evt);
            }
        });

        BtnXoaSPHD.setText("Xóa");
        BtnXoaSPHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnXoaSPHDActionPerformed(evt);
            }
        });

        BtnBack.setText("Trở Về");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        BtnIn.setText("In");
        BtnIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(BtnThemSPHD)
                        .addGap(43, 43, 43)
                        .addComponent(BTNBotSPHD)
                        .addGap(38, 38, 38)
                        .addComponent(BtnIn)
                        .addGap(35, 35, 35)
                        .addComponent(BtnXoaSPHD))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbtenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFtenSanPhamHD, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFsoluongHD, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(BtnBack)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFtenSanPhamHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFsoluongHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbtenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnThemSPHD)
                    .addComponent(BTNBotSPHD, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnIn)
                    .addComponent(BtnXoaSPHD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 80, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnThemSPHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnThemSPHDActionPerformed
        // TODO add your handling code here:

        try {
            String spThem;
            int soLuongSpThem;
            try {
                spThem = TFtenSanPhamHD.getText();
                soLuongSpThem = Integer.parseInt(TFsoluongHD.getText());
            } catch (Exception e) {
                throw new ChuaNhapDuThongTin();
            }
            this.TT.themSanPham(spThem, soLuongSpThem);
        } catch (ChuaNhapDuThongTin e) {
            JFrame frame = new JFrame("");
            JOptionPane.showMessageDialog(frame,
                    "Chưa nhập đủ thông tin!",
                    "",
                    JOptionPane.ERROR_MESSAGE);
        } catch (SanPhamKhongCoTrongKho e) {
            JFrame frame = new JFrame("");
            JOptionPane.showMessageDialog(frame,
                    "Sản phẩm không có trong kho!",
                    "",
                    JOptionPane.ERROR_MESSAGE);
        } catch (KhongDuSoSanPhamYeuCau e) {
            JFrame frame = new JFrame("");
            JOptionPane.showMessageDialog(frame,
                    "Trong kho không đủ số sản phẩm yêu cầu!",
                    "",
                    JOptionPane.ERROR_MESSAGE);
        } catch (GiaTriKhongHopLe e) {
            JFrame frame = new JFrame("");
            JOptionPane.showMessageDialog(frame,
                    "Giá trị nhập vào không hợp lệ!",
                    "",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            System.out.println(e.getClass());
            JFrame frame = new JFrame("");
            JOptionPane.showMessageDialog(frame,
                    "Xảy ra lỗi!",
                    "",
                    JOptionPane.ERROR_MESSAGE);
        } finally {
            this.showResultHD();
        }
    }//GEN-LAST:event_BtnThemSPHDActionPerformed

    private void BTNBotSPHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBotSPHDActionPerformed
        // TODO add your handling code here:
        try {
            String spBot;
            int soLuongSpBot;
            try {
                spBot = TFtenSanPhamHD.getText();
                soLuongSpBot = Integer.parseInt(TFsoluongHD.getText());
            } catch (Exception e) {
                throw new ChuaNhapDuThongTin();
            }
            this.TT.botSanPham(spBot, soLuongSpBot);
        } catch (ChuaNhapDuThongTin e) {
            JFrame frame = new JFrame("");
            JOptionPane.showMessageDialog(frame,
                    "Chưa nhập đủ thông tin!",
                    "",
                    JOptionPane.ERROR_MESSAGE);
        } catch (SanPhamKhongCoTrongHoaDon e) {
            JFrame frame = new JFrame("");
            JOptionPane.showMessageDialog(frame,
                    "Sản phẩm không có sẵn trong hóa đơn!",
                    "",
                    JOptionPane.ERROR_MESSAGE);

        } catch (KhongDuSoSanPhamYeuCau e) {
            JFrame frame = new JFrame("");
            JOptionPane.showMessageDialog(frame,
                    "Không đủ số sản phẩm yêu cầu!",
                    "",
                    JOptionPane.ERROR_MESSAGE);
        } catch (GiaTriKhongHopLe e) {
            JFrame frame = new JFrame("");
            JOptionPane.showMessageDialog(frame,
                    "Giá trị nhập vào không hợp lệ!",
                    "",
                    JOptionPane.ERROR_MESSAGE);

        } catch (Exception e) {
            System.out.println(e.getClass());
            JFrame frame = new JFrame("");
            JOptionPane.showMessageDialog(frame,
                    "Xảy ra lỗi!",
                    "",
                    JOptionPane.ERROR_MESSAGE);
        } finally {
            this.showResultHD();
        }
    }//GEN-LAST:event_BTNBotSPHDActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        // TODO add your handling code here:
        TT.huy();
        JFrame MainViews = new MainViews();
        this.setVisible(false);
        MainViews.setVisible(true);
    }//GEN-LAST:event_BtnBackActionPerformed

    private void BtnInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInActionPerformed
        // TODO add your handling code here:
        this.TT.taoSuKien();

        JFrame HDView = new HoaDonView(this.TT.getHD());
        HDView.setVisible(true);

        this.setVisible(false);
        JFrame MainViews = new MainViews();
        MainViews.setVisible(true);
    }//GEN-LAST:event_BtnInActionPerformed

    private void BtnXoaSPHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnXoaSPHDActionPerformed
        // TODO add your handling code here:
        try {
            String spXoa;
            try {
                spXoa = TFtenSanPhamHD.getText();
            } catch (Exception e) {
                throw new ChuaNhapDuThongTin();
            }
            this.TT.xoaSanPham(spXoa);
        } catch (ChuaNhapDuThongTin e) {
            JFrame frame = new JFrame("");
            JOptionPane.showMessageDialog(frame,
                    "Chưa nhập đủ thông tin!",
                    "",
                    JOptionPane.ERROR_MESSAGE);
        } catch (SanPhamKhongCoTrongHoaDon e) {
            JFrame frame = new JFrame("");
            JOptionPane.showMessageDialog(frame,
                    "Sản phẩm không có sẵn trong hóa đơn!",
                    "",
                    JOptionPane.ERROR_MESSAGE);

        } catch (Exception e) {
            System.out.println(e.getClass());
            JFrame frame = new JFrame("");
            JOptionPane.showMessageDialog(frame,
                    "Xảy ra lỗi!",
                    "",
                    JOptionPane.ERROR_MESSAGE);
        } finally {
            this.showResultHD();
        }

    }//GEN-LAST:event_BtnXoaSPHDActionPerformed

    private void showResultHD() {
        String text = "";
        text += "Danh sach san pham:";

        for (int i = 0; i < TT.getHD().getDanhSachSanPham().size(); ++i) {
            text = text + "\n" + (i + 1) + ". " + TT.getHD().getDanhSachSanPham().get(i) + "\t* " + TT.getHD().getDanhSachSoLuong().get(i);
            text = text + "\n       " + this.TT.getHD().getDanhSachGia().get(i) + "\t* " + this.TT.getHD().getDanhSachSoLuong().get(i) + " = " + (this.TT.getHD().getDanhSachGia().get(i) * this.TT.getHD().getDanhSachSoLuong().get(i));
        }
        text += "\n-----------------------------------";
        text += "\n" + "Tong gia tri hoa don: " + TT.getHD().tongHoaDon();
        TAHoaDon.setText(text);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNBotSPHD;
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnIn;
    private javax.swing.JButton BtnThemSPHD;
    private javax.swing.JButton BtnXoaSPHD;
    private javax.swing.JTextArea TAHoaDon;
    private javax.swing.JTextField TFsoluongHD;
    private javax.swing.JTextField TFtenSanPhamHD;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbsoluong;
    private javax.swing.JLabel lbtenSanPham;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.PopupMenu popupMenu2;
    // End of variables declaration//GEN-END:variables

}

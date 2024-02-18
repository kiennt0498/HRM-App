/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.app.hrm.UI;

import com.app.hrm.DAO.ChamCongDao;
import com.app.hrm.DAO.KyCongCTDao;
import com.app.hrm.DAO.NhanVienDao;
import com.app.hrm.Entity.ChamCong;
import com.app.hrm.Entity.KyCongCT;
import com.app.hrm.Entity.NhanVien;
import static com.app.hrm.UI.BangCong.nam;
import static com.app.hrm.UI.BangCong.thang;
import com.app.hrm.Utils.MsgBox;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class test2 extends javax.swing.JFrame {

    KyCongCTDao dao = new KyCongCTDao();
    ChamCongDao ccdao = new ChamCongDao();
       NhanVienDao nvdao = new NhanVienDao();
    /**
     * Creates new form test2
     */
    public test2() {

        initComponents();
        initTable();
        filltable();
       //them();
        
    }

    void initTable() {
        ArrayList<String> listday = new ArrayList<String>();
        YearMonth yearMonthObject = YearMonth.of(2022, 3);
        int daysInMonth = yearMonthObject.lengthOfMonth();
        for (int j = 1; j <= daysInMonth; j++) {
            LocalDate newDate = LocalDate.of(2022, 3, j);

            switch (newDate.getDayOfWeek().toString()) {
                case "SUNDAY":
                    listday.add("CN");
                    break;
                default:
                    listday.add("" + j);
                    break;
            }

        }
        DefaultTableModel model = (DefaultTableModel) tblNgay.getModel();
        Vector vctCol = new Vector();

        vctCol.add("MaNV");
        vctCol.add("hoten");
        for (String st : listday) {
            vctCol.add(st);
        }
        vctCol.add("Tong gio lam");
        model.setColumnIdentifiers(vctCol);
    }

    public void filltable() {
     DefaultTableModel model = (DefaultTableModel) tblNgay.getModel();
        model.setRowCount(0);
        List<KyCongCT> list = dao.selectByIDAll(4);

               for (KyCongCT kc : list) {
                  
                   Object[] row={kc.getId(),kc.getMaNV(),kc.getD1(),kc.getD2(),kc.getD3(),kc.getD4(),kc.getD5(),kc.getD6(),kc.getD7(),kc.getD8(),kc.getD9(),kc.getD10(),
                   kc.getD11(),kc.getD12(),kc.getD13(),kc.getD14(),kc.getD15(),kc.getD16(),kc.getD17(),kc.getD18(),kc.getD19(),kc.getD20(),
                   kc.getD21(),kc.getD22(),kc.getD23(),kc.getD24(),kc.getD25(),kc.getD26(),kc.getD27(),kc.getD28(),kc.getD29(),kc.getD30(),kc.getD31(),kc.getTG()};
                   model.addRow(row);
        }

    }
    
     void them(){
        DefaultTableModel model = (DefaultTableModel) tblNgay.getModel();
        List<NhanVien> list = nvdao.selectAll();

        for (NhanVien nv : list) {
          KyCongCT kc = new KyCongCT();
          kc.setId(4);
          kc.setMaNV(nv.getMaNV());
            try {
                dao.insert(kc);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        filltable();
    }
    
    void sua(){
        
        try{
        for (int i = 0; i < tblNgay.getRowCount(); i++) {
            int tong = 0;
            int id = (int) tblNgay.getValueAt(i, 0);
            String manv = (String) tblNgay.getValueAt(i, 1);
            KyCongCT kc = dao.selectByIDMANV(id, manv);
            List<ChamCong> list = ccdao.selectAllByThangNam(2022, 3, manv);
            for (ChamCong cc : list) {
                
                Timestamp ts = new Timestamp(cc.getNgay().getTime());
                int a = ts.getDate();
               
                switch (a) {
                    case 1 -> {
                        kc.setD1(cc.getSoGioLam());
                        tong +=  cc.getSoGioLam();
                    }
                        case 2 -> {
                            kc.setD2(cc.getSoGioLam());
                            tong +=  cc.getSoGioLam();
                    }
                        case 3 -> {
                            kc.setD3(cc.getSoGioLam());
                            tong +=  cc.getSoGioLam();
                    }
                        case 4 -> {
                            kc.setD4(cc.getSoGioLam());
                            tong +=  cc.getSoGioLam();
                    }
                        case 5 -> {
                            kc.setD5(cc.getSoGioLam());
                            tong +=  cc.getSoGioLam();
                    }
                        case 6 -> {
                            kc.setD6(cc.getSoGioLam());
                            tong +=  cc.getSoGioLam();
                    }
                        case 7 -> {
                            kc.setD7(cc.getSoGioLam());
                            tong +=  cc.getSoGioLam();
                    }
                        case 8 -> {
                            kc.setD8(cc.getSoGioLam());
                            tong +=  cc.getSoGioLam();
                    }
                        case 9 -> {
                            kc.setD9(cc.getSoGioLam());
                            tong +=  cc.getSoGioLam();
                    }
                        case 10 -> {
                            kc.setD10(cc.getSoGioLam());
                            tong +=  cc.getSoGioLam();
                    }
                        case 11 -> {
                            kc.setD11(cc.getSoGioLam());
                            tong +=  cc.getSoGioLam();
                    }
                        case 12 -> {
                            kc.setD12(cc.getSoGioLam());
                            tong +=  cc.getSoGioLam();
                    }
                        case 13 -> {
                            kc.setD13(cc.getSoGioLam());
                            tong +=  cc.getSoGioLam();
                    }
                        case 14 -> {
                            kc.setD14(cc.getSoGioLam());
                            tong +=  cc.getSoGioLam();
                    }
                        case 15 -> {
                            kc.setD15(cc.getSoGioLam());
                            tong +=  cc.getSoGioLam();
                    }
                        case 16 -> {
                            kc.setD16(cc.getSoGioLam());
                            tong +=  cc.getSoGioLam();
                    }
                        case 17 -> {
                            kc.setD17(cc.getSoGioLam());
                            tong +=  cc.getSoGioLam();
                    }
                        case 18 -> {
                            kc.setD18(cc.getSoGioLam());
                            tong +=  cc.getSoGioLam();
                    }
                        case 19 -> {
                            kc.setD19(cc.getSoGioLam());
                            tong +=  cc.getSoGioLam();
                    }
                        case 20 -> {
                            kc.setD20(cc.getSoGioLam());
                            tong +=  cc.getSoGioLam();
                    }
                        case 21 -> {
                            kc.setD21(cc.getSoGioLam());
                            tong +=  cc.getSoGioLam();
                    }
                        case 22 -> {
                            kc.setD22(cc.getSoGioLam());
                            tong +=  cc.getSoGioLam();
                    }
                        case 23 -> {
                            kc.setD23(cc.getSoGioLam());
                            tong +=  cc.getSoGioLam();
                    }
                        case 24 -> {
                            kc.setD24(cc.getSoGioLam());
                            tong +=  cc.getSoGioLam();
                    }
                        case 25 -> {
                            kc.setD25(cc.getSoGioLam());
                            tong +=  cc.getSoGioLam();
                    }
                        case 26 -> {
                            kc.setD26(cc.getSoGioLam());
                            tong +=  cc.getSoGioLam();
                    }
                        case 28 -> {
                            kc.setD28(cc.getSoGioLam());
                            tong +=  cc.getSoGioLam();
                    }
                        case 29 -> {
                            kc.setD29(cc.getSoGioLam());
                            tong +=  cc.getSoGioLam();
                    }
                        case 30 -> {
                            kc.setD30(cc.getSoGioLam());
                            tong +=  cc.getSoGioLam();
                    }
                        case 31 -> {
                            kc.setD31(cc.getSoGioLam());
                            tong +=  cc.getSoGioLam();
                    }
                    
                }
                kc.setTG(tong);
            }
            
                try {
                    dao.update(kc);
                      
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        MsgBox.alert(this, "Lưu thành công");
        filltable();
        
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
        tblNgay = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblNgay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblNgay);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnThem.setText("jButton1");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(btnThem)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        sua();
    }//GEN-LAST:event_btnThemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(test2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThem;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblNgay;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author misbah alkhafadh
 */
public class MenuTabView extends javax.swing.JFrame {

    /**
     * Creates new form MenuTabView
     */
    public MenuTabView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdMember = new javax.swing.JTextField();
        txtNamaMember = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamatMember = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMember = new javax.swing.JTable();
        btnDropMember = new javax.swing.JButton();
        btnSaveMember = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIdBuku = new javax.swing.JTextField();
        txtJudulBuku = new javax.swing.JTextField();
        txtTahunBuku = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblBuku = new javax.swing.JTable();
        btnDropBuku = new javax.swing.JButton();
        btnSaveBuku = new javax.swing.JButton();
        cmbBuku = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtIdPenulis = new javax.swing.JTextField();
        txtPenulis = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblPenulis = new javax.swing.JTable();
        btnDropPenulis = new javax.swing.JButton();
        btnSavePenulis = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblTransaksi = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtJudulBukuTrans = new javax.swing.JTextField();
        txtIdTrans = new javax.swing.JTextField();
        txtIdMemberTrans = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtTglKembaliTrans = new javax.swing.JTextField();
        txtTglPinjamTrans = new javax.swing.JTextField();
        cmbStatusTrans = new javax.swing.JComboBox<>();
        btnSaveTrans = new javax.swing.JButton();
        btnDropTrans = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblDenda = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtDenda = new javax.swing.JTextField();
        txtWaktuDenda = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("ID Member ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel4.setText("Nama ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel5.setText("Alamat");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));
        jPanel3.add(txtIdMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 100, -1));
        jPanel3.add(txtNamaMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 210, -1));

        txtAlamatMember.setColumns(20);
        txtAlamatMember.setRows(5);
        jScrollPane1.setViewportView(txtAlamatMember);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 210, -1));

        tblMember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblMember);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 460, 260));

        btnDropMember.setText("Drop");
        jPanel3.add(btnDropMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        btnSaveMember.setText("Save");
        jPanel3.add(btnSaveMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        jTabbedPane2.addTab("Member", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ID Buku");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setText("Judul");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel6.setText("Tahun");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel7.setText("Penulis");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        jPanel4.add(txtIdBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 90, -1));
        jPanel4.add(txtJudulBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 210, -1));
        jPanel4.add(txtTahunBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 210, -1));

        tblBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblBuku);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 460, 260));

        btnDropBuku.setText("Drop");
        jPanel4.add(btnDropBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        btnSaveBuku.setText("Save");
        jPanel4.add(btnSaveBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        cmbBuku.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(cmbBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 210, -1));

        jTabbedPane2.addTab("Buku", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("ID Penulis ");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel9.setText("Penulis");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));
        jPanel5.add(txtIdPenulis, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 90, -1));
        jPanel5.add(txtPenulis, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 210, -1));

        tblPenulis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tblPenulis);

        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 460, 260));

        btnDropPenulis.setText("Drop");
        jPanel5.add(btnDropPenulis, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        btnSavePenulis.setText("Save");
        jPanel5.add(btnSavePenulis, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        jTabbedPane2.addTab("Penulis", jPanel5);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tblTransaksi);

        jPanel6.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 460, 260));

        jLabel10.setText("ID Transaksi");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel11.setText("ID Member");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel12.setText("Judul Buku");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));
        jPanel6.add(txtJudulBukuTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 190, -1));
        jPanel6.add(txtIdTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 100, -1));
        jPanel6.add(txtIdMemberTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 190, -1));

        jLabel13.setText("Status");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel14.setText("Tanggal Kembali");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel15.setText("Tanggal Pinjam");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        jPanel6.add(txtTglKembaliTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 190, -1));
        jPanel6.add(txtTglPinjamTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 190, -1));

        cmbStatusTrans.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel6.add(cmbStatusTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 190, -1));

        btnSaveTrans.setText("Save");
        jPanel6.add(btnSaveTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        btnDropTrans.setText("Drop");
        jPanel6.add(btnDropTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        jTabbedPane2.addTab("Transaksi", jPanel6);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(tblDenda);

        jPanel7.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 460, 260));

        jLabel16.setText("Waktu");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel17.setText("Denda");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));
        jPanel7.add(txtDenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 190, -1));
        jPanel7.add(txtWaktuDenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 190, -1));

        btnSave.setText("Save");
        jPanel7.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        jTabbedPane2.addTab("Denda", jPanel7);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 322));

        btnLogout.setText("Logout");
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MenuTabView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuTabView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuTabView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuTabView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuTabView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDropBuku;
    private javax.swing.JButton btnDropMember;
    private javax.swing.JButton btnDropPenulis;
    private javax.swing.JButton btnDropTrans;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSaveBuku;
    private javax.swing.JButton btnSaveMember;
    private javax.swing.JButton btnSavePenulis;
    private javax.swing.JButton btnSaveTrans;
    private javax.swing.JComboBox<String> cmbBuku;
    private javax.swing.JComboBox<String> cmbStatusTrans;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable tblBuku;
    private javax.swing.JTable tblDenda;
    private javax.swing.JTable tblMember;
    private javax.swing.JTable tblPenulis;
    private javax.swing.JTable tblTransaksi;
    private javax.swing.JTextArea txtAlamatMember;
    private javax.swing.JTextField txtDenda;
    private javax.swing.JTextField txtIdBuku;
    private javax.swing.JTextField txtIdMember;
    private javax.swing.JTextField txtIdMemberTrans;
    private javax.swing.JTextField txtIdPenulis;
    private javax.swing.JTextField txtIdTrans;
    private javax.swing.JTextField txtJudulBuku;
    private javax.swing.JTextField txtJudulBukuTrans;
    private javax.swing.JTextField txtNamaMember;
    private javax.swing.JTextField txtPenulis;
    private javax.swing.JTextField txtTahunBuku;
    private javax.swing.JTextField txtTglKembaliTrans;
    private javax.swing.JTextField txtTglPinjamTrans;
    private javax.swing.JTextField txtWaktuDenda;
    // End of variables declaration//GEN-END:variables
}

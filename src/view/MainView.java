/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.Connection;
import tools.MyConnection;
import controller.AkunController;
import entities.Session;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Dayinta Warih Wulandari
 */
public class MainView extends javax.swing.JFrame {

    private final Connection connection;
    private final ViewProccess viewProccess;
    private final AkunController akunController;
    String nama = "";

    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
        this.connection = new MyConnection().getConnection();
        this.viewProccess = new ViewProccess();
        this.akunController = new AkunController(connection);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dskMaster = new javax.swing.JDesktopPane();
        pnlLogin = new javax.swing.JPanel();
        lblUserLogin = new javax.swing.JLabel();
        lblPassLogin = new javax.swing.JLabel();
        txtUserLogin = new javax.swing.JTextField();
        txtPassLogin = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dskMaster.setBackground(new java.awt.Color(204, 204, 204));

        pnlLogin.setBorder(javax.swing.BorderFactory.createTitledBorder("Already have an account? Log in here"));
        pnlLogin.setForeground(new java.awt.Color(255, 255, 255));

        lblUserLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUserLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblUserLogin.setText("Username");
        lblUserLogin.setToolTipText("");

        lblPassLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPassLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblPassLogin.setText("Password");
        lblPassLogin.setToolTipText("");

        txtPassLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassLoginKeyPressed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        btnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLoginKeyPressed(evt);
            }
        });

        jButton1.setText("Registration");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Have not Account ?");

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserLogin)
                            .addComponent(lblPassLogin))
                        .addGap(18, 18, 18)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtUserLogin)
                            .addComponent(txtPassLogin))
                        .addContainerGap())
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(btnLogin)
                        .addGap(100, 100, 100)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserLogin)
                    .addComponent(txtUserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassLogin)
                    .addComponent(txtPassLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(jButton1)
                    .addComponent(jLabel2))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dskMasterLayout = new javax.swing.GroupLayout(dskMaster);
        dskMaster.setLayout(dskMasterLayout);
        dskMasterLayout.setHorizontalGroup(
            dskMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dskMasterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        dskMasterLayout.setVerticalGroup(
            dskMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dskMasterLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        dskMaster.setLayer(pnlLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskMaster)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskMaster)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        if (txtUserLogin.getText().length()==0 && txtPassLogin.getText().length()==0) {
            JOptionPane.showMessageDialog(null, "Masukkan id dan password!!");
        } else if (txtUserLogin.getText().length()==0 || txtPassLogin.getText().length()==0) {
            JOptionPane.showMessageDialog(null, "Mohon Lengkapi data");
        } else {
            
            Connection connection = new MyConnection().getConnection();
            
            try {
                Session session = new Session();
                String query = "select * from akun where nama = '" + txtUserLogin.getText() + "' and password = '" + txtPassLogin.getText() + "' and role_id = '1' ";
                String querymember = "select * from akun where nama = '" + txtUserLogin.getText() + "' and password  = '" + txtPassLogin.getText() + "' and role_id  = '2' ";
                
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ResultSet rs = preparedStatement.executeQuery();
                PreparedStatement preparedStatement1 = connection.prepareStatement(querymember);
                ResultSet resultSet = preparedStatement1.executeQuery();

                if (rs.next()) {

                    if (txtUserLogin.getText().equals(rs.getString("nama")) && txtPassLogin.getText().equals(rs.getString("password"))) {
                        AdminView adminView = new AdminView(connection);
                        JOptionPane.showMessageDialog(null, "Login Admin Berhasil, login sebagai " + txtUserLogin.getText() + " ");

                        adminView.show();
                        dskMaster.add(adminView);
                        pnlLogin.setVisible(false);
                    }
                }
                else if (resultSet.next()) {

                    if (txtUserLogin.getText().equals(resultSet.getString("nama")) && txtPassLogin.getText().equals(resultSet.getString("password"))) {
                        session.setLogin(txtUserLogin.getText());
                        MemberView memberView = new MemberView(connection);
                        JOptionPane.showMessageDialog(null, "Login Berhasil, login sebagai " + txtUserLogin.getText() + " ");
                       
                        
                        memberView.show();
                        dskMaster.add(memberView);
                        pnlLogin.setVisible(false);

                    }
                } else {

                    JOptionPane.showMessageDialog(null, "Maaf, Kombinasi Username dan password anda salah...");

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Registrasi registrasi = new Registrasi();
        registrasi.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLoginKeyPressed
        if (this.viewProccess.keyPressed(evt)) {
            if (txtUserLogin.getText().equals("") && txtPassLogin.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Masukkan id dan password!!");
            } else if (txtUserLogin.getText().equals("") || txtPassLogin.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Lengkapi data");
            } else {

                Connection connection = new MyConnection().getConnection();

                try {
                    Statement stat = connection.createStatement();
                    String query = "select * from akun where nama = '"
                            + txtUserLogin.getText() + "' and password = '"
                            + txtPassLogin.getText() + "'and role_id = '1'";
                    ResultSet rs = stat.executeQuery(query);
                    while (rs.next()) {

                        AdminView adminView = new AdminView(connection);

                        adminView.setVisible(true);
                        JOptionPane.showMessageDialog(null, "Login Berhasil, login sebagai " + txtPassLogin.getText() + " ");
                        adminView.show();
                        dskMaster.add(adminView);
                        pnlLogin.setVisible(false);
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "GAGAL LOGIN !");
                }

                try {
                    Statement stat = connection.createStatement();
                    String query = "select * from akun where nama = '"
                            + txtUserLogin.getText() + "' and password = '"
                            + txtPassLogin.getText() + "'and role_id = '2'";
                    ResultSet rs = stat.executeQuery(query);
                    while (rs.next()) {

                        MemberView memberView = new MemberView(connection);

                        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
                        memberView.setLocation((screenSize.width / 2 - memberView.getWidth() / 2), (screenSize.height / 2 - memberView.getHeight() / 2));
                        memberView.setVisible(true);
                        JOptionPane.showMessageDialog(null, "Login Berhasil, login sebagai " + txtUserLogin.getText() + " ");

                        memberView.show();
                        dskMaster.add(memberView);
                        pnlLogin.setVisible(false);

//                        memberView.labeluser();
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "GAGAL LOGIN !");
                }

            }
        }
    }//GEN-LAST:event_btnLoginKeyPressed

    private void txtPassLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassLoginKeyPressed
        if (txtUserLogin.getText().length()==0 && txtPassLogin.getText().length()==0) {
            JOptionPane.showMessageDialog(null, "Masukkan id dan password!!");
        } else if (txtUserLogin.getText().length()==0 || txtPassLogin.getText().length()==0) {
            JOptionPane.showMessageDialog(null, "Mohon Lengkapi data");
        } else if (this.viewProccess.keyPressed(evt)) {
            
            Connection connection = new MyConnection().getConnection();
            
            try {
                Session session = new Session();
                String query = "select * from akun where nama = '" + txtUserLogin.getText() + "' and password = '" + txtPassLogin.getText() + "' and role_id = '1' ";
                String querymember = "select * from akun where nama = '" + txtUserLogin.getText() + "' and password  = '" + txtPassLogin.getText() + "' and role_id  = '2' ";
                
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ResultSet rs = preparedStatement.executeQuery();
                PreparedStatement preparedStatement1 = connection.prepareStatement(querymember);
                ResultSet resultSet = preparedStatement1.executeQuery();

                if (rs.next()) {

                    if (txtUserLogin.getText().equals(rs.getString("nama")) && txtPassLogin.getText().equals(rs.getString("password"))) {
                        AdminView adminView = new AdminView(connection);
                        JOptionPane.showMessageDialog(null, "Login Admin Berhasil, login sebagai " + txtUserLogin.getText() + " ");

                        adminView.show();
                        dskMaster.add(adminView);
                        pnlLogin.setVisible(false);
                    }
                }
                else if (resultSet.next()) {

                    if (txtUserLogin.getText().equals(resultSet.getString("nama")) && txtPassLogin.getText().equals(resultSet.getString("password"))) {
                        session.setLogin(txtUserLogin.getText());
                        MemberView memberView = new MemberView(connection);
                        JOptionPane.showMessageDialog(null, "Login Berhasil, login sebagai " + txtUserLogin.getText() + " ");
                        memberView.show();
                        dskMaster.add(memberView);
                        pnlLogin.setVisible(false);
                    }
                } else {

                    JOptionPane.showMessageDialog(null, "Maaf, Kombinasi Username dan password anda salah...");

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
    }//GEN-LAST:event_txtPassLoginKeyPressed

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
//        MainView mv = new MainView();
//
//        System.out.println(mv.nama);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JDesktopPane dskMaster;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblPassLogin;
    private javax.swing.JLabel lblUserLogin;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPasswordField txtPassLogin;
    private javax.swing.JTextField txtUserLogin;
    // End of variables declaration//GEN-END:variables

    public String namaces(){
    
        String nama = txtUserLogin.getText();
        return nama;
    }


}

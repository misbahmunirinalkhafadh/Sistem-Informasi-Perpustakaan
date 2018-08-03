/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.Connection;
import tools.MyConnection;
import controller.AkunController;
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
        jLabel1 = new javax.swing.JLabel();
        pnlLogin = new javax.swing.JPanel();
        lblUserLogin = new javax.swing.JLabel();
        lblPassLogin = new javax.swing.JLabel();
        txtUserLogin = new javax.swing.JTextField();
        txtPassLogin = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dskMaster.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SISTEM PERPUSTAKAAN");

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

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUserLogin)
                    .addComponent(lblPassLogin))
                .addGap(18, 18, 18)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtUserLogin)
                    .addComponent(txtPassLogin))
                .addContainerGap())
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(btnLogin)
                .addGap(214, 214, 214))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserLogin)
                    .addComponent(txtUserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassLogin)
                    .addComponent(txtPassLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Registration");

        dskMaster.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dskMaster.setLayer(pnlLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dskMaster.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dskMasterLayout = new javax.swing.GroupLayout(dskMaster);
        dskMaster.setLayout(dskMasterLayout);
        dskMasterLayout.setHorizontalGroup(
            dskMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
            .addGroup(dskMasterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dskMasterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        dskMasterLayout.setVerticalGroup(
            dskMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dskMasterLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskMaster)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dskMaster)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        //        this.viewProccess.callForm(dskMaster, new AdminView(connection));
        
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
                
                    java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
                    adminView.setLocation((screenSize.width / 2 - adminView.getWidth() / 2), (screenSize.height / 2 - adminView.getHeight() / 2));
                    adminView.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Login Berhasil, login sebagai "+txtPassLogin.getText()+" ");
                    
                    adminView.show();
                    dskMaster.add(adminView);
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
                    JOptionPane.showMessageDialog(null, "Login Berhasil, login sebagai "+txtUserLogin.getText()+" ");
                    
                    memberView.show();
                    dskMaster.add(memberView);
                }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "GAGAL LOGIN !");
            }
            
        }

    }//GEN-LAST:event_btnLoginActionPerformed

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
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JDesktopPane dskMaster;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPassLogin;
    private javax.swing.JLabel lblUserLogin;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPasswordField txtPassLogin;
    private javax.swing.JTextField txtUserLogin;
    // End of variables declaration//GEN-END:variables

}

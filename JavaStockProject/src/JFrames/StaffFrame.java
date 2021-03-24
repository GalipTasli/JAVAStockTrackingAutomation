package JFrames;

import Classes.Identities;
import Classes.Staff;
import java.util.List;
import javax.swing.JOptionPane;



public class StaffFrame extends javax.swing.JFrame {

    public StaffFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnEnter = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(820, 500));
        getContentPane().setLayout(null);

        jLabel3.setBackground(new java.awt.Color(0, 153, 153));
        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setText("Personel Giriş Ekranı");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 70, 200, 22);

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("Kullanıcı Adı");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 220, 110, 30);

        txtUser.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        txtUser.setText("tcan");
        getContentPane().add(txtUser);
        txtUser.setBounds(120, 230, 100, 23);

        jLabel5.setBackground(new java.awt.Color(0, 102, 102));
        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("Şifre");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 280, 80, 40);

        btnEnter.setBackground(new java.awt.Color(153, 153, 153));
        btnEnter.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnEnter.setText("Giriş");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnter);
        btnEnter.setBounds(60, 370, 73, 25);

        txtPass.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        txtPass.setText("1111");
        getContentPane().add(txtPass);
        txtPass.setBounds(120, 280, 100, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/tech1.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-20, -30, 890, 530);

        setSize(new java.awt.Dimension(810, 486));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
       
        List<Staff> listStaff = Staff.Listing();
        
        for (int i = 0; i < listStaff.size(); i++) {
            
            if (listStaff.get(i).UserName.equals(txtUser.getText()) && listStaff.get(i).Password.equals(txtPass.getText()) ) {
                 
                this.setVisible(false);
                Identities.Id.setId(listStaff.get(i).Id);
                new MenuFrame().setVisible(true);
                
                break;
            }
            else if (listStaff.size()==i+1) {
                txtUser.setText("");
                txtPass.setText("");
                JOptionPane.showMessageDialog(null, "Hatalı Giriş Yaptınız", "InfoBox: " + "Sıkıntı", JOptionPane.INFORMATION_MESSAGE);
            }
        }     
    }//GEN-LAST:event_btnEnterActionPerformed

   
    
    
    
   
    
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
            java.util.logging.Logger.getLogger(StaffFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}

package JFrames;

import Classes.Staff;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class NewStaffFrame extends javax.swing.JFrame {

    public NewStaffFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblStaff = new javax.swing.JTable();
        btnAddStaff = new javax.swing.JButton();
        btnDeleteStaff = new javax.swing.JButton();
        btnUpdateStaff = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtStaffName = new javax.swing.JTextField();
        txtStaffSurname = new javax.swing.JTextField();
        txtStaffUserName = new javax.swing.JTextField();
        txtStaffTask = new javax.swing.JTextField();
        txtStaffPassword = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        tblStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "İsim", "Soyisim", "Görev", "Kullanıcı Adı", "Parola"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblStaff.setMinimumSize(new java.awt.Dimension(0, 0));
        tblStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStaffMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblStaff);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(340, 40, 410, 230);

        btnAddStaff.setBackground(new java.awt.Color(102, 102, 102));
        btnAddStaff.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnAddStaff.setText("Personel Ekle");
        btnAddStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStaffActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddStaff);
        btnAddStaff.setBounds(10, 230, 173, 25);

        btnDeleteStaff.setBackground(new java.awt.Color(102, 102, 102));
        btnDeleteStaff.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnDeleteStaff.setText("Seçili Personeli Sil");
        btnDeleteStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteStaffActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeleteStaff);
        btnDeleteStaff.setBounds(10, 273, 173, 25);

        btnUpdateStaff.setBackground(new java.awt.Color(102, 102, 102));
        btnUpdateStaff.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnUpdateStaff.setText("S. Personeli Güncelle");
        btnUpdateStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStaffActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdateStaff);
        btnUpdateStaff.setBounds(10, 316, 173, 25);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("İsim");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(18, 68, 44, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("Soyisim");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(18, 98, 65, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("Görev");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(18, 125, 52, 14);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("Kullanıcı Adı");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(18, 155, 91, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("Parola");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(18, 181, 60, 17);
        getContentPane().add(txtStaffName);
        txtStaffName.setBounds(130, 70, 85, 20);
        getContentPane().add(txtStaffSurname);
        txtStaffSurname.setBounds(130, 100, 85, 20);
        getContentPane().add(txtStaffUserName);
        txtStaffUserName.setBounds(130, 160, 85, 20);
        getContentPane().add(txtStaffTask);
        txtStaffTask.setBounds(130, 130, 85, 20);
        getContentPane().add(txtStaffPassword);
        txtStaffPassword.setBounds(130, 190, 85, 20);

        btnBack.setBackground(new java.awt.Color(102, 102, 102));
        btnBack.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnBack.setText("<-----");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(10, 0, 73, 25);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/tech1.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, -30, 930, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void updateList(){
        List<Staff> ListStaff= Staff.Listing();   
    
        Object[][] data = new Object[ListStaff.size()][];    
    
     for (int i  = 0; i < data.length; i++) {
           
            data[i]= new Object[]
            {
                ListStaff.get(i).StaffName,
                ListStaff.get(i).StaffSurname,
                ListStaff.get(i).Task,
                ListStaff.get(i).UserName,
                ListStaff.get(i).Password
            };
           
        }
            tblStaff.setModel(new javax.swing.table.DefaultTableModel(
            data,
            new String [] {
                "İsim", "Soyisim", "Görev", "Kullanıcı Adı", "Parola"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
            txtStaffName.setText("");
            txtStaffSurname.setText("");
            txtStaffTask.setText("");
            txtStaffUserName.setText("");
            txtStaffPassword.setText("");

    }
    
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
        updateList();
            
    }//GEN-LAST:event_formWindowOpened

    private void tblStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStaffMouseClicked
        
        DefaultTableModel myModel = (DefaultTableModel) tblStaff.getModel() ;
        int SelectedRowIndex = tblStaff.getSelectedRow();
        
        txtStaffName.setText(myModel.getValueAt(SelectedRowIndex,0).toString());
        txtStaffSurname.setText(myModel.getValueAt(SelectedRowIndex,1).toString());
        txtStaffTask.setText(myModel.getValueAt(SelectedRowIndex,2).toString());
        txtStaffUserName.setText(myModel.getValueAt(SelectedRowIndex,3).toString());
        txtStaffPassword.setText(myModel.getValueAt(SelectedRowIndex,4).toString());

        
    }//GEN-LAST:event_tblStaffMouseClicked

    private void btnAddStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStaffActionPerformed
        Staff.Add(txtStaffName.getText(), txtStaffSurname.getText(), txtStaffTask.getText(), txtStaffUserName.getText(), txtStaffPassword.getText());
        updateList();
    }//GEN-LAST:event_btnAddStaffActionPerformed

    private void btnDeleteStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteStaffActionPerformed
        List<Staff> listStaff = Staff.Listing();
        for (int i = 0; i < listStaff.size(); i++) {
            
            if (listStaff.get(i).StaffName.equals(txtStaffName.getText())) {
                Staff.Delete(listStaff.get(i).Id);
                break;
            }
        }
        updateList();
    }//GEN-LAST:event_btnDeleteStaffActionPerformed

    private void btnUpdateStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStaffActionPerformed
        List<Staff> listStaff = Staff.Listing();
        for (int i = 0; i < listStaff.size(); i++) {
            
            if (listStaff.get(i).StaffName.equals(txtStaffName.getText())) {
                Staff.Update(listStaff.get(i).Id, txtStaffName.getText(), txtStaffSurname.getText(), txtStaffTask.getText(), txtStaffUserName.getText(), txtStaffPassword.getText());
                break;
            }
        }
        updateList();
    }//GEN-LAST:event_btnUpdateStaffActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        new MenuFrame().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(NewStaffFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewStaffFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewStaffFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewStaffFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewStaffFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStaff;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteStaff;
    private javax.swing.JButton btnUpdateStaff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblStaff;
    private javax.swing.JTextField txtStaffName;
    private javax.swing.JTextField txtStaffPassword;
    private javax.swing.JTextField txtStaffSurname;
    private javax.swing.JTextField txtStaffTask;
    private javax.swing.JTextField txtStaffUserName;
    // End of variables declaration//GEN-END:variables
}

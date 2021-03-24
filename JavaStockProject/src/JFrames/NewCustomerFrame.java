
package JFrames;

import Classes.Customer;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class NewCustomerFrame extends javax.swing.JFrame {

    public NewCustomerFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCusName = new javax.swing.JTextField();
        txtCusSurname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        btnAddCus = new javax.swing.JButton();
        btnDeleteCus = new javax.swing.JButton();
        btnUpdateCus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCusTc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        txtCusName.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        getContentPane().add(txtCusName);
        txtCusName.setBounds(110, 100, 85, 23);

        txtCusSurname.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        getContentPane().add(txtCusSurname);
        txtCusSurname.setBounds(110, 140, 85, 23);

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "İsim", "Soyisim", "Tc"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCustomer);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(360, 100, 390, 130);

        btnAddCus.setBackground(new java.awt.Color(153, 153, 153));
        btnAddCus.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnAddCus.setText("Müşteri Ekle");
        btnAddCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCusActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddCus);
        btnAddCus.setBounds(30, 220, 168, 25);

        btnDeleteCus.setBackground(new java.awt.Color(153, 153, 153));
        btnDeleteCus.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnDeleteCus.setText("Seçili Müşteri Sil");
        btnDeleteCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCusActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeleteCus);
        btnDeleteCus.setBounds(30, 260, 168, 25);

        btnUpdateCus.setBackground(new java.awt.Color(153, 153, 153));
        btnUpdateCus.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnUpdateCus.setText("S. Müşteri Güncelle");
        btnUpdateCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCusActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdateCus);
        btnUpdateCus.setBounds(30, 310, 168, 25);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("İsim");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 110, 40, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("Soyisim");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 140, 60, 17);

        txtCusTc.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        getContentPane().add(txtCusTc);
        txtCusTc.setBounds(110, 70, 85, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("Tc");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 70, 30, 17);

        btnBack.setBackground(new java.awt.Color(153, 153, 153));
        btnBack.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnBack.setText("<----");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(0, 0, 73, 25);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/tech1.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-10, 0, 860, 470);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void updateList(){
         
    List<Customer> tblCus= Customer.Listing();       
    Object[][] data = new Object[tblCus.size()][];    
    
     for (int i  = 0; i < data.length; i++) {
           
            data[i]= new Object[]
            {
                tblCus.get(i).CustomerName,
                tblCus.get(i).CustomerSurname,
                tblCus.get(i).CustomerTc
            };
           
        }
            tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            data,
            new String [] {
                "İsim", "Soyisim", "Tc"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
    
        }
        public void clean(){
            txtCusName.setText("");
            txtCusSurname.setText("");
            txtCusTc.setText("");
        }
    
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    
        updateList();
    
    
    }//GEN-LAST:event_formWindowOpened

    private void tblCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerMouseClicked
        
        DefaultTableModel myModel = (DefaultTableModel) tblCustomer.getModel() ;
        int SelectedRowIndex = tblCustomer.getSelectedRow();
        
        txtCusName.setText(myModel.getValueAt(SelectedRowIndex,0).toString());
        txtCusSurname.setText(myModel.getValueAt(SelectedRowIndex,1).toString());
        txtCusTc.setText(myModel.getValueAt(SelectedRowIndex,2).toString());
        updateList();
    }//GEN-LAST:event_tblCustomerMouseClicked

    private void btnAddCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCusActionPerformed
        Customer.Add(txtCusName.getText(), txtCusSurname.getText(), txtCusTc.getText()); 
        updateList();
        clean();
    }//GEN-LAST:event_btnAddCusActionPerformed

    private void btnDeleteCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCusActionPerformed
        Customer.Delete(txtCusTc.getText());
        updateList();
        clean();
    }//GEN-LAST:event_btnDeleteCusActionPerformed

    private void btnUpdateCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCusActionPerformed
    
        List<Customer> tblCus= Customer.Listing();    
        for (int i = 0; i < tblCus.size(); i++) {
            if (tblCus.get(i).CustomerTc.equals(txtCusTc.getText())) 
            {
              Customer.Update(tblCus.get(i).Id, txtCusName.getText(), txtCusSurname.getText(), txtCusTc.getText());
              break;
            }
        }
       updateList();
       clean();
    }//GEN-LAST:event_btnUpdateCusActionPerformed

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
            java.util.logging.Logger.getLogger(NewCustomerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewCustomerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewCustomerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewCustomerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewCustomerFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCus;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteCus;
    private javax.swing.JButton btnUpdateCus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTextField txtCusName;
    private javax.swing.JTextField txtCusSurname;
    private javax.swing.JTextField txtCusTc;
    // End of variables declaration//GEN-END:variables
}

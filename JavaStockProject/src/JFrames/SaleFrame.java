package JFrames;

import Classes.Brand;
import Classes.Identities;
import Classes.Categories;
import Classes.Customer;
import Classes.Model;
import Classes.Product;
import Classes.Sales;
import java.util.List;
import java.text.SimpleDateFormat;  
import java.util.Date; 

public class SaleFrame extends javax.swing.JFrame {

    public SaleFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddBasket = new javax.swing.JButton();
        btnAddSale = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        comboBrand = new javax.swing.JComboBox<>();
        comboCat = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        comboModel = new javax.swing.JComboBox<>();
        txtCusName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCusSurname = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCusTc = new javax.swing.JTextField();
        btnSaleList = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        btnAddBasket.setBackground(new java.awt.Color(204, 204, 204));
        btnAddBasket.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnAddBasket.setText("Sepete Ekle");
        btnAddBasket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBasketActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddBasket);
        btnAddBasket.setBounds(30, 380, 150, 60);

        btnAddSale.setBackground(new java.awt.Color(204, 204, 204));
        btnAddSale.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnAddSale.setText("İşlemi Bitir");
        btnAddSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSaleActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddSale);
        btnAddSale.setBounds(550, 380, 150, 63);

        jLabel8.setBackground(new java.awt.Color(0, 102, 102));
        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setText("Kategori");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 170, 90, 20);

        comboBrand.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        comboBrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comboBrand);
        comboBrand.setBounds(150, 200, 79, 23);

        comboCat.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        comboCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comboCat);
        comboCat.setBounds(150, 160, 79, 23);

        jLabel3.setBackground(new java.awt.Color(0, 102, 102));
        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("Ürün Markası");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 210, 110, 20);

        jLabel5.setBackground(new java.awt.Color(0, 102, 102));
        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("Ürün Modeli");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 250, 110, 20);

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("Müşteri Adı : ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 80, 100, 20);

        comboModel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        comboModel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comboModel);
        comboModel.setBounds(150, 250, 79, 23);

        txtCusName.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        getContentPane().add(txtCusName);
        txtCusName.setBounds(150, 80, 120, 23);

        jLabel6.setBackground(new java.awt.Color(0, 102, 102));
        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setText("Fiyat ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 300, 50, 20);

        txtCusSurname.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        getContentPane().add(txtCusSurname);
        txtCusSurname.setBounds(150, 120, 120, 23);
        getContentPane().add(txtPrice);
        txtPrice.setBounds(150, 300, 100, 20);

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("Müşteri Soyadı : ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 120, 120, 20);

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("Tc : ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 50, 60, 14);

        txtCusTc.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        txtCusTc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCusTcKeyReleased(evt);
            }
        });
        getContentPane().add(txtCusTc);
        txtCusTc.setBounds(150, 40, 120, 23);

        btnSaleList.setBackground(new java.awt.Color(204, 204, 204));
        btnSaleList.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnSaleList.setText("Satışları Listele");
        btnSaleList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaleListActionPerformed(evt);
            }
        });
        getContentPane().add(btnSaleList);
        btnSaleList.setBounds(300, 380, 150, 63);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kategori", "Marka", "Model", "Fiyat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(320, 10, 452, 300);

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnBack.setText("<-----");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(0, 0, 80, 25);

        jLabel7.setBackground(new java.awt.Color(51, 51, 51));
        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/tech1.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-20, -20, 860, 520);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    StaffFrame u = new StaffFrame();
    
    List<Product> lisPro = Product.Listing();
    List<Brand> lisBrand = Brand.Listing();
    List<Categories> lisCat = Categories.Listing();
    List<Model> lisModel = Model.Listing();
    List<Customer> listCus = Customer.Listing();

    int sayac=10;
    Object[][] data = new Object[sayac][];    

    
    
    
    private void btnAddBasketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBasketActionPerformed
    
        sayac++;
        
        data[sayac-1]= new Object[]
            {
                lisCat.get(comboCat.getSelectedIndex()).CategoryName,
                lisBrand.get(comboBrand.getSelectedIndex()).BrandName,
                lisModel.get(comboModel.getSelectedIndex()).ModelName,
                Float.parseFloat(txtPrice.getText()),
            };
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            data,
            new String [] {
                "Kategori", "Marka", "Model", "Fiyat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        
    }//GEN-LAST:event_btnAddBasketActionPerformed

    int cusId = 0;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
    Date date = new Date();
       
    private void btnAddSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSaleActionPerformed
        
        for (int i = 0; i < sayac; i++) {
            Sales.Add(cusId,
                    Identities.Id.getId(),
                    lisPro.get(5).Id,
                    formatter.format(date),
                    Float.parseFloat(txtPrice.getText()));
        }
        
    }//GEN-LAST:event_btnAddSaleActionPerformed

    private void txtCusTcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCusTcKeyReleased
        for (int i = 0; i < listCus.size(); i++) {
            if (listCus.get(i).CustomerTc.equals(txtCusTc.getText())) {
                txtCusName.setText(listCus.get(i).CustomerName);
                txtCusSurname.setText(listCus.get(i).CustomerSurname);
                cusId=listCus.get(i).Id;
            break;
            }
            else
            {
                txtCusName.setText("");
                txtCusSurname.setText("");
            }
        }
    }//GEN-LAST:event_txtCusTcKeyReleased

   

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        sayac=0;
        comboCat.removeAllItems();
        comboBrand.removeAllItems();
        comboModel.removeAllItems();
        
        for (int i = 0; i < lisBrand.size(); i++) {
            comboBrand.addItem(lisBrand.get(i).BrandName);
        }
        for (int i = 0; i < lisCat.size(); i++) {
            comboCat.addItem(lisCat.get(i).CategoryName);
        }
        for (int i = 0; i < lisModel.size(); i++) {
            comboModel.addItem(lisModel.get(i).ModelName);
        }
        
           
    
    }//GEN-LAST:event_formWindowOpened

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        new MenuFrame().setVisible(true);        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaleListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaleListActionPerformed
        this.setVisible(false);
        new SaleUpdateListFrame().setVisible(true);
    }//GEN-LAST:event_btnSaleListActionPerformed

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
            java.util.logging.Logger.getLogger(SaleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaleFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBasket;
    private javax.swing.JButton btnAddSale;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSaleList;
    private javax.swing.JComboBox<String> comboBrand;
    private javax.swing.JComboBox<String> comboCat;
    private javax.swing.JComboBox<String> comboModel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCusName;
    private javax.swing.JTextField txtCusSurname;
    private javax.swing.JTextField txtCusTc;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}


package JFrames;

import Classes.Brand;
import Classes.Categories;
import Classes.Model;
import Classes.Product;
import java.util.List;


public class ProductFrame extends javax.swing.JFrame {

    public ProductFrame() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ComboNewKategori = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtNewGuarantee = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNewPrice = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtNewStock = new javax.swing.JTextField();
        btnNewProduct = new javax.swing.JButton();
        ComboStockModel = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtStockAdet = new javax.swing.JTextField();
        btnAddStock = new javax.swing.JButton();
        txtNewBrand = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ComboNewBrand = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAddBrand = new javax.swing.JButton();
        ComboStockMarka = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNewModel = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(780, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        ComboNewKategori.setFont(new java.awt.Font("Agency FB", 3, 14)); // NOI18N
        ComboNewKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ComboNewKategori);
        ComboNewKategori.setBounds(250, 210, 73, 23);

        jLabel12.setFont(new java.awt.Font("Agency FB", 3, 14)); // NOI18N
        jLabel12.setText("Garanti");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(170, 280, 40, 17);

        txtNewGuarantee.setFont(new java.awt.Font("Agency FB", 3, 14)); // NOI18N
        getContentPane().add(txtNewGuarantee);
        txtNewGuarantee.setBounds(250, 270, 73, 23);

        jLabel13.setFont(new java.awt.Font("Agency FB", 3, 14)); // NOI18N
        jLabel13.setText("Fiyatı");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(170, 320, 40, 17);

        txtNewPrice.setFont(new java.awt.Font("Agency FB", 3, 14)); // NOI18N
        getContentPane().add(txtNewPrice);
        txtNewPrice.setBounds(250, 320, 73, 23);

        jLabel14.setFont(new java.awt.Font("Agency FB", 3, 14)); // NOI18N
        jLabel14.setText("Adet");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(170, 360, 40, 17);

        txtNewStock.setFont(new java.awt.Font("Agency FB", 3, 14)); // NOI18N
        getContentPane().add(txtNewStock);
        txtNewStock.setBounds(250, 350, 73, 23);

        btnNewProduct.setBackground(new java.awt.Color(102, 102, 102));
        btnNewProduct.setFont(new java.awt.Font("Agency FB", 3, 14)); // NOI18N
        btnNewProduct.setText("Ekle");
        btnNewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewProductActionPerformed(evt);
            }
        });
        getContentPane().add(btnNewProduct);
        btnNewProduct.setBounds(170, 400, 73, 25);

        ComboStockModel.setFont(new java.awt.Font("Agency FB", 3, 14)); // NOI18N
        ComboStockModel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ComboStockModel);
        ComboStockModel.setBounds(90, 190, 73, 23);

        jLabel6.setFont(new java.awt.Font("Agency FB", 3, 14)); // NOI18N
        jLabel6.setText("MARKA");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 160, 43, 17);

        jLabel7.setFont(new java.awt.Font("Agency FB", 3, 14)); // NOI18N
        jLabel7.setText("Kaç Adet");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 250, 52, 17);

        txtStockAdet.setFont(new java.awt.Font("Agency FB", 3, 14)); // NOI18N
        getContentPane().add(txtStockAdet);
        txtStockAdet.setBounds(90, 250, 73, 23);

        btnAddStock.setBackground(new java.awt.Color(102, 102, 102));
        btnAddStock.setFont(new java.awt.Font("Agency FB", 3, 14)); // NOI18N
        btnAddStock.setText("Ekle");
        btnAddStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStockActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddStock);
        btnAddStock.setBounds(20, 320, 73, 25);

        txtNewBrand.setFont(new java.awt.Font("Agency FB", 3, 14)); // NOI18N
        getContentPane().add(txtNewBrand);
        txtNewBrand.setBounds(410, 160, 85, 23);

        jLabel8.setFont(new java.awt.Font("Agency FB", 3, 18)); // NOI18N
        jLabel8.setText("Olmayan bi ürün ekle");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(180, 110, 130, 22);

        jLabel9.setFont(new java.awt.Font("Agency FB", 3, 14)); // NOI18N
        jLabel9.setText("Marka");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(170, 150, 40, 17);

        ComboNewBrand.setFont(new java.awt.Font("Agency FB", 3, 14)); // NOI18N
        ComboNewBrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ComboNewBrand);
        ComboNewBrand.setBounds(250, 150, 73, 23);

        jLabel10.setFont(new java.awt.Font("Agency FB", 3, 14)); // NOI18N
        jLabel10.setText("Model");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(170, 180, 40, 17);

        jLabel1.setFont(new java.awt.Font("Agency FB", 3, 18)); // NOI18N
        jLabel1.setText("Stok Artısı");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 110, 89, 22);

        btnAddBrand.setBackground(new java.awt.Color(102, 102, 102));
        btnAddBrand.setFont(new java.awt.Font("Agency FB", 3, 14)); // NOI18N
        btnAddBrand.setText("Marka Ekle");
        btnAddBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBrandActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddBrand);
        btnAddBrand.setBounds(410, 210, 85, 25);

        ComboStockMarka.setFont(new java.awt.Font("Agency FB", 3, 14)); // NOI18N
        ComboStockMarka.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ComboStockMarka);
        ComboStockMarka.setBounds(90, 160, 73, 23);

        jLabel3.setFont(new java.awt.Font("Agency FB", 3, 24)); // NOI18N
        jLabel3.setText("ÜRÜN EKLE");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 10, 152, 38);

        jLabel2.setFont(new java.awt.Font("Agency FB", 3, 14)); // NOI18N
        jLabel2.setText("MODEL");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 190, 43, 17);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Agency FB", 3, 18)); // NOI18N
        jLabel5.setText("Daha önce olmayan bi marka ekle");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(350, 110, 210, 22);

        txtNewModel.setFont(new java.awt.Font("Agency FB", 3, 14)); // NOI18N
        getContentPane().add(txtNewModel);
        txtNewModel.setBounds(250, 180, 73, 23);

        jLabel11.setFont(new java.awt.Font("Agency FB", 3, 14)); // NOI18N
        jLabel11.setText("Kategori");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(170, 220, 56, 17);

        btnBack.setFont(new java.awt.Font("Agency FB", 3, 14)); // NOI18N
        btnBack.setText("<------");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(0, 0, 73, 25);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/tech1.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -10, 790, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
         // <editor-fold defaultstate="collapsed" desc="ComboDHMarka">
        
        ComboNewBrand.removeAllItems();
        ComboNewKategori.removeAllItems();
        ComboStockMarka.removeAllItems();
        ComboStockModel.removeAllItems();
        
        List<Brand> BrandPro= Brand.Listing();
        List<Categories> CategoryPro= Categories.Listing();
        List<Model> ModelPro= Model.Listing();

            for (int j = 0; j < BrandPro.size(); j++) {
                ComboNewBrand.addItem(BrandPro.get(j).BrandName);
            }
            for (int j = 0; j < CategoryPro.size(); j++) {
                ComboNewKategori.addItem(CategoryPro.get(j).CategoryName);
            }
            

        
        for (int j = 0; j < BrandPro.size(); j++) {
                ComboStockMarka.addItem(BrandPro.get(j).BrandName);
        }
        
        for (int j = 0; j < ModelPro.size(); j++) {
                ComboStockModel.addItem(ModelPro.get(j).ModelName);
        }
        
       
        
     // </editor-fold>     
        
     
     
    }//GEN-LAST:event_formWindowOpened

    private void btnAddStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStockActionPerformed
        
        List<Product> listPro = Product.Listing();
        List<Brand> BrandPro= Brand.Listing();
        List<Model> ModelPro= Model.Listing();
        
        
        for (int i = 0; i < listPro.size(); i++) {
            
            if (listPro.get(i).BrandId == BrandPro.get(ComboStockMarka.getSelectedIndex()).Id && 
                listPro.get(i).ModelId == ModelPro.get(ComboStockModel.getSelectedIndex()).Id) 
            {
             Product.Update(listPro.get(i).Id,listPro.get(i).ModelId , listPro.get(i).BrandId,listPro.get(i).CategoryId, listPro.get(i).GuaranteePeriod, listPro.get(i).Price, listPro.get(i).Stock + Integer.parseInt(txtStockAdet.getText()));                       
             break;
            }
            
        }
        
    }//GEN-LAST:event_btnAddStockActionPerformed

    private void btnAddBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBrandActionPerformed
        Brand.Add(txtNewBrand.getText());  
    }//GEN-LAST:event_btnAddBrandActionPerformed

    private void btnNewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewProductActionPerformed
               
        List<Model> ModelPro = Model.Listing();        
        List<Brand> BrandPro = Brand.Listing();
        List<Categories> Cpro = Categories.Listing();
        
        Model.Add(txtNewModel.getText());
        
       Product.Add(ModelPro.get(ModelPro.size()-1).Id, BrandPro.get(ComboNewBrand.getSelectedIndex()).Id,Cpro.get(ComboNewKategori.getSelectedIndex()).Id, txtNewGuarantee.getText(), Float.parseFloat(txtNewPrice.getText()) , Integer.parseInt(txtNewStock.getText()));
        
        
    }//GEN-LAST:event_btnNewProductActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        new MenuFrame().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed


    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboNewBrand;
    private javax.swing.JComboBox<String> ComboNewKategori;
    private javax.swing.JComboBox<String> ComboStockMarka;
    private javax.swing.JComboBox<String> ComboStockModel;
    private javax.swing.JButton btnAddBrand;
    private javax.swing.JButton btnAddStock;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNewProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtNewBrand;
    private javax.swing.JTextField txtNewGuarantee;
    private javax.swing.JTextField txtNewModel;
    private javax.swing.JTextField txtNewPrice;
    private javax.swing.JTextField txtNewStock;
    private javax.swing.JTextField txtStockAdet;
    // End of variables declaration//GEN-END:variables
}

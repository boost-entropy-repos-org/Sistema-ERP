package screens;

import functioncontroller.GetImageAdress;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import connectionbd.ConnectionModule;
import formattingmask.MaskCash;
import formattingmask.MaskJustNumbers;
import formattingmask.MaskUpperLetter;
import java.awt.Image;
import javax.swing.ImageIcon;

public class ProductScreen extends javax.swing.JFrame {
    String imageAdress = null;
    GetImageAdress getImageAdress = new GetImageAdress();
    int x = 0;
    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public ProductScreen() {
        initComponents();
        ConnectionModule connect = new ConnectionModule();
        connection = connect.getConnectionMySQL();
        outputName.setDocument(new MaskUpperLetter());
        outputLocalization.setDocument(new MaskUpperLetter());
        outputBrand.setDocument(new MaskUpperLetter());
        outputDescription.setDocument(new MaskUpperLetter());
        outputCode.setDocument(new MaskUpperLetter());
        outputQuantity.setDocument(new MaskJustNumbers());
        outputMinimumQuantity.setDocument(new MaskJustNumbers());
        outputExpense.setDocument(new MaskCash());
        outputPrice.setDocument(new MaskCash());
        outputProfit.setDocument(new MaskCash());
        outputProfitPercentage.setDocument(new MaskCash());
        outputProvider.setDocument(new MaskUpperLetter());
    }
    private void setProduct(){
        String[] id = this.getTitle().split(" ");
        outputCode.setText(id[1]);
        String sql ="select nameProduct, manyProduct, manyMinimumProduct, expensive, price, profit, profitPercent, location, brand, provider, descrition, photoAdress from product where barCode=?";
        try {
            pst=connection.prepareStatement(sql);
            pst.setString(1, id[1]);
            rs= pst.executeQuery();
            if(rs.next()){
                outputName.setText(rs.getString(1));
                outputQuantity.setText(rs.getString(2));
                outputMinimumQuantity.setText(rs.getString(3));
                outputExpense.setText(rs.getString(4).replace('.', ','));
                outputPrice.setText(rs.getString(5).replace('.', ','));
                outputProfit.setText(rs.getString(6).replace('.', ','));
                outputProfitPercentage.setText(rs.getString(7).replace('.', ','));
                outputLocalization.setText(rs.getString(8));
                outputBrand.setText(rs.getString(9));
                outputProvider.setText(rs.getString(10));
                outputDescription.setText(rs.getString(11));
                if(!rs.getString(12).equals("")){
                    outputPhoto.setText("");
                    imageAdress = rs.getString(12);
                    ImageIcon imagen = new ImageIcon(imageAdress);
                    outputPhoto.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(outputPhoto.getWidth(), outputPhoto.getHeight(), Image.SCALE_DEFAULT)));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCode = new javax.swing.JLabel();
        txtName = new javax.swing.JLabel();
        txtDescription = new javax.swing.JLabel();
        txtExpense = new javax.swing.JLabel();
        txtProfit = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JLabel();
        txtProvider = new javax.swing.JLabel();
        txtLocalization = new javax.swing.JLabel();
        outputProvider = new javax.swing.JTextField();
        outputQuantity = new javax.swing.JTextField();
        outputBrand = new javax.swing.JTextField();
        outputCode = new javax.swing.JTextField();
        outputProfitPercentage = new javax.swing.JTextField();
        outputExpense = new javax.swing.JTextField();
        txtProftPercentage = new javax.swing.JLabel();
        outputLocalization = new javax.swing.JTextField();
        txtPrice = new javax.swing.JLabel();
        outputProfit = new javax.swing.JTextField();
        outputName = new javax.swing.JTextField();
        outputPrice = new javax.swing.JTextField();
        outputPhoto = new javax.swing.JButton();
        buttonLocale = new javax.swing.JButton();
        txtBrand = new javax.swing.JLabel();
        tableNewProduct = new javax.swing.JScrollPane();
        outputDescription = new javax.swing.JTextArea();
        txtProduct = new javax.swing.JLabel();
        buttonEdit = new javax.swing.JButton();
        buttonRequest = new javax.swing.JButton();
        buttonPrinter = new javax.swing.JButton();
        txtMinimumQuantity = new javax.swing.JLabel();
        outputMinimumQuantity = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produto");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        txtCode.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtCode.setText("Código");
        getContentPane().add(txtCode);
        txtCode.setBounds(20, 100, 60, 19);

        txtName.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtName.setText("Nome");
        getContentPane().add(txtName);
        txtName.setBounds(240, 100, 80, 19);

        txtDescription.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtDescription.setText("Descrição");
        getContentPane().add(txtDescription);
        txtDescription.setBounds(20, 380, 80, 19);

        txtExpense.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtExpense.setText("Custo");
        getContentPane().add(txtExpense);
        txtExpense.setBounds(340, 170, 80, 19);

        txtProfit.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtProfit.setText("Lucro");
        getContentPane().add(txtProfit);
        txtProfit.setBounds(20, 240, 50, 19);

        txtQuantity.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtQuantity.setText("Quantidade");
        getContentPane().add(txtQuantity);
        txtQuantity.setBounds(20, 170, 110, 19);

        txtProvider.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtProvider.setText("Fornecedor");
        getContentPane().add(txtProvider);
        txtProvider.setBounds(310, 310, 110, 19);

        txtLocalization.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtLocalization.setText("Localização");
        getContentPane().add(txtLocalization);
        txtLocalization.setBounds(460, 240, 110, 19);

        outputProvider.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(outputProvider);
        outputProvider.setBounds(310, 340, 300, 30);

        outputQuantity.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(outputQuantity);
        outputQuantity.setBounds(20, 200, 90, 30);

        outputBrand.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(outputBrand);
        outputBrand.setBounds(20, 340, 240, 30);

        outputCode.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(outputCode);
        outputCode.setBounds(20, 130, 170, 30);

        outputProfitPercentage.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(outputProfitPercentage);
        outputProfitPercentage.setBounds(210, 270, 110, 30);

        outputExpense.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(outputExpense);
        outputExpense.setBounds(340, 200, 110, 30);

        txtProftPercentage.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtProftPercentage.setText("Porcentagem de Lucro");
        getContentPane().add(txtProftPercentage);
        txtProftPercentage.setBounds(210, 240, 180, 19);

        outputLocalization.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(outputLocalization);
        outputLocalization.setBounds(460, 270, 120, 30);

        txtPrice.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtPrice.setText("Preço de Venda");
        getContentPane().add(txtPrice);
        txtPrice.setBounds(500, 170, 130, 19);

        outputProfit.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(outputProfit);
        outputProfit.setBounds(20, 270, 100, 30);

        outputName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(outputName);
        outputName.setBounds(240, 130, 380, 30);

        outputPrice.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(outputPrice);
        outputPrice.setBounds(500, 200, 90, 30);

        outputPhoto.setText("FOTO");
        outputPhoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        outputPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputPhotoActionPerformed(evt);
            }
        });
        outputPhoto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                outputPhotoKeyPressed(evt);
            }
        });
        getContentPane().add(outputPhoto);
        outputPhoto.setBounds(650, 100, 180, 230);

        buttonLocale.setText("LOCALIZAR");
        buttonLocale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLocaleActionPerformed(evt);
            }
        });
        getContentPane().add(buttonLocale);
        buttonLocale.setBounds(730, 470, 100, 25);

        txtBrand.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtBrand.setText("Marca");
        getContentPane().add(txtBrand);
        txtBrand.setBounds(20, 310, 80, 19);

        outputDescription.setColumns(20);
        outputDescription.setRows(5);
        tableNewProduct.setViewportView(outputDescription);

        getContentPane().add(tableNewProduct);
        tableNewProduct.setBounds(20, 410, 600, 140);

        txtProduct.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtProduct.setText("PRODUTO");
        getContentPane().add(txtProduct);
        txtProduct.setBounds(310, 10, 220, 60);

        buttonEdit.setText("EDITAR");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEdit);
        buttonEdit.setBounds(640, 470, 80, 25);

        buttonRequest.setText("PEDIR");
        buttonRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRequestActionPerformed(evt);
            }
        });
        getContentPane().add(buttonRequest);
        buttonRequest.setBounds(640, 510, 77, 25);

        buttonPrinter.setText("IMPRIMIR");
        getContentPane().add(buttonPrinter);
        buttonPrinter.setBounds(730, 510, 100, 25);

        txtMinimumQuantity.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtMinimumQuantity.setText("Quantidade Mínima");
        getContentPane().add(txtMinimumQuantity);
        txtMinimumQuantity.setBounds(150, 170, 150, 19);

        outputMinimumQuantity.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(outputMinimumQuantity);
        outputMinimumQuantity.setBounds(150, 200, 110, 30);

        setSize(new java.awt.Dimension(855, 596));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLocaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLocaleActionPerformed
        LocaleProduct localeProduct = new LocaleProduct();
        this.dispose();
        localeProduct.setVisible(true);
    }//GEN-LAST:event_buttonLocaleActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        NewProduct newProduct = new NewProduct();
        this.dispose();
        newProduct.txtNewProduct.setText("EDITAR PRODUTO");
        String[] id = this.getTitle().split(" ");
        newProduct.setTitle("Editar Produto " + id[1]);
        newProduct.setVisible(true);
    }//GEN-LAST:event_buttonEditActionPerformed

    private void outputPhotoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_outputPhotoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputPhotoKeyPressed

    private void outputPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputPhotoActionPerformed
        ImageScreen productImage = new ImageScreen();
        productImage.adress = imageAdress;
        productImage.setVisible(true);
    }//GEN-LAST:event_outputPhotoActionPerformed

    private void buttonRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRequestActionPerformed
        NewOrder newOrder = new NewOrder();
        newOrder.setVisible(true);
    }//GEN-LAST:event_buttonRequestActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if(x==0){
            x++;
            setProduct();
        }
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(ProductScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonLocale;
    private javax.swing.JButton buttonPrinter;
    public static javax.swing.JButton buttonRequest;
    private javax.swing.JTextField outputBrand;
    private javax.swing.JTextField outputCode;
    private javax.swing.JTextArea outputDescription;
    private javax.swing.JTextField outputExpense;
    private javax.swing.JTextField outputLocalization;
    private javax.swing.JTextField outputMinimumQuantity;
    private javax.swing.JTextField outputName;
    public static javax.swing.JButton outputPhoto;
    private javax.swing.JTextField outputPrice;
    private javax.swing.JTextField outputProfit;
    private javax.swing.JTextField outputProfitPercentage;
    private javax.swing.JTextField outputProvider;
    private javax.swing.JTextField outputQuantity;
    private javax.swing.JScrollPane tableNewProduct;
    private javax.swing.JLabel txtBrand;
    private javax.swing.JLabel txtCode;
    private javax.swing.JLabel txtDescription;
    private javax.swing.JLabel txtExpense;
    private javax.swing.JLabel txtLocalization;
    private javax.swing.JLabel txtMinimumQuantity;
    private javax.swing.JLabel txtName;
    private javax.swing.JLabel txtPrice;
    private javax.swing.JLabel txtProduct;
    private javax.swing.JLabel txtProfit;
    private javax.swing.JLabel txtProftPercentage;
    private javax.swing.JLabel txtProvider;
    private javax.swing.JLabel txtQuantity;
    // End of variables declaration//GEN-END:variables
}

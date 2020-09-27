/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screens;

/**
 *
 * @author Alunos
 */
public class ProductsBestSellers extends javax.swing.JFrame {

    /**
     * Creates new form ProductsBestSellers
     */
    public ProductsBestSellers() {
        initComponents();
        buttonRequest.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBestSellers = new javax.swing.JLabel();
        tableProductsBestSellers = new javax.swing.JScrollPane();
        tableBestSellers = new javax.swing.JTable();
        buttonShow = new javax.swing.JButton();
        buttonRequest = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mais Vendidos");
        setResizable(false);
        getContentPane().setLayout(null);

        txtBestSellers.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtBestSellers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtBestSellers.setText("MAIS VENDIDOS");
        getContentPane().add(txtBestSellers);
        txtBestSellers.setBounds(210, 20, 270, 32);

        tableBestSellers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Código de Barras", "Nome", "Preço"
            }
        ));
        tableProductsBestSellers.setViewportView(tableBestSellers);

        getContentPane().add(tableProductsBestSellers);
        tableProductsBestSellers.setBounds(20, 80, 640, 330);

        buttonShow.setText("MOSTRAR");
        buttonShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonShowActionPerformed(evt);
            }
        });
        getContentPane().add(buttonShow);
        buttonShow.setBounds(20, 418, 90, 32);

        buttonRequest.setText("PEDIR");
        buttonRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRequestActionPerformed(evt);
            }
        });
        getContentPane().add(buttonRequest);
        buttonRequest.setBounds(130, 418, 77, 32);

        setSize(new java.awt.Dimension(691, 487));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonShowActionPerformed
        ProductScreen productScreen = new ProductScreen();
        productScreen.setVisible(true);
    }//GEN-LAST:event_buttonShowActionPerformed

    private void buttonRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRequestActionPerformed
        NewOrder newOrder = new NewOrder();
        newOrder.setVisible(true);
    }//GEN-LAST:event_buttonRequestActionPerformed

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
            java.util.logging.Logger.getLogger(ProductsBestSellers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductsBestSellers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductsBestSellers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductsBestSellers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductsBestSellers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton buttonRequest;
    private javax.swing.JButton buttonShow;
    private javax.swing.JTable tableBestSellers;
    private javax.swing.JScrollPane tableProductsBestSellers;
    public static javax.swing.JLabel txtBestSellers;
    // End of variables declaration//GEN-END:variables
}

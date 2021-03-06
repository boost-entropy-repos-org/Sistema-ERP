package screens;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import connectionbd.ConnectionModule;
public class AllOrders extends javax.swing.JFrame {
    int x = 0;
    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public AllOrders() {
        initComponents();
        ConnectionModule connect = new ConnectionModule();
        connection = connect.getConnectionMySQL();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtAllOrders = new javax.swing.JLabel();
        tableAllOrder = new javax.swing.JScrollPane();
        tableOrders = new javax.swing.JTable();
        inputIdentification = new javax.swing.JTextField();
        buttonShow = new javax.swing.JButton();
        buttonPrinter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Todos os Pedidos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        txtAllOrders.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtAllOrders.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAllOrders.setText("TODOS OS PEDIDOS");
        getContentPane().add(txtAllOrders);
        txtAllOrders.setBounds(140, 10, 390, 32);

        tableOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cód Pedido", "Data do Pedido", "Valor", "Cliente", "Nome", "CPF / CNPJ"
            }
        ));
        tableAllOrder.setViewportView(tableOrders);

        getContentPane().add(tableAllOrder);
        tableAllOrder.setBounds(20, 130, 620, 300);

        inputIdentification.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        inputIdentification.setText("CPF / CNPJ");
        inputIdentification.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputIdentificationFocusGained(evt);
            }
        });
        inputIdentification.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputIdentificationKeyTyped(evt);
            }
        });
        getContentPane().add(inputIdentification);
        inputIdentification.setBounds(20, 80, 190, 30);

        buttonShow.setText("MOSTRAR");
        buttonShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonShowActionPerformed(evt);
            }
        });
        getContentPane().add(buttonShow);
        buttonShow.setBounds(240, 80, 90, 30);

        buttonPrinter.setText("IMPRIMIR");
        getContentPane().add(buttonPrinter);
        buttonPrinter.setBounds(360, 80, 90, 25);

        setSize(new java.awt.Dimension(671, 474));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonShowActionPerformed
        OrderScreen orderScreen = new OrderScreen();
        orderScreen.setVisible(true);
    }//GEN-LAST:event_buttonShowActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void inputIdentificationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputIdentificationKeyTyped
        if(inputIdentification.getText().equals("")){
            inputIdentification.setText("CPF / CNPJ");
            x=0;
        }
        else if(x==0){
            x++;
            inputIdentification.setText("");
        }
    }//GEN-LAST:event_inputIdentificationKeyTyped

    private void inputIdentificationFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputIdentificationFocusGained
        inputIdentification.selectAll();
    }//GEN-LAST:event_inputIdentificationFocusGained

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
            java.util.logging.Logger.getLogger(AllOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllOrders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonPrinter;
    private javax.swing.JButton buttonShow;
    private javax.swing.JTextField inputIdentification;
    private javax.swing.JScrollPane tableAllOrder;
    private javax.swing.JTable tableOrders;
    public static javax.swing.JLabel txtAllOrders;
    // End of variables declaration//GEN-END:variables
}

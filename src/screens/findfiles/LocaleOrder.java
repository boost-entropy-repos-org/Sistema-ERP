package screens.findfiles;
import callframes.CallOtherFrame;
import functioncontroller.LimitNumberCharacters;
import javax.swing.JFrame;
import screen.allfiles.AllOrder;
import screens.files.editfiles.OrderEditOrder;
import setsoons.SetAndOrganizeSoons;

/**
 *
 * @author willi
 */
public class LocaleOrder extends setsoons.AuxiliaryJFrame {

    /**
     * Creates new form LocaleOrder
     */
    public LocaleOrder() {
        initComponents();
        inputCodeParts.setDocument(new LimitNumberCharacters());
    }
    SetAndOrganizeSoons setAndOrganizeSoons = new SetAndOrganizeSoons();
    boolean inicializedWindow = false;
    private void callOtherScreen(JFrame screen){
        CallOtherFrame callOtherFrame = new CallOtherFrame();
        callOtherFrame.callOtherScreen(screen);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCodeOrder = new javax.swing.JLabel();
        soonProxxi = new javax.swing.JLabel();
        soonTavile = new javax.swing.JLabel();
        txtFindOrder = new javax.swing.JLabel();
        buttonFindOrder = new javax.swing.JButton();
        inputCodeParts = new javax.swing.JTextField();
        txtCodeParts = new javax.swing.JLabel();
        inputCodeOrder = new javax.swing.JFormattedTextField();
        buttonFindAllOrders = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Localizar Pedido");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        txtCodeOrder.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtCodeOrder.setText("Código do pedido");

        txtFindOrder.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtFindOrder.setText("Localizar Pedido");

        buttonFindOrder.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        buttonFindOrder.setText("Localizar");
        buttonFindOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFindOrderActionPerformed(evt);
            }
        });

        inputCodeParts.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        inputCodeParts.setForeground(new java.awt.Color(51, 51, 51));
        inputCodeParts.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputCodePartsKeyPressed(evt);
            }
        });

        txtCodeParts.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtCodeParts.setText("Código da peça");

        inputCodeOrder.setForeground(new java.awt.Color(51, 51, 51));
        try {
            inputCodeOrder.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        inputCodeOrder.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        buttonFindAllOrders.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        buttonFindAllOrders.setText("Todos os Pedidos");
        buttonFindAllOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFindAllOrdersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(soonTavile, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addComponent(soonProxxi, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodeOrder)
                    .addComponent(buttonFindOrder)
                    .addComponent(txtCodeParts))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputCodeOrder)
                            .addComponent(inputCodeParts))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonFindAllOrders)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtFindOrder)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(soonTavile, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soonProxxi, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFindOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodeOrder)
                    .addComponent(inputCodeOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodeParts)
                    .addComponent(inputCodeParts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonFindOrder)
                    .addComponent(buttonFindAllOrders))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(581, 321));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputCodePartsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputCodePartsKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCodePartsKeyPressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if(inicializedWindow==false){
            inicializedWindow = true;
            setAndOrganizeSoons.SetSoons(this);
            setAndOrganizeSoons.SetLocationSoons(this, soonTavile.getX(), soonTavile.getY(), soonProxxi.getX(), soonProxxi.getY());
        }
    }//GEN-LAST:event_formWindowActivated

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        setAndOrganizeSoons.SetLocationSoons(this, soonTavile.getX(), soonTavile.getY(), soonProxxi.getX(), soonProxxi.getY());
    }//GEN-LAST:event_formComponentResized

    private void buttonFindOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFindOrderActionPerformed
        OrderEditOrder editOrder = new OrderEditOrder();
        editOrder.txtOrderEditOrder.setText("Pedido");
        editOrder.buttonOrderEditOrder.setText("EDITAR");
        editOrder.setTitle("Pedido");
        this.dispose();
        callOtherScreen(editOrder);
    }//GEN-LAST:event_buttonFindOrderActionPerformed

    private void buttonFindAllOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFindAllOrdersActionPerformed
        AllOrder allOrder = new AllOrder();
        this.dispose();
        callOtherScreen(allOrder);
    }//GEN-LAST:event_buttonFindAllOrdersActionPerformed

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
            java.util.logging.Logger.getLogger(LocaleOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LocaleOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LocaleOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LocaleOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LocaleOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonFindAllOrders;
    private javax.swing.JButton buttonFindOrder;
    private javax.swing.JFormattedTextField inputCodeOrder;
    private javax.swing.JTextField inputCodeParts;
    public static javax.swing.JLabel soonProxxi;
    public static javax.swing.JLabel soonTavile;
    private javax.swing.JLabel txtCodeOrder;
    private javax.swing.JLabel txtCodeParts;
    private javax.swing.JLabel txtFindOrder;
    // End of variables declaration//GEN-END:variables
}
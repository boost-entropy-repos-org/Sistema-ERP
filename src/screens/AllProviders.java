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
public class AllProviders extends javax.swing.JFrame {
    int x = 0;
    /**
     * Creates new form AllProviders
     */
    public AllProviders() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtAllProviders = new javax.swing.JLabel();
        tableAllProviders = new javax.swing.JScrollPane();
        tableProviders = new javax.swing.JTable();
        inputIdentification = new javax.swing.JTextField();
        buttonShow = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Todos os Fornecedores");
        setResizable(false);
        getContentPane().setLayout(null);

        txtAllProviders.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtAllProviders.setText("TODOS OS FORNECEDORES");
        getContentPane().add(txtAllProviders);
        txtAllProviders.setBounds(160, 10, 340, 32);

        tableProviders.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cód Pedido", "CPF / CNPJ", "Nome Fantasia", "Telefone", "Endereço", "Número"
            }
        ));
        tableAllProviders.setViewportView(tableProviders);

        getContentPane().add(tableAllProviders);
        tableAllProviders.setBounds(20, 120, 620, 310);

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
        inputIdentification.setBounds(20, 80, 190, 25);

        buttonShow.setText("MOSTRAR");
        buttonShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonShowActionPerformed(evt);
            }
        });
        getContentPane().add(buttonShow);
        buttonShow.setBounds(240, 80, 90, 25);

        setSize(new java.awt.Dimension(666, 472));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputIdentificationFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputIdentificationFocusGained
        inputIdentification.selectAll();
    }//GEN-LAST:event_inputIdentificationFocusGained

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

    private void buttonShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonShowActionPerformed
        ProviderScreen providerScreen = new ProviderScreen();
        providerScreen.setVisible(true);
    }//GEN-LAST:event_buttonShowActionPerformed

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
            java.util.logging.Logger.getLogger(AllProviders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllProviders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllProviders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllProviders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllProviders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonShow;
    private javax.swing.JTextField inputIdentification;
    private javax.swing.JScrollPane tableAllProviders;
    private javax.swing.JTable tableProviders;
    private javax.swing.JLabel txtAllProviders;
    // End of variables declaration//GEN-END:variables
}

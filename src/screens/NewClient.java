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
public class NewClient extends javax.swing.JFrame {

    /**
     * Creates new form NewClient
     */
    public NewClient() {
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

        jLabel1 = new javax.swing.JLabel();
        txtBirthDay = new javax.swing.JLabel();
        txtName = new javax.swing.JLabel();
        txtCPF = new javax.swing.JLabel();
        txtPhone = new javax.swing.JLabel();
        txtCEP = new javax.swing.JLabel();
        txtStreet = new javax.swing.JLabel();
        txtNumberHouse = new javax.swing.JLabel();
        txtComplement = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        txtCellPhone = new javax.swing.JLabel();
        txtCadastreClient = new javax.swing.JLabel();
        inputName = new javax.swing.JTextField();
        inputCPF = new javax.swing.JFormattedTextField();
        inputBirthDay = new javax.swing.JFormattedTextField();
        inputPhone = new javax.swing.JFormattedTextField();
        inputCellphone = new javax.swing.JFormattedTextField();
        inputEmail = new javax.swing.JTextField();
        inputCEP = new javax.swing.JFormattedTextField();
        inputStreet = new javax.swing.JTextField();
        inputNumberHouse = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputComplement = new javax.swing.JTextArea();
        buttonPhoto = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();
        txtCity = new javax.swing.JLabel();
        inputCity = new javax.swing.JTextField();
        txtState = new javax.swing.JLabel();
        inputState = new javax.swing.JComboBox<>();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        setResizable(false);
        getContentPane().setLayout(null);

        txtBirthDay.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtBirthDay.setText("Data de Nascimento");
        getContentPane().add(txtBirthDay);
        txtBirthDay.setBounds(530, 95, 175, 24);

        txtName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtName.setText("Nome");
        getContentPane().add(txtName);
        txtName.setBounds(40, 95, 52, 24);

        txtCPF.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtCPF.setText("CPF / CNPJ");
        getContentPane().add(txtCPF);
        txtCPF.setBounds(290, 95, 120, 24);

        txtPhone.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtPhone.setText("Telefone");
        getContentPane().add(txtPhone);
        txtPhone.setBounds(40, 160, 77, 30);

        txtCEP.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtCEP.setText("CEP");
        getContentPane().add(txtCEP);
        txtCEP.setBounds(40, 240, 37, 24);

        txtStreet.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtStreet.setText("Rua");
        getContentPane().add(txtStreet);
        txtStreet.setBounds(290, 240, 34, 24);

        txtNumberHouse.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtNumberHouse.setText("Nº");
        getContentPane().add(txtNumberHouse);
        txtNumberHouse.setBounds(530, 240, 20, 24);

        txtComplement.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtComplement.setText("Complemento");
        getContentPane().add(txtComplement);
        txtComplement.setBounds(40, 380, 124, 24);

        txtEmail.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtEmail.setText("E-mail");
        getContentPane().add(txtEmail);
        txtEmail.setBounds(530, 160, 55, 30);

        txtCellPhone.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtCellPhone.setText("Celular");
        getContentPane().add(txtCellPhone);
        txtCellPhone.setBounds(290, 160, 62, 30);

        txtCadastreClient.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtCadastreClient.setText("Cadastro de Cliente");
        getContentPane().add(txtCadastreClient);
        txtCadastreClient.setBounds(268, 40, 225, 32);

        inputName.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        getContentPane().add(inputName);
        inputName.setBounds(40, 125, 219, 30);

        inputCPF.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        getContentPane().add(inputCPF);
        inputCPF.setBounds(290, 125, 130, 30);

        inputBirthDay.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        getContentPane().add(inputBirthDay);
        inputBirthDay.setBounds(530, 125, 159, 30);

        inputPhone.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        getContentPane().add(inputPhone);
        inputPhone.setBounds(40, 190, 184, 30);

        inputCellphone.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        getContentPane().add(inputCellphone);
        inputCellphone.setBounds(290, 190, 140, 30);

        inputEmail.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        getContentPane().add(inputEmail);
        inputEmail.setBounds(530, 190, 185, 30);

        inputCEP.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        getContentPane().add(inputCEP);
        inputCEP.setBounds(40, 270, 194, 30);

        inputStreet.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        getContentPane().add(inputStreet);
        inputStreet.setBounds(290, 270, 189, 30);

        inputNumberHouse.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        getContentPane().add(inputNumberHouse);
        inputNumberHouse.setBounds(530, 270, 98, 30);

        inputComplement.setColumns(20);
        inputComplement.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        inputComplement.setRows(5);
        jScrollPane1.setViewportView(inputComplement);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(43, 412, 553, 120);

        buttonPhoto.setText("FOTO");
        getContentPane().add(buttonPhoto);
        buttonPhoto.setBounds(620, 460, 61, 30);

        buttonSave.setText("SALVAR");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSave);
        buttonSave.setBounds(620, 500, 80, 30);

        txtCity.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtCity.setText("Cidade");
        getContentPane().add(txtCity);
        txtCity.setBounds(40, 310, 80, 24);

        inputCity.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        getContentPane().add(inputCity);
        inputCity.setBounds(40, 340, 189, 30);

        txtState.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtState.setText("Estado");
        getContentPane().add(txtState);
        txtState.setBounds(290, 310, 80, 24);

        inputState.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        inputState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        getContentPane().add(inputState);
        inputState.setBounds(290, 340, 140, 35);

        setSize(new java.awt.Dimension(765, 569));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        ClientScreen clientScreen = new ClientScreen();
        this.dispose();
        clientScreen.setVisible(true);
    }//GEN-LAST:event_buttonSaveActionPerformed

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
            java.util.logging.Logger.getLogger(NewClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonPhoto;
    private javax.swing.JButton buttonSave;
    private javax.swing.JFormattedTextField inputBirthDay;
    private javax.swing.JFormattedTextField inputCEP;
    private javax.swing.JFormattedTextField inputCPF;
    private javax.swing.JFormattedTextField inputCellphone;
    private javax.swing.JTextField inputCity;
    private javax.swing.JTextArea inputComplement;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputNumberHouse;
    private javax.swing.JFormattedTextField inputPhone;
    private javax.swing.JComboBox<String> inputState;
    private javax.swing.JTextField inputStreet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtBirthDay;
    private javax.swing.JLabel txtCEP;
    private javax.swing.JLabel txtCPF;
    private javax.swing.JLabel txtCadastreClient;
    private javax.swing.JLabel txtCellPhone;
    private javax.swing.JLabel txtCity;
    private javax.swing.JLabel txtComplement;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtName;
    private javax.swing.JLabel txtNumberHouse;
    private javax.swing.JLabel txtPhone;
    private javax.swing.JLabel txtState;
    private javax.swing.JLabel txtStreet;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package submenus;

/**
 *
 * @author Alunos
 */
public class DiaryMenu extends javax.swing.JFrame {

    /**
     * Creates new form DiaryMenu
     */
    public DiaryMenu() {
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

        txtNewRecord = new javax.swing.JLabel();
        buttonNewRecord = new javax.swing.JButton();
        txtNotes = new javax.swing.JLabel();
        buttonNotes = new javax.swing.JButton();
        txtCommitments = new javax.swing.JLabel();
        buttonCommitments = new javax.swing.JButton();
        txtTasks = new javax.swing.JLabel();
        buttonTasks = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });

        txtNewRecord.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNewRecord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNewRecord.setText("NOVO");
        txtNewRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNewRecordMouseClicked(evt);
            }
        });

        buttonNewRecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tasks.png"))); // NOI18N
        buttonNewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNewRecordActionPerformed(evt);
            }
        });

        txtNotes.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNotes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNotes.setText("LEMBRETES");
        txtNotes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNotesMouseClicked(evt);
            }
        });

        buttonNotes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stickNotes.png"))); // NOI18N
        buttonNotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNotesActionPerformed(evt);
            }
        });

        txtCommitments.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtCommitments.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCommitments.setText("COMPROMISSOS");
        txtCommitments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCommitmentsMouseClicked(evt);
            }
        });

        buttonCommitments.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/toDo.png"))); // NOI18N
        buttonCommitments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCommitmentsActionPerformed(evt);
            }
        });

        txtTasks.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtTasks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTasks.setText("TAREFAS");
        txtTasks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTasksMouseClicked(evt);
            }
        });

        buttonTasks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/newTask.png"))); // NOI18N
        buttonTasks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTasksActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNewRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonNewRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtCommitments, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(buttonCommitments, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTasks, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTasks, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(buttonNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(txtNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(txtNotes))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(buttonNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(buttonTasks, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTasks)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonNewRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonCommitments, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNewRecord)
                            .addComponent(txtCommitments))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNewRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNewRecordMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewRecordMouseClicked

    private void buttonNewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewRecordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonNewRecordActionPerformed

    private void txtNotesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNotesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNotesMouseClicked

    private void buttonNotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNotesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonNotesActionPerformed

    private void txtCommitmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCommitmentsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommitmentsMouseClicked

    private void buttonCommitmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCommitmentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCommitmentsActionPerformed

    private void txtTasksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTasksMouseClicked

    }//GEN-LAST:event_txtTasksMouseClicked

    private void buttonTasksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTasksActionPerformed

    }//GEN-LAST:event_buttonTasksActionPerformed

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        this.dispose();
    }//GEN-LAST:event_formWindowLostFocus

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
            java.util.logging.Logger.getLogger(DiaryMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiaryMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiaryMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiaryMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiaryMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCommitments;
    private javax.swing.JButton buttonNewRecord;
    private javax.swing.JButton buttonNotes;
    private javax.swing.JButton buttonTasks;
    private javax.swing.JLabel txtCommitments;
    private javax.swing.JLabel txtNewRecord;
    private javax.swing.JLabel txtNotes;
    private javax.swing.JLabel txtTasks;
    // End of variables declaration//GEN-END:variables
}
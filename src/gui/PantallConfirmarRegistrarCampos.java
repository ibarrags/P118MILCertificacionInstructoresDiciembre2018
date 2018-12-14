package gui;

import java.awt.event.WindowEvent;
import modelo_clases.Establecimiento;

/**
 *
 * @author gustavo
 */
public class PantallConfirmarRegistrarCampos extends javax.swing.JFrame {
    private Establecimiento establecimiento;
    
    public PantallConfirmarRegistrarCampos(Establecimiento unEstablecimiento) {
        this.establecimiento= unEstablecimiento;
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
        ButtonCancelarRegistro = new javax.swing.JButton();
        ButtonConfirmarRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Confirmación Registrar Establecimiento");

        jLabel1.setText("¿Confirma el registro del Establecimiento?");

        ButtonCancelarRegistro.setText("Cancelar");
        ButtonCancelarRegistro.setAlignmentX(0.5F);
        ButtonCancelarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarRegistroActionPerformed(evt);
            }
        });

        ButtonConfirmarRegistro.setText("Confirmar");
        ButtonConfirmarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConfirmarRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonCancelarRegistro)
                        .addGap(165, 165, 165)
                        .addComponent(ButtonConfirmarRegistro))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCancelarRegistro)
                    .addComponent(ButtonConfirmarRegistro))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCancelarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarRegistroActionPerformed
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));                
    }//GEN-LAST:event_ButtonCancelarRegistroActionPerformed

    private void ButtonConfirmarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConfirmarRegistroActionPerformed
            //this.setVisible(false);
            new PantallaRegistoCampoExitoso(this.establecimiento).setVisible(true);
    }//GEN-LAST:event_ButtonConfirmarRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(PantallConfirmarRegistrarCampos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallConfirmarRegistrarCampos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallConfirmarRegistrarCampos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallConfirmarRegistrarCampos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new PantallConfirmarRegistrarCampos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancelarRegistro;
    private javax.swing.JButton ButtonConfirmarRegistro;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
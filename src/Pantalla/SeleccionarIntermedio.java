/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pantallas;

import Pantallas.Indicaciones.*;

/**
 *
 * @author USER
 */
public class SeleccionarIntermedio extends javax.swing.JFrame {

    /**
     * Creates new form SeleccionarPrincipiante
     */
    public SeleccionarIntermedio() {
        initComponents();
        jbtnConjugacion.setText("<html><p>Conjugación :</p><p>Tiempo Presente</p></html>");
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnConjugacion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbtnOraciones = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jbtnDeseo = new javax.swing.JButton();
        jbtnRegresar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnConjugacion.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jbtnConjugacion.setForeground(new java.awt.Color(255, 255, 255));
        jbtnConjugacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ButtonTPresente.png"))); // NOI18N
        jbtnConjugacion.setBorder(null);
        jbtnConjugacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConjugacionActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnConjugacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 190, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/image 29.png"))); // NOI18N
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, 110));

        jbtnOraciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnOraciones.setForeground(new java.awt.Color(255, 255, 255));
        jbtnOraciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ButtonOraciones.png"))); // NOI18N
        jbtnOraciones.setBorder(null);
        jbtnOraciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnOracionesActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnOraciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 210, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/image 21.png"))); // NOI18N
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 110));

        jbtnDeseo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnDeseo.setForeground(new java.awt.Color(255, 255, 255));
        jbtnDeseo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ButtonDeseo.png"))); // NOI18N
        jbtnDeseo.setBorder(null);
        jbtnDeseo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeseoActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDeseo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 200, 110));

        jbtnRegresar.setFont(new java.awt.Font("Sitka Text", 1, 20)); // NOI18N
        jbtnRegresar.setText("<--   Regresar");
        jbtnRegresar.setBorder(null);
        jbtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Desktop - 42.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnConjugacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConjugacionActionPerformed
    I_Intermedio_Tiempo ejercicio = new I_Intermedio_Tiempo();
    ejercicio.setVisible(true);
    this.dispose();    
    }//GEN-LAST:event_jbtnConjugacionActionPerformed

    private void jbtnDeseoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeseoActionPerformed
    I_Intermedio_Deseo ejercicio = new I_Intermedio_Deseo();
    ejercicio.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jbtnDeseoActionPerformed

    private void jbtnOracionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnOracionesActionPerformed
    I_Intermedio_Oraciones ejercicio = new I_Intermedio_Oraciones();
    ejercicio.setVisible(true);
    this.dispose();    
    }//GEN-LAST:event_jbtnOracionesActionPerformed

    private void jbtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegresarActionPerformed
        SeleccionarNivel menu = new SeleccionarNivel();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(SeleccionarIntermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeleccionarIntermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeleccionarIntermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeleccionarIntermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeleccionarIntermedio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbtnConjugacion;
    private javax.swing.JButton jbtnDeseo;
    private javax.swing.JButton jbtnOraciones;
    private javax.swing.JButton jbtnRegresar;
    // End of variables declaration//GEN-END:variables
}

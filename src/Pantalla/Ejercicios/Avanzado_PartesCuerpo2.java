
package Pantallas.Ejercicios;

import Pantallas.*;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import Pantallas.Indicaciones.I_Avanzado_PartesCuerpo;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JOptionPane;


public class Avanzado_PartesCuerpo2 extends javax.swing.JFrame {
    
    private int SUM1;
    public void setDatos(int SUM) {
        this.SUM1 = SUM;
    }
    int puntos = 0;
    int SUM2 = 0;
    
    public Avanzado_PartesCuerpo2() {
        initComponents();
        this.setSize(735, 483);
        this.setLocationRelativeTo(null);
        addDocumentListener(jtxtPreg7,jpbProgreso);
        addDocumentListener(jtxtPreg8,jpbProgreso);
        addDocumentListener(jtxtPreg9,jpbProgreso);
        addDocumentListener(jtxtPreg10,jpbProgreso);
        addDocumentListener(jtxtPreg11,jpbProgreso);
        addDocumentListener(jtxtPreg12,jpbProgreso);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtxtPreg8 = new javax.swing.JTextField();
        jtxtPreg9 = new javax.swing.JTextField();
        jtxtPreg11 = new javax.swing.JTextField();
        jtxtPreg10 = new javax.swing.JTextField();
        jtxtPreg12 = new javax.swing.JTextField();
        jtxtPreg7 = new javax.swing.JTextField();
        jpbProgreso = new javax.swing.JProgressBar();
        jbtnRegresar = new javax.swing.JButton();
        jbtnContinuar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtPreg8.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jtxtPreg8.setForeground(new java.awt.Color(0, 0, 0));
        jtxtPreg8.setBorder(null);
        jPanel1.add(jtxtPreg8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 140, 20));

        jtxtPreg9.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jtxtPreg9.setForeground(new java.awt.Color(0, 0, 0));
        jtxtPreg9.setBorder(null);
        jPanel1.add(jtxtPreg9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 140, 20));

        jtxtPreg11.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jtxtPreg11.setForeground(new java.awt.Color(0, 0, 0));
        jtxtPreg11.setBorder(null);
        jPanel1.add(jtxtPreg11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 140, 20));

        jtxtPreg10.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jtxtPreg10.setForeground(new java.awt.Color(0, 0, 0));
        jtxtPreg10.setBorder(null);
        jtxtPreg10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtPreg10ActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtPreg10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 140, 20));

        jtxtPreg12.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jtxtPreg12.setForeground(new java.awt.Color(0, 0, 0));
        jtxtPreg12.setBorder(null);
        jPanel1.add(jtxtPreg12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 140, 20));

        jtxtPreg7.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jtxtPreg7.setForeground(new java.awt.Color(0, 0, 0));
        jtxtPreg7.setBorder(null);
        jPanel1.add(jtxtPreg7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 140, 20));

        jpbProgreso.setBackground(new java.awt.Color(175, 175, 175));
        jpbProgreso.setForeground(new java.awt.Color(255, 79, 79));
        jpbProgreso.setBorder(null);
        jPanel1.add(jpbProgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 350, 20));

        jbtnRegresar.setBackground(new java.awt.Color(255, 255, 255));
        jbtnRegresar.setFont(new java.awt.Font("Sitka Text", 1, 20)); // NOI18N
        jbtnRegresar.setForeground(new java.awt.Color(0, 0, 0));
        jbtnRegresar.setText("<--   Regresar");
        jbtnRegresar.setBorder(null);
        jbtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 140, 30));

        jbtnContinuar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnContinuar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ButtonConfirmar.png"))); // NOI18N
        jbtnContinuar.setBorder(null);
        jbtnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnContinuarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 220, 50));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Desktop - 51.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 440));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnContinuarActionPerformed
        if(jtxtPreg7.getText().toUpperCase().trim().equals("CUELLO")){
            SUM2++;
        }
        if(jtxtPreg8.getText().toUpperCase().trim().equals("NARIZ")){
            SUM2++;
        }
        if(jtxtPreg9.getText().toUpperCase().trim().equals("BARRIGA")){
            SUM2++;
        }
        if(jtxtPreg10.getText().toUpperCase().trim().equals("BOCA")){
            SUM2++;
        }
        if(jtxtPreg11.getText().toUpperCase().trim().equals("OJO")){
            SUM2++;
        }
        if(jtxtPreg12.getText().toUpperCase().trim().equals("OREJA")){
            SUM2++;
        }
        puntos = SUM2 + SUM1;
            Menu.user.SumarPuntos(puntos);
            System.out.println(Menu.user.getPuntos());
            Felicidades felicidades= new Felicidades(puntos*5);
            felicidades.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jbtnContinuarActionPerformed

    private void jbtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegresarActionPerformed
        I_Avanzado_PartesCuerpo regresar = new I_Avanzado_PartesCuerpo();
        regresar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnRegresarActionPerformed

    private void jtxtPreg10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtPreg10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtPreg10ActionPerformed
    private void addDocumentListener(JTextField textField, JProgressBar jpbProgreso) {
        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateProgressBar();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateProgressBar();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // No sirve en este caso
            }

            private void updateProgressBar() {
                int textFieldCount = 6; 
                int emptyFields = 0;
                if (jtxtPreg7.getText().isEmpty()) emptyFields++;
                if (jtxtPreg8.getText().isEmpty()) emptyFields++;
                if (jtxtPreg9.getText().isEmpty()) emptyFields++;
                if (jtxtPreg10.getText().isEmpty()) emptyFields++;
                if (jtxtPreg11.getText().isEmpty()) emptyFields++;
                if (jtxtPreg12.getText().isEmpty()) emptyFields++;

                int progressBarValue = (textFieldCount - emptyFields) * 17; // Aumentar un 17% por cada campo q no esta vacío
                jpbProgreso.setValue(progressBarValue);
            }
        });
    }

    public static void main(String args[]) {
       try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Avanzado_PartesCuerpo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Avanzado_PartesCuerpo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Avanzado_PartesCuerpo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Avanzado_PartesCuerpo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Avanzado_PartesCuerpo2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnContinuar;
    private javax.swing.JButton jbtnRegresar;
    private javax.swing.JProgressBar jpbProgreso;
    private javax.swing.JTextField jtxtPreg10;
    private javax.swing.JTextField jtxtPreg11;
    private javax.swing.JTextField jtxtPreg12;
    private javax.swing.JTextField jtxtPreg7;
    private javax.swing.JTextField jtxtPreg8;
    private javax.swing.JTextField jtxtPreg9;
    // End of variables declaration//GEN-END:variables
}

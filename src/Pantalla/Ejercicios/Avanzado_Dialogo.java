
package Pantallas.Ejercicios;

import Pantallas.*;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import Pantallas.Indicaciones.I_Avanzado_Dialogo;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JOptionPane;


public class Avanzado_Dialogo extends javax.swing.JFrame {
    int puntos = 0;
    public Avanzado_Dialogo() {
        initComponents();
        this.setSize(735, 483);
        this.setLocationRelativeTo(null);
        addDocumentListener(jtxtPreg1,jpbProgreso);
        addDocumentListener(jtxtPreg2,jpbProgreso);
        addDocumentListener(jtxtPreg3,jpbProgreso);
        addDocumentListener(jtxtPreg4,jpbProgreso);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtxtPreg2 = new javax.swing.JTextField();
        jtxtPreg3 = new javax.swing.JTextField();
        jtxtPreg4 = new javax.swing.JTextField();
        jtxtPreg1 = new javax.swing.JTextField();
        jpbProgreso = new javax.swing.JProgressBar();
        jbtnRegresar = new javax.swing.JButton();
        jbtnContinuar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtPreg2.setBackground(new java.awt.Color(255, 255, 255));
        jtxtPreg2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jtxtPreg2.setForeground(new java.awt.Color(0, 0, 0));
        jtxtPreg2.setBorder(null);
        jPanel1.add(jtxtPreg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 230, 20));

        jtxtPreg3.setBackground(new java.awt.Color(255, 255, 255));
        jtxtPreg3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jtxtPreg3.setForeground(new java.awt.Color(0, 0, 0));
        jtxtPreg3.setBorder(null);
        jPanel1.add(jtxtPreg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 240, 20));

        jtxtPreg4.setBackground(new java.awt.Color(255, 255, 255));
        jtxtPreg4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jtxtPreg4.setForeground(new java.awt.Color(0, 0, 0));
        jtxtPreg4.setBorder(null);
        jPanel1.add(jtxtPreg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 240, 20));

        jtxtPreg1.setBackground(new java.awt.Color(255, 255, 255));
        jtxtPreg1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jtxtPreg1.setForeground(new java.awt.Color(0, 0, 0));
        jtxtPreg1.setBorder(null);
        jPanel1.add(jtxtPreg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 230, 20));

        jpbProgreso.setBackground(new java.awt.Color(175, 175, 175));
        jpbProgreso.setForeground(new java.awt.Color(255, 79, 79));
        jpbProgreso.setBorder(null);
        jPanel1.add(jpbProgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 300, 20));

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
        jPanel1.add(jbtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 140, 20));

        jbtnContinuar.setBackground(new java.awt.Color(214, 42, 17));
        jbtnContinuar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnContinuar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnContinuar.setText("CONFIRMAR");
        jbtnContinuar.setBorder(null);
        jbtnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnContinuarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 140, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/EjercicioA_D.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnContinuarActionPerformed
if(jtxtPreg1.getText().toUpperCase().trim().equals("ALLINLLAM KACHKANI")){
            puntos++;
        }
        if(jtxtPreg2.getText().toUpperCase().trim().equals("SUTIYQA JUAN")){
            puntos++;
        }
        if(jtxtPreg3.getText().toUpperCase().trim().equals("RIQSISQAYRAYKU KUSIKUNI")){
            puntos++;
        }
        if(jtxtPreg4.getText().toUpperCase().trim().equals("ABANCAYMANTA KANI")){
            puntos++;
        }
        Menu.user.SumarPuntos(puntos);        
        System.out.println(Menu.user.getPuntos());
        Felicidades felicidades= new Felicidades(puntos*5);
        felicidades.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnContinuarActionPerformed

    private void jbtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegresarActionPerformed
        I_Avanzado_Dialogo regresar = new I_Avanzado_Dialogo();
        regresar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnRegresarActionPerformed
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
                int textFieldCount = 4; 
                int emptyFields = 0;
                if (jtxtPreg1.getText().isEmpty()) emptyFields++;
                if (jtxtPreg2.getText().isEmpty()) emptyFields++;
                if (jtxtPreg3.getText().isEmpty()) emptyFields++;
                if (jtxtPreg4.getText().isEmpty()) emptyFields++;

                int progressBarValue = (textFieldCount - emptyFields) * 25; // Aumentar un 25% por cada campo q no esta vacío
                jpbProgreso.setValue(progressBarValue);
            }
        });
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Avanzado_Dialogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnContinuar;
    private javax.swing.JButton jbtnRegresar;
    private javax.swing.JProgressBar jpbProgreso;
    private javax.swing.JTextField jtxtPreg1;
    private javax.swing.JTextField jtxtPreg2;
    private javax.swing.JTextField jtxtPreg3;
    private javax.swing.JTextField jtxtPreg4;
    // End of variables declaration//GEN-END:variables
}

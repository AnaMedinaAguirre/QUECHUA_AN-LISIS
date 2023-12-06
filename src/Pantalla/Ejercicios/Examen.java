
package Pantallas.Ejercicios;

import Pantallas.*;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class Examen extends javax.swing.JFrame {
    int puntos=0;
    public Examen() {
        initComponents();
        this.setLocationRelativeTo(null);
        addDocumentListener(jtxtPreg1,jpbProgreso);
        addDocumentListener(jtxtPreg2,jpbProgreso);
        addDocumentListener(jtxtPreg3,jpbProgreso);
        addDocumentListener(jtxtPreg4,jpbProgreso);
        addDocumentListener(jtxtPreg5,jpbProgreso);
        addDocumentListener(jtxtPreg6,jpbProgreso);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtxtPreg5 = new javax.swing.JTextField();
        jtxtPreg6 = new javax.swing.JTextField();
        jtxtPreg2 = new javax.swing.JTextField();
        jtxtPreg3 = new javax.swing.JTextField();
        jtxtPreg4 = new javax.swing.JTextField();
        jtxtPreg1 = new javax.swing.JTextField();
        jpbProgreso = new javax.swing.JProgressBar();
        jbtnRegresar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtPreg5.setBackground(new java.awt.Color(255, 255, 255));
        jtxtPreg5.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jtxtPreg5.setForeground(new java.awt.Color(0, 0, 0));
        jtxtPreg5.setBorder(null);
        jPanel1.add(jtxtPreg5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 160, 20));

        jtxtPreg6.setBackground(new java.awt.Color(255, 255, 255));
        jtxtPreg6.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jtxtPreg6.setForeground(new java.awt.Color(0, 0, 0));
        jtxtPreg6.setBorder(null);
        jPanel1.add(jtxtPreg6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 170, 30));

        jtxtPreg2.setBackground(new java.awt.Color(255, 255, 255));
        jtxtPreg2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jtxtPreg2.setForeground(new java.awt.Color(0, 0, 0));
        jtxtPreg2.setBorder(null);
        jPanel1.add(jtxtPreg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 170, 20));

        jtxtPreg3.setBackground(new java.awt.Color(255, 255, 255));
        jtxtPreg3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jtxtPreg3.setForeground(new java.awt.Color(0, 0, 0));
        jtxtPreg3.setBorder(null);
        jtxtPreg3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtPreg3ActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtPreg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 170, 20));

        jtxtPreg4.setBackground(new java.awt.Color(255, 255, 255));
        jtxtPreg4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jtxtPreg4.setForeground(new java.awt.Color(0, 0, 0));
        jtxtPreg4.setBorder(null);
        jtxtPreg4.setMargin(new java.awt.Insets(2, 7, 2, 6));
        jPanel1.add(jtxtPreg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 170, 20));

        jtxtPreg1.setBackground(new java.awt.Color(255, 255, 255));
        jtxtPreg1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jtxtPreg1.setForeground(new java.awt.Color(0, 0, 0));
        jtxtPreg1.setBorder(null);
        jPanel1.add(jtxtPreg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 160, 20));

        jpbProgreso.setBackground(new java.awt.Color(175, 175, 175));
        jpbProgreso.setForeground(new java.awt.Color(255, 79, 79));
        jpbProgreso.setBorder(null);
        jPanel1.add(jpbProgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 410, 30));

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
        jPanel1.add(jbtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 170, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ButtonPrincipiante.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, 260, 60));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Desktop - 36.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 590));

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

    private void jbtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegresarActionPerformed
        Menu menu = new Menu(Menu.user);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnRegresarActionPerformed

    private void jtxtPreg3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtPreg3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtPreg3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(jtxtPreg1.getText().toUpperCase().trim().equals("Ali pundza")){
            puntos++;
        }
        if(jtxtPreg2.getText().toUpperCase().trim().equals("Chaskachay")){
            puntos++;
        }
        if(jtxtPreg3.getText().toUpperCase().trim().equals("Noqapa huk alqoy")){
            puntos++;
        }

        if(jtxtPreg4.getText().toUpperCase().trim().equals("Pay makiywan pukllan")){
            puntos++;
        }
        if(jtxtPreg5.getText().toUpperCase().trim().equals("Pay munakun")){
            puntos++;
        }
        if(jtxtPreg6.getText().toUpperCase().trim().equals("Ñuqa takiy")){
            puntos++;
        }

        Menu.user.SumarPuntos(puntos);
        System.out.println(Menu.user.getPuntos());
        Felicidades felicidades= new Felicidades(puntos*5);
        felicidades.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
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
                if (jtxtPreg1.getText().isEmpty()) emptyFields++;
                if (jtxtPreg2.getText().isEmpty()) emptyFields++;
                if (jtxtPreg3.getText().isEmpty()) emptyFields++;
                if (jtxtPreg4.getText().isEmpty()) emptyFields++;
                if (jtxtPreg5.getText().isEmpty()) emptyFields++;
                if (jtxtPreg6.getText().isEmpty()) emptyFields++;

                double progressBarValue = (textFieldCount - emptyFields) * 16.66; // Aumentar un 25% por cada campo q no esta vacío
                jpbProgreso.setValue((int)progressBarValue);
            }
        });
    }
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
            java.util.logging.Logger.getLogger(Examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Examen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnRegresar;
    private javax.swing.JProgressBar jpbProgreso;
    private javax.swing.JTextField jtxtPreg1;
    private javax.swing.JTextField jtxtPreg2;
    private javax.swing.JTextField jtxtPreg3;
    private javax.swing.JTextField jtxtPreg4;
    private javax.swing.JTextField jtxtPreg5;
    private javax.swing.JTextField jtxtPreg6;
    // End of variables declaration//GEN-END:variables
}

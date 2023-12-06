
package Pantallas.Ejercicios;

import Pantallas.*;
import Pantallas.Indicaciones.I_Principiante_Saludo;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class Principiante_Saludo extends javax.swing.JFrame {
    int puntos=0;
    public Principiante_Saludo() {
        initComponents();
        this.setSize(735, 483);
        this.setLocationRelativeTo(null);
        addDocumentListener(jtxtPreg1,jpbProgreso);
        addDocumentListener(jtxtPreg2,jpbProgreso);
        addDocumentListener(jtxtPreg3,jpbProgreso);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtxtPreg2 = new javax.swing.JTextField();
        jtxtPreg3 = new javax.swing.JTextField();
        jtxtPreg1 = new javax.swing.JTextField();
        jpbProgreso = new javax.swing.JProgressBar();
        jbtnRegresar = new javax.swing.JButton();
        jbtnContinuar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtPreg2.setBackground(new java.awt.Color(255, 255, 255));
        jtxtPreg2.setForeground(new java.awt.Color(0, 0, 0));
        jtxtPreg2.setBorder(null);
        jPanel1.add(jtxtPreg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 190, 50));

        jtxtPreg3.setBackground(new java.awt.Color(255, 255, 255));
        jtxtPreg3.setForeground(new java.awt.Color(0, 0, 0));
        jtxtPreg3.setBorder(null);
        jPanel1.add(jtxtPreg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 200, 40));

        jtxtPreg1.setBackground(new java.awt.Color(255, 255, 255));
        jtxtPreg1.setForeground(new java.awt.Color(0, 0, 0));
        jtxtPreg1.setBorder(null);
        jPanel1.add(jtxtPreg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 200, 40));

        jpbProgreso.setBackground(new java.awt.Color(175, 175, 175));
        jpbProgreso.setForeground(new java.awt.Color(255, 79, 79));
        jpbProgreso.setBorder(null);
        jPanel1.add(jpbProgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 340, 20));

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
        jPanel1.add(jbtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, 30));

        jbtnContinuar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnContinuar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ButtonConfirmar.png"))); // NOI18N
        jbtnContinuar.setBorder(null);
        jbtnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnContinuarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 210, 50));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Desktop - 53.png"))); // NOI18N
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
        if(jtxtPreg1.getText().toUpperCase().trim().equals("ALI PUNDZA")){
            puntos++;
        }
        if(jtxtPreg2.getText().toUpperCase().trim().equals("ALI CHISHI")){
            puntos++;
        }
        if(jtxtPreg3.getText().toUpperCase().trim().equals("ALI TUTA")){
            puntos++;
        }
        Menu.user.SumarPuntos(puntos);
        System.out.println(Menu.user.getPuntos());
        Felicidades felicidades= new Felicidades(puntos*5);
        felicidades.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnContinuarActionPerformed

    private void jbtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegresarActionPerformed
        I_Principiante_Saludo regresar = new I_Principiante_Saludo();
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
                int textFieldCount = 3; 
                int emptyFields = 0;
                if (jtxtPreg1.getText().isEmpty()) emptyFields++;
                if (jtxtPreg2.getText().isEmpty()) emptyFields++;
                if (jtxtPreg3.getText().isEmpty()) emptyFields++;

                double progressBarValue = (textFieldCount - emptyFields) * 33.33; // Aumentar un 33.33% por cada campo q no esta vacío
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
            java.util.logging.Logger.getLogger(Principiante_Saludo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principiante_Saludo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principiante_Saludo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principiante_Saludo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principiante_Saludo().setVisible(true);
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
    // End of variables declaration//GEN-END:variables
}

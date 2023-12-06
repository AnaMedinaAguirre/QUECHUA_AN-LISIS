
package Pantallas;
import ConexionBD.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;

public class Registro extends javax.swing.JFrame {
    public static String Username = "";
    public static String Email = "";
    public Registro() {
       initComponents();
       this.setSize(1127, 698);
       this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnAcceder = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jpswContra = new javax.swing.JPasswordField();
        jtxtEmail = new javax.swing.JTextField();
        jtxtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnAcceder.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnAcceder.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAcceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ButtonRegistrarme.png"))); // NOI18N
        jbtnAcceder.setBorder(null);
        jbtnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAccederActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnAcceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 220, 70));

        jLabel12.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Iniciar Sesión");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 197, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Su contraseña debe tener minimo 6 caracteres y maximo 12");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, -1, -1));

        jpswContra.setBackground(new java.awt.Color(229, 229, 229));
        jpswContra.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jpswContra.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jpswContra.setBorder(null);
        getContentPane().add(jpswContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 240, 30));

        jtxtEmail.setBackground(new java.awt.Color(229, 229, 229));
        jtxtEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtxtEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtEmail.setBorder(null);
        getContentPane().add(jtxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 240, 30));

        jtxtUsuario.setBackground(new java.awt.Color(229, 229, 229));
        jtxtUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtxtUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtUsuario.setBorder(null);
        jtxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 240, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/REGISTRAR.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private boolean emailExiste() {
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("SELECT COUNT(*) FROM usuarios WHERE email = ?");
            pst.setString(1, jtxtEmail.getText().trim());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0; // El correo electrónico ya está registrado
              }
            } catch (SQLException e) {
                System.err.println("Error al actualizar");
            }
        return false;
    }
    
    private void jbtnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAccederActionPerformed
        if(emailExiste()==false){
         try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("insert into usuarios values(?,?,?,?,?)");
            pst.setString(1, "0");
            pst.setString(2, jtxtUsuario.getText().trim());
            pst.setString(3, jtxtEmail.getText().trim());
            pst.setString(4,jpswContra.getText().trim());
            pst.setInt(5, 0);
            pst.executeUpdate();
            Username = jtxtUsuario.getText().trim();
            Email = jtxtEmail.getText().trim();
            RegistroExitoso reg = new RegistroExitoso();
            reg.setVisible(true);
            dispose();
        } catch (Exception e) {
        }   
        }else{
            JOptionPane.showMessageDialog(null, "El correo electronico ya se encuentra registrado.");
        }
    }//GEN-LAST:event_jbtnAccederActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        Logeo login = new Logeo();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jtxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbtnAcceder;
    private javax.swing.JPasswordField jpswContra;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables
}


package Pantallas;
import ConexionBD.Conexion;
import Modelo.Usuario;
import javax.swing.JOptionPane;
import java.sql.*;

public class Logeo extends javax.swing.JFrame {
    String user = "";
    String pass = "";
    public static String Username = "";
    public static String MaxPoint = "";
    public Logeo() {
       initComponents();
       this.setSize(1127, 722);
       this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtnAcceder = new javax.swing.JButton();
        jtxtUsuario = new javax.swing.JTextField();
        jpswContra = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnAcceder.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnAcceder.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAcceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ButtonIniciar Sesión.png"))); // NOI18N
        jbtnAcceder.setBorder(null);
        jbtnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAccederActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnAcceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 470, -1, 75));

        jtxtUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtxtUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jtxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 280, 30));

        jpswContra.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jpswContra.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jpswContra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jpswContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, 280, 30));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(19, 19, 19));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Ingrese su Contraseña :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 321, 300, -1));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 64)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(252, 59, 30));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("QuechuaUnity");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 108, 492, -1));

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(19, 19, 19));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Bienvenido a");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 51, 361, -1));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(19, 19, 19));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ingresa tus datos para iniciar sesión");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 263, 361, -1));

        jLabel5.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(19, 19, 19));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Ingrese su Email :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 321, 300, -1));

        jLabel6.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(19, 19, 19));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Recuerda que...");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 195, 361, -1));

        jLabel7.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("\"Siempre viene bien un poco de ayuda\"");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 219, 361, -1));

        jLabel8.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Registrate aqui");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 585, 361, -1));

        jLabel9.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(19, 19, 19));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("¿No tienes cuenta?");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 585, 361, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/kuzco4.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(787, 14, 210, 183));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Table.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, 320, 70));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Table.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 320, 70));

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

    private void jbtnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAccederActionPerformed
     user = jtxtUsuario.getText().trim();
     pass = jpswContra.getText().trim();
     Usuario usuario = new Usuario();
        if(!user.equals("") || !pass.equals("")){
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                    "select nombre_usuario, max_points from usuarios where email = '" + user
                    + "' and contra = '" + pass + "'");
                ResultSet rs = pst.executeQuery();
                if(rs.next()){
                    Username = rs.getString("nombre_usuario");
                    MaxPoint = rs.getString("max_points");
                    usuario.setNombre(Username);
                    usuario.setEmail(user);
                    usuario.setPuntos(Integer.parseInt(MaxPoint));
                    Menu menu = new Menu(usuario);
                    menu.setVisible(true);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Datos de acceso incorrectos.");
                    jtxtUsuario.setText("");
                    jpswContra.setText("");
                }
            } catch (SQLException e) {
                System.err.println("Error al Acceder ");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
        }
    }//GEN-LAST:event_jbtnAccederActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
       Registro regis = new Registro();
       regis.setVisible(true);
       dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

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
            java.util.logging.Logger.getLogger(Logeo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Logeo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Logeo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logeo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logeo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnAcceder;
    private javax.swing.JPasswordField jpswContra;
    private javax.swing.JTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables
}

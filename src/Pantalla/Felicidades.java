
package Pantallas;

import ConexionBD.Conexion;
import java.sql.*;

public class Felicidades extends javax.swing.JFrame {
    
    public Felicidades(int puntos) {
        initComponents();
        this.setSize(735, 483);
        this.setLocationRelativeTo(null);
        lblPuntos.setText("Obtuviste "+puntos+" puntos");
        try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("UPDATE usuarios SET max_points = max_points + ? WHERE email = ?");
                pst.setInt(1, puntos);
                pst.setString(2, Menu.user.getEmail());
                int filasAfectadas = pst.executeUpdate();

            // Verificar si la actualización fue exitosa
            if (filasAfectadas > 0) {
                System.out.println("Actualización exitosa. Se sumaron " + puntos + " puntos.");
            } else {
                System.out.println("No se pudo realizar la actualización.");
            }
            } catch (SQLException e) {
                System.err.println("Error al actualizar");
            }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblPuntos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(252, 59, 30));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("¡Felicidades!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 18, 492, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ButtonContinuar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 240, 80));

        lblPuntos.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        lblPuntos.setForeground(new java.awt.Color(19, 19, 19));
        lblPuntos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntos.setText("Obtuviste XX puntos");
        jPanel1.add(lblPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 361, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/kuzco4.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 295, 228));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(19, 19, 19));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("¡COMPLETASTE EL EJERCICIO!");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 361, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu menu = new Menu(Menu.user);
        menu.setVisible(true);
    //    menu.lblSaludo2.setText("Bienvenido a QuechuaUnity "+Menu.user.getNombre()+".");
   //     menu.lblSaludo3.setText("¿Que tal te fue en el ejercicio anterior?");
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPuntos;
    // End of variables declaration//GEN-END:variables
}

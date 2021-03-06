/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaderepartos;

import com.placeholder.PlaceHolder;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sistemaderepartos.menu;

/**
 *
 * @author dairy
 */
public class usuarios extends javax.swing.JFrame {

    /**
     * Creates new form usuarios
     */
    PlaceHolder holder;

    ClsBitacora global = new ClsBitacora();

    public void placeholder() {

        holder = new PlaceHolder(txt_buscar, "Ingrese codigo a buscar");
        holder = new PlaceHolder(txt_usuario, "Ingrese Usuario");
        holder = new PlaceHolder(txt_contraseña, "Ingrese contraseña");
        holder = new PlaceHolder(txt_tipo, "Tipo de permisos");
        holder = new PlaceHolder(txt_id_empleado, "ID del Empleado");
    }

    public usuarios() {
        initComponents();
        this.setSize(new Dimension(625, 425));
        placeholder();
        ImageIcon imagen = new ImageIcon("src/imagenes/ayuda.png");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(img_ayuda2.getWidth(), img_ayuda2.getHeight(), Image.SCALE_DEFAULT));
        img_ayuda2.setIcon(icono);
        this.repaint();
    }

    Conexion cn = new Conexion();
    Connection con = cn.getConnection();
    PreparedStatement ps;
    ResultSet rs;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jnp_a = new javax.swing.JPanel();
        lbl_texto = new javax.swing.JLabel();
        img_ayuda2 = new javax.swing.JButton();
        jpn_b = new javax.swing.JPanel();
        btn_buscar = new javax.swing.JButton();
        lbl_codigo_usuario = new javax.swing.JLabel();
        txt_tipo = new javax.swing.JTextField();
        txt_contraseña = new javax.swing.JTextField();
        lbl_contraseña = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        txt_buscar = new javax.swing.JTextField();
        lbl_usuario = new javax.swing.JLabel();
        lbl_id_vehiculo = new javax.swing.JLabel();
        txt_id_empleado = new javax.swing.JTextField();
        jpn_c = new javax.swing.JPanel();
        btn_guardar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(624, 435));
        setResizable(false);

        jnp_a.setBackground(new java.awt.Color(29, 53, 87));

        lbl_texto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_texto.setForeground(new java.awt.Color(255, 255, 255));
        lbl_texto.setText("USUARIOS");

        img_ayuda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img_ayuda2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jnp_aLayout = new javax.swing.GroupLayout(jnp_a);
        jnp_a.setLayout(jnp_aLayout);
        jnp_aLayout.setHorizontalGroup(
            jnp_aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jnp_aLayout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(lbl_texto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(img_ayuda2)
                .addContainerGap())
        );
        jnp_aLayout.setVerticalGroup(
            jnp_aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jnp_aLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jnp_aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(img_ayuda2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jnp_aLayout.createSequentialGroup()
                        .addComponent(lbl_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jpn_b.setBackground(new java.awt.Color(241, 250, 238));

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/OpcionBuscar.png"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        lbl_codigo_usuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_codigo_usuario.setText("USUARIO");

        txt_tipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_tipoKeyTyped(evt);
            }
        });

        txt_contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_contraseñaKeyTyped(evt);
            }
        });

        lbl_contraseña.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_contraseña.setText("ID TIPO PERMISO");

        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });

        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_buscarKeyTyped(evt);
            }
        });

        lbl_usuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_usuario.setText("CONTRASEÑA");

        lbl_id_vehiculo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_id_vehiculo.setText("ID EMPLEADO");

        txt_id_empleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_id_empleadoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jpn_bLayout = new javax.swing.GroupLayout(jpn_b);
        jpn_b.setLayout(jpn_bLayout);
        jpn_bLayout.setHorizontalGroup(
            jpn_bLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_bLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jpn_bLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpn_bLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btn_buscar))
                    .addGroup(jpn_bLayout.createSequentialGroup()
                        .addGroup(jpn_bLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_codigo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_contraseña)
                            .addComponent(lbl_usuario)
                            .addComponent(lbl_id_vehiculo))
                        .addGap(105, 105, 105)
                        .addGroup(jpn_bLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_tipo, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(txt_contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(txt_usuario)
                            .addComponent(txt_id_empleado))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpn_bLayout.setVerticalGroup(
            jpn_bLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_bLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jpn_bLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGap(25, 25, 25)
                .addGroup(jpn_bLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codigo_usuario)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpn_bLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_usuario)
                    .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpn_bLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpn_bLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_id_vehiculo)
                    .addComponent(txt_id_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpn_c.setBackground(new java.awt.Color(168, 218, 220));

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/OpcionGuardar.png"))); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/OpcionModificar.png"))); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/OpcionEliminar.png"))); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/OpcionRegresar.png"))); // NOI18N
        btn_regresar.setText("Regresar");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpn_cLayout = new javax.swing.GroupLayout(jpn_c);
        jpn_c.setLayout(jpn_cLayout);
        jpn_cLayout.setHorizontalGroup(
            jpn_cLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_cLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btn_guardar)
                .addGap(103, 103, 103)
                .addGroup(jpn_cLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_regresar)
                    .addGroup(jpn_cLayout.createSequentialGroup()
                        .addComponent(btn_modificar)
                        .addGap(76, 76, 76)
                        .addComponent(btn_eliminar)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jpn_cLayout.setVerticalGroup(
            jpn_cLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_cLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpn_cLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_modificar)
                    .addComponent(btn_eliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_regresar)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jnp_a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpn_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpn_c, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jnp_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpn_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpn_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:

        if (txt_buscar.getText().matches("[0-9]*")) {
            try {
                ps = (PreparedStatement) con.prepareStatement("SELECT * FROM  tbl_usuario WHERE Pk_iId_Usuario = ? ");//Evitar sql injection.
                ps.setInt(1, Integer.parseInt(txt_buscar.getText()));

                rs = ps.executeQuery();

                if (rs.next()) {
                    txt_usuario.setText(rs.getString("cNombre_Usuario"));
                    txt_contraseña.setText(rs.getString("cContraseña"));
                    txt_tipo.setText(rs.getString("Fk_iId_Tipo_Usuario"));
                    txt_id_empleado.setText(rs.getString("Fk_iId_Empleado"));

                } else {
                    JOptionPane.showMessageDialog(null, "ERROR", "Error no se desplegaron los datos.", JOptionPane.ERROR_MESSAGE);

                }
                //con.close();
            } catch (Exception e) {
                System.err.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR", "Error en el codigo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void txt_tipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tipoKeyTyped
        // TODO add your handling code here:
        validacion(evt);
    }//GEN-LAST:event_txt_tipoKeyTyped

    private void txt_contraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contraseñaKeyTyped
        // TODO add your handling code here:
        /*char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
        }*/
    }//GEN-LAST:event_txt_contraseñaKeyTyped

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void txt_buscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyTyped
        // TODO add your handling code here:
        validacion(evt);
    }//GEN-LAST:event_txt_buscarKeyTyped

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        if ((txt_usuario.getText().matches("[a-zA-Z0-9]+")) && (txt_tipo.getText().matches("[0-9]*")) && (txt_id_empleado.getText().matches("[0-9]*"))
                && (txt_contraseña.getText().matches("[a-zA-Z0-9]+"))) {

            try {

                ps = con.prepareStatement("INSERT INTO tbl_usuario (cNombre_Usuario, cContraseña, Fk_iId_Tipo_Usuario, Fk_iId_Empleado) VALUES(?,?,?,?)");

                String usuario = txt_usuario.getText();
                String contraseña = txt_contraseña.getText();
                String tipo = txt_tipo.getText();
                String emp = txt_id_empleado.getText();

                ps.setString(1, usuario);
                ps.setString(2, contraseña);
                ps.setString(3, tipo);
                ps.setString(4, emp);

                txt_usuario.setText("");
                txt_contraseña.setText("");
                txt_tipo.setText("");
                txt_id_empleado.setText("");
                ps.executeUpdate();
                placeholder();

                JOptionPane.showMessageDialog(null, "Registro Exitoso");

                global.GrabaBitacora(ClsBitacora.SystemUser, "Agrego en usuarios");

                //con.close();
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR", "Error en los datos.", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        // TODO add your handling code here:
        if ((txt_usuario.getText().matches("[a-zA-Z0-9]+")) && (txt_tipo.getText().matches("[0-9]*")) && (txt_id_empleado.getText().matches("[0-9]*"))
                && (txt_contraseña.getText().matches("[a-zA-Z0-9]+"))) {

            try {
                ps = (PreparedStatement) con.prepareStatement("UPDATE tbl_usuario SET  cNombre_Usuario = ?,"
                        + " cContraseña = ?, Fk_iId_Tipo_Usuario = ?, Fk_iId_Empleado = ? WHERE Pk_iId_Usuario = ?");//Evitar sql injection.

                ps.setString(1, txt_usuario.getText());
                ps.setString(2, txt_contraseña.getText());
                ps.setString(3, txt_tipo.getText());
                ps.setString(4, txt_id_empleado.getText());
                ps.setString(5, txt_buscar.getText());

                int res = ps.executeUpdate();

                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Modificado correctamente.", "ÉXITO", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR", "ERROR AL GUARDAR", JOptionPane.ERROR_MESSAGE);
                }
                //con.close();

                txt_usuario.setText("");
                txt_contraseña.setText("");
                txt_tipo.setText("");
                txt_id_empleado.setText("");
                txt_buscar.setText("");
                placeholder();

                global.GrabaBitacora(ClsBitacora.SystemUser, "Modifico en usuarios");

            } catch (Exception e) {
                System.err.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR", "Error en los datos.", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        if ((txt_buscar.getText().matches("[0-9]*"))) {

            try {
                ps = (PreparedStatement) con.prepareStatement("DELETE FROM tbl_usuario WHERE Pk_iId_Usuario = ?");//Evitar sql injection.
                ps.setInt(1, Integer.parseInt(txt_buscar.getText()));

                int res = ps.executeUpdate();

                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Eliminado correctamente.", "ÉXITO", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR", "ERROR AL ELIMINAR", JOptionPane.ERROR_MESSAGE);
                }
                //con.close();

                txt_usuario.setText("");
                txt_contraseña.setText("");
                txt_tipo.setText("");
                txt_id_empleado.setText("");
                txt_buscar.setText("");
                placeholder();

                global.GrabaBitacora(ClsBitacora.SystemUser, "elimino en usuarios");

            } catch (Exception e) {
                System.err.println("ERROR EN LA BASE DE DATOS.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR", "Error en los datos.", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        menu volver = new menu();
        volver.setVisible(true);
        dispose();
        volver.setLocationRelativeTo(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void txt_id_empleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_id_empleadoKeyTyped
        // TODO add your handling code here:
        validacion(evt);
    }//GEN-LAST:event_txt_id_empleadoKeyTyped

    private void img_ayuda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img_ayuda2ActionPerformed
        // TODO add your handling code here:
        try {

            if ((new File("ayudaFormulario.chm")).exists()) {

                Process p = Runtime
                .getRuntime()
                .exec("rundll32 url.dll,FileProtocolHandler ayudaFormulario.chm");
                p.waitFor();

            } else {

                System.out.println("La ayuda no Fue encontrada");

            }

            System.out.println("Correcto");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_img_ayuda2ActionPerformed

    public void validacion(KeyEvent e) {
        char validar = e.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            e.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
        }
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
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton img_ayuda2;
    private javax.swing.JPanel jnp_a;
    private javax.swing.JPanel jpn_b;
    private javax.swing.JPanel jpn_c;
    private javax.swing.JLabel lbl_codigo_usuario;
    private javax.swing.JLabel lbl_contraseña;
    private javax.swing.JLabel lbl_id_vehiculo;
    private javax.swing.JLabel lbl_texto;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_contraseña;
    private javax.swing.JTextField txt_id_empleado;
    private javax.swing.JTextField txt_tipo;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}

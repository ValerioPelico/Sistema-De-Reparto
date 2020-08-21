/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaderepartos;

import sistemaderepartos.menu;
import com.placeholder.PlaceHolder;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author dairy
 */
public class ordenes extends javax.swing.JFrame {

    /**
     * Creates new form ordenes
     */
    //Instancias y variables---------
    Conexion cn = new Conexion();
    Connection con = cn.getConnection();
    PreparedStatement ps;
    ResultSet rs;

    ClsBitacora global = new ClsBitacora();

    PlaceHolder holder;

    public void placeholder() {

        holder = new PlaceHolder(txt_buscar, "Codigo a buscar");
        holder = new PlaceHolder(txt_nombre, "Nombre orden");
        holder = new PlaceHolder(txt_descripcion, "Descripcion Orden");
        holder = new PlaceHolder(txt_estado, "Codigo estado de orden");
        holder = new PlaceHolder(txt_vehiculo, "ID Vehiculo");
        holder = new PlaceHolder(txt_paquete, "Codigo paquete");
    }

    public ordenes() {
        initComponents();
        this.setSize(new Dimension(625, 475));
        placeholder();
        ImageIcon imagen = new ImageIcon("src/imagenes/ayuda.png");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(img_ayuda2.getWidth(), img_ayuda2.getHeight(), Image.SCALE_DEFAULT));
        img_ayuda2.setIcon(icono);
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_texto = new javax.swing.JLabel();
        img_ayuda2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbl_descripcion = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        lbl_nombre = new javax.swing.JLabel();
        txt_estado = new javax.swing.JTextField();
        txt_descripcion = new javax.swing.JTextField();
        lbl_estado = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_buscar = new javax.swing.JTextField();
        lbl_vehiculo = new javax.swing.JLabel();
        lbl_paquete = new javax.swing.JLabel();
        txt_vehiculo = new javax.swing.JTextField();
        txt_paquete = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btn_guardar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(667, 620));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(29, 53, 87));

        lbl_texto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_texto.setForeground(new java.awt.Color(255, 255, 255));
        lbl_texto.setText("ORDENES");

        img_ayuda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img_ayuda2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(lbl_texto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(img_ayuda2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_texto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(img_ayuda2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(241, 250, 238));

        lbl_descripcion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_descripcion.setText("DESCRIPCION");

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/OpcionBuscar.png"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        lbl_nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_nombre.setText("NOMBRE");

        txt_estado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_estadoKeyTyped(evt);
            }
        });

        txt_descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_descripcionKeyTyped(evt);
            }
        });

        lbl_estado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_estado.setText("CODIGO ESTADO ORDEN");

        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_buscarKeyTyped(evt);
            }
        });

        lbl_vehiculo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_vehiculo.setText("CODIGO DE VEHICULO");

        lbl_paquete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_paquete.setText("ID PAQUETE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btn_buscar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_descripcion)
                            .addComponent(lbl_estado)
                            .addComponent(lbl_vehiculo)
                            .addComponent(lbl_paquete))
                        .addGap(105, 105, 105)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_estado)
                            .addComponent(txt_nombre)
                            .addComponent(txt_descripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(txt_vehiculo)
                            .addComponent(txt_paquete))))
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_descripcion)
                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_vehiculo)
                    .addComponent(txt_vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_paquete)
                    .addComponent(txt_paquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(168, 218, 220));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(btn_regresar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btn_guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_modificar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(btn_eliminar)
                .addGap(79, 79, 79))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_modificar)
                    .addComponent(btn_eliminar))
                .addGap(18, 18, 18)
                .addComponent(btn_regresar)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        menu volver = new menu();
        volver.setVisible(true);
        dispose();
        volver.setLocationRelativeTo(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        if (txt_buscar.getText().matches("[0-9]*")) {

            try {
                ps = (PreparedStatement) con.prepareStatement("DELETE FROM tbl_ordenes_de_envio WHERE Pk_iId_Ordenes_De_Envio = ?");//Evitar sql injection.
                ps.setInt(1, Integer.parseInt(txt_buscar.getText()));

                int res = ps.executeUpdate();

                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Eliminado correctamente.", "ÉXITO", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR", "ERROR AL ELIMINAR", JOptionPane.ERROR_MESSAGE);
                }
                //con.close();

                txt_nombre.setText("");
                txt_descripcion.setText("");
                txt_estado.setText("");
                txt_buscar.setText("");
                txt_vehiculo.setText("");
                txt_paquete.setText("");
                placeholder();

                global.GrabaBitacora(ClsBitacora.SystemUser, "Elimino en ordenes");

            } catch (Exception e) {
                System.err.println("ERROR EN LA BASE DE DATOS.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR", "Error en los datos.", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        // TODO add your handling code here:
        if ((txt_nombre.getText().matches("[A-Z][a-zA-Z]*[0-9]*")) && (txt_descripcion.getText().matches("[A-Z][a-zA-Z]*[0-9]*")) && (txt_estado.getText().matches("[0-9]*"))
                && (txt_vehiculo.getText().matches("[0-9]*")) && (txt_paquete.getText().matches("[0-9]*"))) {

            try {
                ps = (PreparedStatement) con.prepareStatement("UPDATE tbl_ordenes_de_envio SET  cNombre_Ordenes_De_Envio = ?,"
                        + " cDescripcion_De_Envio = ?, Fk_iId_Estado_Envio = ?, Fk_iId_Vehiculo = ?, Pk_iId_Paquete = ? WHERE Pk_iId_Ordenes_De_Envio = ?");//Evitar sql injection.  

                ps.setString(1, txt_nombre.getText());
                ps.setString(2, txt_descripcion.getText());
                ps.setString(3, txt_estado.getText());
                ps.setString(4, txt_vehiculo.getText());
                ps.setString(5, txt_paquete.getText());
                ps.setString(6, txt_buscar.getText());

                int res = ps.executeUpdate();

                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Modificado correctamente.", "ÉXITO", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR", "ERROR AL GUARDAR", JOptionPane.ERROR_MESSAGE);
                }
                //con.close();

                txt_nombre.setText("");
                txt_descripcion.setText("");
                txt_estado.setText("");
                txt_buscar.setText("");
                txt_vehiculo.setText("");
                txt_paquete.setText("");
                placeholder();

                global.GrabaBitacora(ClsBitacora.SystemUser, "Modifico en ordenes");

            } catch (Exception e) {
                System.err.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR", "Error en los datos.", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        if ((txt_nombre.getText().matches("[A-Z][a-zA-Z]*[0-9]*")) && (txt_descripcion.getText().matches("[A-Z][a-zA-Z]*[0-9]*")) && (txt_estado.getText().matches("[0-9]*"))
                && (txt_vehiculo.getText().matches("[0-9]*")) && (txt_paquete.getText().matches("[0-9]*"))) {

            try {

                ps = con.prepareStatement("INSERT INTO tbl_ordenes_de_envio (cNombre_Ordenes_De_Envio, cDescripcion_De_Envio, Fk_iId_Estado_Envio, Fk_iId_Vehiculo, Pk_iId_Paquete)"
                        + " VALUES(?,?,?,?,?)");

                String titulo = txt_nombre.getText();
                String descripcion = txt_descripcion.getText();
                String estado = txt_estado.getText();
                String vehiculo = txt_vehiculo.getText();
                String paquete = txt_paquete.getText();

                ps.setString(1, titulo);
                ps.setString(2, descripcion);
                ps.setString(3, estado);
                ps.setString(4, vehiculo);
                ps.setString(5, paquete);

                txt_nombre.setText("");
                txt_descripcion.setText("");
                txt_estado.setText("");
                txt_vehiculo.setText("");
                txt_paquete.setText("");
                ps.executeUpdate();
                placeholder();

                JOptionPane.showMessageDialog(null, "Registro Exitoso");

                global.GrabaBitacora(ClsBitacora.SystemUser, "Agrego en ordenes");

                //con.close();
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR", "Error en los datos.", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        if (txt_buscar.getText().matches("[0-9]*")) {

            try {
                ps = (PreparedStatement) con.prepareStatement("SELECT * FROM  tbl_ordenes_de_envio WHERE Pk_iId_Ordenes_De_Envio = ? ");//Evitar sql injection.
                ps.setInt(1, Integer.parseInt(txt_buscar.getText()));

                rs = ps.executeQuery();

                if (rs.next()) {
                    txt_nombre.setText(rs.getString("cNombre_Ordenes_De_Envio"));
                    txt_descripcion.setText(rs.getString("cDescripcion_De_Envio"));
                    txt_estado.setText(rs.getString("Fk_iId_Estado_Envio"));
                    txt_vehiculo.setText(rs.getString("Fk_iId_Vehiculo"));
                    txt_paquete.setText(rs.getString("Pk_iId_Paquete"));

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

    private void txt_buscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyTyped
        // TODO add your handling code here:
        validacion(evt);
    }//GEN-LAST:event_txt_buscarKeyTyped

    private void txt_descripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_descripcionKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_descripcionKeyTyped

    private void txt_estadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_estadoKeyTyped
        // TODO add your handling code here:
        validacion(evt);
    }//GEN-LAST:event_txt_estadoKeyTyped

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
            java.util.logging.Logger.getLogger(ordenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ordenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ordenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ordenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ordenes().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_descripcion;
    private javax.swing.JLabel lbl_estado;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_paquete;
    private javax.swing.JLabel lbl_texto;
    private javax.swing.JLabel lbl_vehiculo;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_estado;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_paquete;
    private javax.swing.JTextField txt_vehiculo;
    // End of variables declaration//GEN-END:variables
}

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
public class comprobante extends javax.swing.JFrame {

    /**
     * Creates new form comprobante
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
        holder = new PlaceHolder(txt_titulo, "Titulo Comprobante");
        holder = new PlaceHolder(txt_paquete, "Codigo paquete");
        holder = new PlaceHolder(txt_orden, "Codigo orden");
        holder = new PlaceHolder(txt_empleado, "Codigo empleado");
        holder = new PlaceHolder(txt_cliente, "Codigo cliente");
    }

    public comprobante() {
        initComponents();
        this.setSize(new Dimension(650, 485));
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
        txt_titulo = new javax.swing.JTextField();
        txt_paquete = new javax.swing.JTextField();
        lbl_titulo = new javax.swing.JLabel();
        lbl_orden = new javax.swing.JLabel();
        lbl_empleado = new javax.swing.JLabel();
        txt_empleado = new javax.swing.JTextField();
        lbl_cliente = new javax.swing.JLabel();
        lbl_paquete = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        txt_orden = new javax.swing.JTextField();
        txt_cliente = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btn_regresar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(667, 620));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(29, 53, 87));

        lbl_texto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_texto.setForeground(new java.awt.Color(255, 255, 255));
        lbl_texto.setText("COMPROBANTE");

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
                .addGap(245, 245, 245)
                .addComponent(lbl_texto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(img_ayuda2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(img_ayuda2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanel2.setBackground(new java.awt.Color(241, 250, 238));

        txt_titulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_tituloKeyTyped(evt);
            }
        });

        txt_paquete.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_paqueteKeyTyped(evt);
            }
        });

        lbl_titulo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_titulo.setText("TITULO");

        lbl_orden.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_orden.setText("CODIGO ORDEN");

        lbl_empleado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_empleado.setText("CODIGO EMPLEADO");

        txt_empleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_empleadoKeyTyped(evt);
            }
        });

        lbl_cliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_cliente.setText("CODIGO CLIENTE");

        lbl_paquete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_paquete.setText("CODIGO PAQUETE");

        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_buscarKeyTyped(evt);
            }
        });

        txt_orden.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ordenKeyTyped(evt);
            }
        });

        txt_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_clienteKeyTyped(evt);
            }
        });

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/OpcionBuscar.png"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_orden)
                            .addComponent(lbl_empleado)
                            .addComponent(lbl_paquete)
                            .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_cliente))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_orden)
                            .addComponent(txt_titulo)
                            .addComponent(txt_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_paquete, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btn_buscar)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_titulo)
                    .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_paquete)
                    .addComponent(txt_paquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_orden)
                    .addComponent(txt_orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_empleado)
                    .addComponent(txt_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lbl_cliente))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txt_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(168, 218, 220));

        btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/OpcionRegresar.png"))); // NOI18N
        btn_regresar.setText("Regresar");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/OpcionEliminar.png"))); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_guardar)
                        .addGap(223, 223, 223)
                        .addComponent(btn_eliminar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_regresar)
                            .addComponent(btn_modificar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_modificar)
                    .addComponent(btn_eliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_regresar)
                .addContainerGap(20, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                ps = (PreparedStatement) con.prepareStatement("DELETE FROM tbl_comprobante WHERE Pk_iId_Comprobante = ?");//Evitar sql injection.
                ps.setInt(1, Integer.parseInt(txt_buscar.getText()));

                int res = ps.executeUpdate();

                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Eliminado correctamente.", "ÉXITO", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR", "ERROR AL ELIMINAR", JOptionPane.ERROR_MESSAGE);
                }
                //con.close();

                txt_titulo.setText("");
                txt_paquete.setText("");
                txt_orden.setText("");
                txt_empleado.setText("");
                txt_cliente.setText("");
                txt_buscar.setText("");
                placeholder();

                global.GrabaBitacora(ClsBitacora.SystemUser, "Elimino en comprobante");

            } catch (Exception e) {
                System.err.println("ERROR EN LA BASE DE DATOS.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR", "Error en los datos.", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        // TODO add your handling code here:
        if ((txt_titulo.getText().matches("[a-zA-Z]*")) && (txt_paquete.getText().matches("[0-9]*")) && (txt_orden.getText().matches("[0-9]*"))
                && (txt_empleado.getText().matches("[0-9]*")) && (txt_cliente.getText().matches("[0-9]*"))) {
            try {
                ps = (PreparedStatement) con.prepareStatement("UPDATE tbl_comprobante SET  cTitulo_Comprobante = ?,"
                        + " Fk_iId_Paquete = ?, Fk_iId_Ordenes_De_Envio = ?, Fk_iId_Empleado = ?,"
                        + "Fk_iId_Clientes = ? WHERE Pk_iId_Comprobante = ?");//Evitar sql injection.  

                ps.setString(1, txt_titulo.getText());
                ps.setString(2, txt_paquete.getText());
                ps.setString(3, txt_orden.getText());
                ps.setString(4, txt_empleado.getText());
                ps.setString(5, txt_cliente.getText());
                ps.setString(6, txt_buscar.getText());

                int res = ps.executeUpdate();

                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Modificado correctamente.", "ÉXITO", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR", "ERROR AL GUARDAR", JOptionPane.ERROR_MESSAGE);
                }
                //con.close();

                txt_titulo.setText("");
                txt_paquete.setText("");
                txt_orden.setText("");
                txt_empleado.setText("");
                txt_cliente.setText("");
                txt_buscar.setText("");
                placeholder();

                global.GrabaBitacora(ClsBitacora.SystemUser, "Modifico en comprobante");

            } catch (Exception e) {
                System.err.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR", "Error en los datos.", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        if ((txt_titulo.getText().matches("[A-Z][a-zA-Z]*")) && (txt_paquete.getText().matches("[0-9]*")) && (txt_orden.getText().matches("[0-9]*"))
                && (txt_empleado.getText().matches("[0-9]*")) && (txt_cliente.getText().matches("[0-9]*"))) {

            try {

                ps = con.prepareStatement("INSERT INTO tbl_comprobante (cTitulo_Comprobante, Fk_iId_Paquete,"
                        + " Fk_iId_Ordenes_De_Envio,"
                        + " Fk_iId_Empleado,Fk_iId_Clientes)"
                        + " VALUES(?,?,?,?,?)");

                String titulo = txt_titulo.getText();
                String paquete = txt_paquete.getText();
                String orden = txt_orden.getText();
                String empleado = txt_empleado.getText();
                String cliente = txt_cliente.getText();

                ps.setString(1, titulo);
                ps.setString(2, paquete);
                ps.setString(3, orden);
                ps.setString(4, empleado);
                ps.setString(5, cliente);

                ps = con.prepareStatement("UPDATE tbl_ordenes_de_envio SET Fk_iId_Estado_Envio = '1' WHERE Pk_iId_Ordenes_De_Envio = ?");
                ps.setInt(1, Integer.parseInt(txt_orden.getText()));

                txt_paquete.setText("");
                txt_titulo.setText("");
                txt_orden.setText("");
                txt_empleado.setText("");
                txt_cliente.setText("");
                ps.executeUpdate();
                placeholder();

                JOptionPane.showMessageDialog(null, "Registro Exitoso");

                global.GrabaBitacora(ClsBitacora.SystemUser, "Inserto en comprobante");

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
                ps = (PreparedStatement) con.prepareStatement("SELECT * FROM  tbl_comprobante WHERE Pk_iId_Comprobante = ? ");//Evitar sql injection.
                ps.setInt(1, Integer.parseInt(txt_buscar.getText()));

                rs = ps.executeQuery();

                if (rs.next()) {
                    txt_titulo.setText(rs.getString("cTitulo_Comprobante"));
                    txt_paquete.setText(rs.getString("Fk_iId_Paquete"));
                    txt_orden.setText(rs.getString("Fk_iId_Ordenes_De_Envio"));
                    txt_empleado.setText(rs.getString("Fk_iId_Empleado"));
                    txt_cliente.setText(rs.getString("Fk_iId_Clientes"));

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

    private void txt_tituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tituloKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_tituloKeyTyped

    private void txt_paqueteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_paqueteKeyTyped
        // TODO add your handling code here:
        validacion(evt);
    }//GEN-LAST:event_txt_paqueteKeyTyped

    private void txt_ordenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ordenKeyTyped
        // TODO add your handling code here:
        validacion(evt);
    }//GEN-LAST:event_txt_ordenKeyTyped

    private void txt_empleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_empleadoKeyTyped
        // TODO add your handling code here:
        validacion(evt);
    }//GEN-LAST:event_txt_empleadoKeyTyped

    private void txt_clienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_clienteKeyTyped
        // TODO add your handling code here:
        validacion(evt);
    }//GEN-LAST:event_txt_clienteKeyTyped

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
            java.util.logging.Logger.getLogger(comprobante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(comprobante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(comprobante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(comprobante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new comprobante().setVisible(true);
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
    private javax.swing.JLabel lbl_cliente;
    private javax.swing.JLabel lbl_empleado;
    private javax.swing.JLabel lbl_orden;
    private javax.swing.JLabel lbl_paquete;
    private javax.swing.JLabel lbl_texto;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_cliente;
    private javax.swing.JTextField txt_empleado;
    private javax.swing.JTextField txt_orden;
    private javax.swing.JTextField txt_paquete;
    private javax.swing.JTextField txt_titulo;
    // End of variables declaration//GEN-END:variables
}

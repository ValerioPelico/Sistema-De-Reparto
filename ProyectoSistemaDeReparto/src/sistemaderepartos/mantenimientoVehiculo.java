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
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sistemaderepartos.menu;

/**
 *
 * @author dairy
 */
public class mantenimientoVehiculo extends javax.swing.JFrame {

    /**
     * Creates new form mantenimientoVehiculo
     */
    Conexion cn = new Conexion();
    Connection con = cn.getConnection();
    PreparedStatement ps;
    ResultSet rs;
    
    ClsBitacora global = new ClsBitacora();

    PlaceHolder holder;
    
    
    public void placeholder(){
        
        holder = new PlaceHolder(txt_buscar, "Ingrese codigo a buscar");
        holder = new PlaceHolder(txt_fecha, "Fecha servicio  Formato yyyy-mm-dd");
        holder = new PlaceHolder(txt_kilometraje, "KM al momento de servicio");
        holder = new PlaceHolder(txt_descripcion, "Descripcion de servicio");
        holder = new PlaceHolder(txt_id_vehiculo, "ID del vehiculo");
    }
    
    public mantenimientoVehiculo() {
        initComponents();
        this.setSize(new Dimension(660, 410));
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

        jnp_a = new javax.swing.JPanel();
        lbl_texto = new javax.swing.JLabel();
        img_ayuda2 = new javax.swing.JButton();
        jpn_b = new javax.swing.JPanel();
        btn_buscar = new javax.swing.JButton();
        lbl_codigo_vehiculo = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();
        txt_kilometraje = new javax.swing.JTextField();
        lbl_fecha = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JTextField();
        txt_buscar = new javax.swing.JTextField();
        lbl_lugar = new javax.swing.JLabel();
        lbl_id_vehiculo = new javax.swing.JLabel();
        txt_id_vehiculo = new javax.swing.JTextField();
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
        lbl_texto.setText("Mantenimiento Vehiculos");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_texto)
                .addGap(155, 155, 155)
                .addComponent(img_ayuda2)
                .addContainerGap())
        );
        jnp_aLayout.setVerticalGroup(
            jnp_aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jnp_aLayout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addGroup(jnp_aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(img_ayuda2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        lbl_codigo_vehiculo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_codigo_vehiculo.setText("FECHA");

        txt_descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_descripcionKeyTyped(evt);
            }
        });

        txt_kilometraje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_kilometrajeKeyTyped(evt);
            }
        });

        lbl_fecha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_fecha.setText("DESCRIPCION");

        txt_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fechaActionPerformed(evt);
            }
        });
        txt_fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_fechaKeyTyped(evt);
            }
        });

        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_buscarKeyTyped(evt);
            }
        });

        lbl_lugar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_lugar.setText("KILOMETRAJE");

        lbl_id_vehiculo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_id_vehiculo.setText("ID VEHICULO");

        txt_id_vehiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_id_vehiculoKeyTyped(evt);
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
                            .addComponent(lbl_codigo_vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_fecha)
                            .addComponent(lbl_lugar)
                            .addComponent(lbl_id_vehiculo))
                        .addGroup(jpn_bLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpn_bLayout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addGroup(jpn_bLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_kilometraje, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                    .addComponent(txt_fecha)
                                    .addComponent(txt_id_vehiculo)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_bLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                    .addComponent(lbl_codigo_vehiculo)
                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpn_bLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_lugar)
                    .addComponent(txt_kilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpn_bLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpn_bLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_id_vehiculo)
                    .addComponent(txt_id_vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
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
                .addGroup(jpn_cLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_regresar)
                    .addGroup(jpn_cLayout.createSequentialGroup()
                        .addComponent(btn_guardar)
                        .addGap(103, 103, 103)
                        .addComponent(btn_modificar)))
                .addGap(76, 76, 76)
                .addComponent(btn_eliminar)
                .addContainerGap(78, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:

        if (txt_buscar.getText().matches("[0-9]*")) {
            try {
                ps = (PreparedStatement) con.prepareStatement("SELECT * FROM  tbl_servicios_vehiculo WHERE Pk_iId_Servicios_Vehiculo = ? ");//Evitar sql injection.
                ps.setInt(1, Integer.parseInt(txt_buscar.getText()));

                rs = ps.executeQuery();

                if (rs.next()) {
                    txt_fecha.setText(rs.getString("dFecha_Servicio"));
                    txt_kilometraje.setText(rs.getString("cKilimetraje_En_el momento"));
                    txt_descripcion.setText(rs.getString("cDescripcion_Del_Servicio_Realizado"));
                    txt_id_vehiculo.setText(rs.getString("Fk_iId_Vehiculo"));

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

    private void txt_descripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_descripcionKeyTyped
        // TODO add your handling code here:
        /*char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
        }*/
    }//GEN-LAST:event_txt_descripcionKeyTyped

    private void txt_kilometrajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_kilometrajeKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
        }
    }//GEN-LAST:event_txt_kilometrajeKeyTyped

    private void txt_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechaActionPerformed

    private void txt_buscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
        }
    }//GEN-LAST:event_txt_buscarKeyTyped

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        if ((txt_descripcion.getText().matches("[a-zA-Z]+")) && (txt_id_vehiculo.getText().matches("[0-9]+"))
                && (txt_kilometraje.getText().matches("[0-9]+"))) {

            String fc = txt_fecha.getText();
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-mm-dd");
            java.util.Date fecha1 = null; // crea objetos tipo util.Date y sql.Date
            java.sql.Date fecha2 = null;
            try {
                fecha1 = formato.parse(txt_fecha.getText()); // convierte el string en util.Date
            } catch (ParseException ex) {
                Logger.getLogger(mantenimientoVehiculo.class.getName()).log(Level.SEVERE, null, ex);
            }
            fecha2 = new java.sql.Date(fecha1.getTime()); // convierte el util.Date en sql.Date

            String cap = "";
            String sql = "SELECT * FROM tbl_servicios_vehiculo ORDER BY Pk_iId_Servicios_Vehiculo DESC LIMIT 1;";

            try {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {

                    cap = rs.getString("Pk_iId_Servicios_Vehiculo");

                }

                JOptionPane.showMessageDialog(null, cap);
                cap = cap + 1;

                ps = con.prepareStatement("INSERT INTO tbl_servicios_vehiculo  "
                        + "VALUES(?,?,?,?,?)");

                //String fecha = txt_fecha.getText();
                String km = txt_kilometraje.getText();
                String descripcion = txt_descripcion.getText();
                String id = txt_id_vehiculo.getText();

                //String fechaParaSQL = formato.format(fecha);
                ps.setString(1, cap);
                ps.setDate(2, fecha2);
                ps.setString(3, km);
                ps.setString(4, descripcion);
                ps.setString(5, id);

                txt_descripcion.setText("");
                txt_fecha.setText("");
                txt_kilometraje.setText("");
                txt_id_vehiculo.setText("");
                ps.executeUpdate();
                
                placeholder();

                JOptionPane.showMessageDialog(null, "Registro Exitoso");
                
                global.GrabaBitacora(ClsBitacora.SystemUser, "Agrego en mantenimiento vehiculo");

                con.close();
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR", "Error en los datos.", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        // TODO add your handling code here:
        if ((txt_descripcion.getText().matches("[a-zA-Z]+")) && (txt_id_vehiculo.getText().matches("[0-9]+"))
                && (txt_kilometraje.getText().matches("[0-9]+"))) {

            String fc = txt_fecha.getText();
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-mm-dd");
            java.util.Date fecha1 = null; // crea objetos tipo util.Date y sql.Date
            java.sql.Date fecha2 = null;
            try {
                fecha1 = formato.parse(txt_fecha.getText()); // convierte el string en util.Date
            } catch (ParseException ex) {
                Logger.getLogger(mantenimientoVehiculo.class.getName()).log(Level.SEVERE, null, ex);
            }
            fecha2 = new java.sql.Date(fecha1.getTime()); // convierte el util.Date en sql.Date

            try {
                ps = (PreparedStatement) con.prepareStatement("UPDATE tbl_servicios_vehiculo SET  dFecha_Servicio = ?,"
                        + " cKilimetraje_En_El momento = ?, cDescripcion_Del_Servicio_Realizado = ?, Fk_iId_Vehiculo = ? WHERE Pk_iId_Servicios_Vehiculo = ?");//Evitar sql injection.

                ps.setDate(1, fecha2);
                ps.setString(2, txt_kilometraje.getText());
                ps.setString(3, txt_descripcion.getText());
                ps.setString(4, txt_id_vehiculo.getText());
                ps.setString(5, txt_buscar.getText());

                int res = ps.executeUpdate();

                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Modificado correctamente.", "ÉXITO", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR", "ERROR AL GUARDAR", JOptionPane.ERROR_MESSAGE);
                }
                //con.close();

                txt_descripcion.setText("");
                txt_fecha.setText("");
                txt_kilometraje.setText("");
                txt_id_vehiculo.setText("");
                txt_buscar.setText("");
                placeholder();
                
                global.GrabaBitacora(ClsBitacora.SystemUser, "modifico en mantenimiento vehiculo");

            } catch (Exception e) {
                System.err.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR", "Error en los datos.", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        if ((txt_buscar.getText().matches("[0-9]+"))) {

            try {
                ps = (PreparedStatement) con.prepareStatement("DELETE FROM tbl_servicios_vehiculo WHERE Pk_iId_Servicios_Vehiculo = ?");//Evitar sql injection.
                ps.setInt(1, Integer.parseInt(txt_buscar.getText()));

                int res = ps.executeUpdate();

                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Eliminado correctamente.", "ÉXITO", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR", "ERROR AL ELIMINAR", JOptionPane.ERROR_MESSAGE);
                }
                //con.close();

                txt_descripcion.setText("");
                txt_kilometraje.setText("");
                txt_fecha.setText("");
                txt_id_vehiculo.setText("");
                txt_buscar.setText("");
                placeholder();
                
                global.GrabaBitacora(ClsBitacora.SystemUser, "Elimino en mantenimiento vehiculo");

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

    private void txt_fechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fechaKeyTyped
        // TODO add your handling code here:
        validacion(evt);
    }//GEN-LAST:event_txt_fechaKeyTyped

    private void txt_id_vehiculoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_id_vehiculoKeyTyped
        // TODO add your handling code here:
        validacion(evt);
    }//GEN-LAST:event_txt_id_vehiculoKeyTyped

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

    public void validacion(KeyEvent e){
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
            java.util.logging.Logger.getLogger(mantenimientoVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mantenimientoVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mantenimientoVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mantenimientoVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mantenimientoVehiculo().setVisible(true);
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
    private javax.swing.JLabel lbl_codigo_vehiculo;
    private javax.swing.JLabel lbl_fecha;
    private javax.swing.JLabel lbl_id_vehiculo;
    private javax.swing.JLabel lbl_lugar;
    private javax.swing.JLabel lbl_texto;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_id_vehiculo;
    private javax.swing.JTextField txt_kilometraje;
    // End of variables declaration//GEN-END:variables
}
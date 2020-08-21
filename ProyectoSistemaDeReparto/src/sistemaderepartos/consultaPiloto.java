/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaderepartos;

import java.awt.Image;
import java.awt.event.ItemEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import static sistemaderepartos.consultaAppPiloto.reiniciarJTable;
import sistemaderepartos.consultas;
/**
 *
 * @author dairy
 */
public class consultaPiloto extends javax.swing.JFrame {

    /**
     * Creates new form consultaPiloto
     */
    Conexion cn = new Conexion();
    Connection con = cn.getConnection();
    PreparedStatement ps;
    ResultSet rs;
    
    ClsBitacora global = new ClsBitacora();

    DefaultTableModel tabla = new DefaultTableModel();
    
    public consultaPiloto() {
        initComponents();
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
        lbl_titulo = new javax.swing.JLabel();
        img_ayuda2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cbx_piloto = new javax.swing.JComboBox<>();
        btn_reporte = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(29, 53, 87));

        lbl_titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_titulo.setText("Consultas Pilotos");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_titulo)
                .addGap(229, 229, 229)
                .addComponent(img_ayuda2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(img_ayuda2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(69, 155, 157));

        cbx_piloto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Elija una opcion-", "Pilotos asignados a determinadas zonas.", "Pilotos con menos y más entregas.", "Pilotos con menos y más accidentes.", "Pilotos con entregas tardías.", "Pilotos con entregas incompletas." }));
        cbx_piloto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_pilotoItemStateChanged(evt);
            }
        });

        btn_reporte.setText("GENERAR REPORTE");
        btn_reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reporteActionPerformed(evt);
            }
        });

        btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/OpcionRegresar.png"))); // NOI18N
        btn_regresar.setText("Regresar");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cbx_piloto, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(253, 253, 253))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_reporte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_regresar)))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(cbx_piloto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_reporte, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_regresar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        consultas volver = new consultas();
        volver.setVisible(true);
        dispose();
        volver.setLocationRelativeTo(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void cbx_pilotoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_pilotoItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (cbx_piloto.getSelectedItem().toString().equals("Pilotos asignados a determinadas zonas.")) {
                reiniciarJTable(jTable1);
                cargarTitulosColumas();
                try {
                    cargarDatos();
                    global.GrabaBitacora(ClsBitacora.SystemUser, "Consultó en Piloto");
                } catch (SQLException ex) {
                    Logger.getLogger(bitacora.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (cbx_piloto.getSelectedItem().toString().equals("Pilotos con menos y más entregas.")) {
                reiniciarJTable(jTable1);
                cargarTitulosColumas1();
                try {
                    cargarDatos1();
                    global.GrabaBitacora(ClsBitacora.SystemUser, "Consultó en Piloto");
                } catch (SQLException ex) {
                    Logger.getLogger(bitacora.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (cbx_piloto.getSelectedItem().toString().equals("Pilotos con menos y más accidentes.")) {
                reiniciarJTable(jTable1);
                cargarTitulosColumas2();
                try {
                    cargarDatos2();
                    global.GrabaBitacora(ClsBitacora.SystemUser, "Consultó en Piloto");
                } catch (SQLException ex) {
                    Logger.getLogger(bitacora.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (cbx_piloto.getSelectedItem().toString().equals("Pilotos con entregas tardías.")) {
                reiniciarJTable(jTable1);
                cargarTitulosColumas3();
                try {
                    cargarDatos3();
                    global.GrabaBitacora(ClsBitacora.SystemUser, "Consultó en Piloto");
                } catch (SQLException ex) {
                    Logger.getLogger(bitacora.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (cbx_piloto.getSelectedItem().toString().equals("Pilotos con entregas incompletas.")) {
                reiniciarJTable(jTable1);
                cargarTitulosColumas4();
                try {
                    cargarDatos4();
                    global.GrabaBitacora(ClsBitacora.SystemUser, "Consultó en Piloto");
                } catch (SQLException ex) {
                    Logger.getLogger(bitacora.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_cbx_pilotoItemStateChanged

    private void btn_reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reporteActionPerformed
        // TODO add your handling code here:
        try {

		//Llamada al Reporte
            JasperDesign jdesign = JRXmlLoader.load("src\\sistemaderepartos\\Piloto.jrxml");
		//Compilaci[on del Reporte
            JasperReport jreport = JasperCompileManager.compileReport(jdesign);
		// LLenado del reporte
            JasperPrint jprint = JasperFillManager.fillReport(jreport, null,con);
		// Visualizar reporte
            JasperViewer.viewReport(jprint);
            
                    global.GrabaBitacora(ClsBitacora.SystemUser, "Genero Reporte en Piloto");

        } catch (JRException ex) {
            Logger.getLogger(consultaEnBodega.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_reporteActionPerformed

    private void img_ayuda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img_ayuda2ActionPerformed
        // TODO add your handling code here:
        try {

            if ((new File("ayudaFormulario.chm")).exists()) {

                Process p = Runtime
                .getRuntime()
                .exec("rundll32 url.dll,FileProtocolHandler ayudaConsulta.chm");
                p.waitFor();

            } else {

                System.out.println("La ayuda no Fue encontrada");

            }

            System.out.println("Correcto");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_img_ayuda2ActionPerformed

    public static void reiniciarJTable(javax.swing.JTable Tabla) {
        DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        TableColumnModel modCol = Tabla.getColumnModel();
        while (modCol.getColumnCount() > 0) {
            modCol.removeColumn(modCol.getColumn(0));
        }
    }

    public void cargarTitulosColumas() {
        tabla.addColumn("ID de Empleado");
        tabla.addColumn("Nombre Empleado");
        tabla.addColumn("Apellido de Empleado");
        tabla.addColumn("DPI de empleado");
        tabla.addColumn("Fecha de nacimiento");
        tabla.addColumn("ID puesto");
        tabla.addColumn("ID estado empleado");
        tabla.addColumn("Nombre Puesto");
        tabla.addColumn("Nombre zona");
        this.jTable1.setModel(tabla);
    }

    public void cargarDatos() throws SQLException {
        String datos[] = new String[9];    //Variable que almacena los datos de la consulta
        ps = (PreparedStatement) con.prepareStatement("SELECT `tbl_empleado`.*, `tbl_puesto_empleado`.`cNombre_Puesto_Empleado`, `tbl_zona_destino`.`cNombre_Zona_Destino` FROM `tbl_empleado` \n"
                + "LEFT JOIN `tbl_puesto_empleado` ON `tbl_empleado`.`Fk_iId_Puesto_Empleado` = `tbl_puesto_empleado`.`Pk_iId_Puesto_Empleado` \n"
                + "LEFT JOIN `tbl_zona_destino` ON `tbl_zona_destino`.`Fk_iId_Empleado` = `tbl_empleado`.`Pk_iId_Empleado` \n"
                + "WHERE (`tbl_puesto_empleado`.`cNombre_Puesto_Empleado` LIKE '%piloto%') \n"
                + "ORDER BY `tbl_puesto_empleado`.`cNombre_Puesto_Empleado` ASC, `tbl_zona_destino`.`cNombre_Zona_Destino` ASC");//Evitar sql injection
        try {
            rs = ps.executeQuery();  //Linea que ejecuta la consulta sql y almacena los datos en resultado

            while (rs.next()) {                                    //Bucle que recorre la consulta obtenida
                datos[0] = rs.getString("Pk_iId_Empleado");
                datos[1] = rs.getString("cNombre_Empleado");
                datos[2] = rs.getString("cAoellido_Empleado");
                datos[3] = rs.getString("cDpi_Empleado");
                datos[4] = rs.getString("dFecha_Nacimiento_Empleado");
                datos[5] = rs.getString("Fk_iId_Puesto_Empleado");
                datos[6] = rs.getString("Fk_iId_Estado_Empleado");
                datos[7] = rs.getString("cNombre_Puesto_Empleado");
                datos[8] = rs.getString("cNombre_Zona_Destino");
                tabla.addRow(datos);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar los Datos\n" + ex);
        }
    }

    public void cargarTitulosColumas1() {
        tabla.addColumn("ID de Empleado");
        tabla.addColumn("Numero de entregas");
        this.jTable1.setModel(tabla);
    }

    public void cargarDatos1() throws SQLException {
        String datos[] = new String[2];    //Variable que almacena los datos de la consulta
        ps = (PreparedStatement) con.prepareStatement("SELECT `tbl_entregas_de_empleado`.`Pk_iId_Empleado`, \n"
                + "COUNT(`tbl_entregas_de_empleado`.`Pk_iId_Entrega`)AS 'numero_de_entregas'\n"
                + "FROM `tbl_entregas_de_empleado`GROUP BY Pk_iId_Empleado ");//Evitar sql injection
        try {
            rs = ps.executeQuery();  //Linea que ejecuta la consulta sql y almacena los datos en resultado

            while (rs.next()) {                                    //Bucle que recorre la consulta obtenida
                datos[0] = rs.getString("Pk_iId_Empleado");
                datos[1] = rs.getString("numero_de_entregas");
                tabla.addRow(datos);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar los Datos\n" + ex);
        }
    }

    public void cargarTitulosColumas2() {
        tabla.addColumn("Numero de accidentes");
        tabla.addColumn("Descripcion de accidente");
        tabla.addColumn("ID de empleado");
        this.jTable1.setModel(tabla);
    }

    public void cargarDatos2() throws SQLException {
        String datos[] = new String[2];    //Variable que almacena los datos de la consulta
        ps = (PreparedStatement) con.prepareStatement("SELECT COUNT(`tbl_accidentes_empleado`.`Pk_iId_Accidente`) \n"
                + "AS 'numero de accidentes', `tbl_accidentes_empleado`.`cDescripcion_Accidente`, `tbl_accidentes_empleado`.`Fk_iId_Empleado`\n"
                + "FROM `tbl_accidentes_empleado`\n"
                + "GROUP BY Fk_iId_Empleado");//Evitar sql injection
        try {
            rs = ps.executeQuery();  //Linea que ejecuta la consulta sql y almacena los datos en resultado

            while (rs.next()) {             //Bucle que recorre la consulta obtenida
                datos[0] = rs.getString("cDescripcion_Accidente");             //Bucle que recorre la consulta obtenida
                datos[1] = rs.getString("Fk_iId_Empleado");
                tabla.addRow(datos);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar los Datos\n" + ex);
        }
    }

    public void cargarTitulosColumas3() {
        tabla.addColumn("Nombre de Empleado");
        tabla.addColumn("ID de entrega");
        tabla.addColumn("Nombre de estado");
        this.jTable1.setModel(tabla);
    }

    public void cargarDatos3() throws SQLException {
        String datos[] = new String[3];    //Variable que almacena los datos de la consulta
        ps = (PreparedStatement) con.prepareStatement("SELECT `tbl_empleado`.`cNombre_Empleado`, `tbl_entregas_de_empleado`.`Pk_iId_Entrega`, `tbl_estado_entrega`.`Nombre_Estado` \n"
                + "FROM `tbl_empleado` LEFT JOIN `tbl_entregas_de_empleado` ON `tbl_entregas_de_empleado`.`Pk_iId_Empleado` = `tbl_empleado`.`Pk_iId_Empleado` \n"
                + "LEFT JOIN `tbl_entrega` ON `tbl_entregas_de_empleado`.`Pk_iId_Entrega` = `tbl_entrega`.`Pk_iId_Entrega` LEFT JOIN `tbl_estado_entrega` \n"
                + "ON `tbl_entrega`.`Fk_iId_Estado_Entrega` = `tbl_estado_entrega`.`Pk_iId_Estado_Entrega` WHERE (`tbl_estado_entrega`.`Nombre_Estado` Like'%Tarde%')");//Evitar sql injection
        try {
            rs = ps.executeQuery();  //Linea que ejecuta la consulta sql y almacena los datos en resultado

            while (rs.next()) {                                    //Bucle que recorre la consulta obtenida
                datos[0] = rs.getString("cNombre_Empleado");
                datos[1] = rs.getString("Pk_iId_Entrega");
                datos[2] = rs.getString("Pk_iId_Entrega");
                tabla.addRow(datos);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar los Datos\n" + ex);
        }
    }

    public void cargarTitulosColumas4() {
        tabla.addColumn("Nombre de Empleado");
        tabla.addColumn("ID de entrega");
        tabla.addColumn("Nombre de estado");
        this.jTable1.setModel(tabla);
    }

    public void cargarDatos4() throws SQLException {
        String datos[] = new String[3];    //Variable que almacena los datos de la consulta
        ps = (PreparedStatement) con.prepareStatement("SELECT `tbl_empleado`.`cNombre_Empleado`, `tbl_entregas_de_empleado`.`Pk_iId_Entrega`, `tbl_estado_entrega`.`Nombre_Estado` FROM `tbl_empleado` \n"
                + "LEFT JOIN `tbl_entregas_de_empleado` ON `tbl_entregas_de_empleado`.`Pk_iId_Empleado` = `tbl_empleado`.`Pk_iId_Empleado` LEFT JOIN `tbl_entrega` \n"
                + "ON `tbl_entregas_de_empleado`.`Pk_iId_Entrega` = `tbl_entrega`.`Pk_iId_Entrega` \n"
                + "LEFT JOIN `tbl_estado_entrega` ON `tbl_entrega`.`Fk_iId_Estado_Entrega` = `tbl_estado_entrega`.`Pk_iId_Estado_Entrega` \n"
                + "WHERE (`tbl_estado_entrega`.`Nombre_Estado` Like'%Incompleta%')");//Evitar sql injection
        try {
            rs = ps.executeQuery();  //Linea que ejecuta la consulta sql y almacena los datos en resultado

            while (rs.next()) {                                    //Bucle que recorre la consulta obtenida
                datos[0] = rs.getString("cNombre_Empleado");
                datos[1] = rs.getString("Pk_iId_Entrega");
                datos[2] = rs.getString("Nombre_Estado");
                tabla.addRow(datos);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar los Datos\n" + ex); 
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
            java.util.logging.Logger.getLogger(consultaPiloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consultaPiloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consultaPiloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consultaPiloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consultaPiloto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton btn_reporte;
    private javax.swing.JComboBox<String> cbx_piloto;
    private javax.swing.JButton img_ayuda2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_titulo;
    // End of variables declaration//GEN-END:variables
}

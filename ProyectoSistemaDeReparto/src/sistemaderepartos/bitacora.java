/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaderepartos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josej
 */
public class bitacora extends javax.swing.JFrame {

    /**
     * Creates new form bitacora
     */
    Conexion cn = new Conexion();
    Connection con = cn.getConnection();
    PreparedStatement ps;
    ResultSet rs;

    DefaultTableModel tabla = new DefaultTableModel();   //Codigo que crea el modelo de la tabla

    public bitacora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        cbx_repartidor = new javax.swing.JComboBox<>();
        btn_consultar = new javax.swing.JButton();
        btn_reporte = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlt_repartidor = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        cbx_repartidor1 = new javax.swing.JComboBox<>();
        btn_consultar1 = new javax.swing.JButton();
        btn_reporte1 = new javax.swing.JButton();
        btn_regresar1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlt_repartidor1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btn_consultar2 = new javax.swing.JButton();
        btn_regresar2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel2.setBackground(new java.awt.Color(69, 155, 157));

        cbx_repartidor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quejas Negativas por Parte del Consumidor", "Quejas Positivas por Parte del Consumidor", "Entregas Incompletas" }));

        btn_consultar.setText("CONSULTAR");

        btn_reporte.setText("GENERAR REPORTE");

        btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/OpcionRegresar.png"))); // NOI18N
        btn_regresar.setText("Regresar");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jlt_repartidor);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(cbx_repartidor, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(btn_consultar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_reporte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_regresar)))
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_repartidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_consultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_reporte, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_regresar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(69, 155, 157));

        cbx_repartidor1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quejas Negativas por Parte del Consumidor", "Quejas Positivas por Parte del Consumidor", "Entregas Incompletas" }));

        btn_consultar1.setText("CONSULTAR");

        btn_reporte1.setText("GENERAR REPORTE");

        btn_regresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/OpcionRegresar.png"))); // NOI18N
        btn_regresar1.setText("Regresar");
        btn_regresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresar1ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jlt_repartidor1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(cbx_repartidor1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(btn_consultar1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_reporte1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_regresar1)))
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_repartidor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_consultar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_reporte1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_regresar1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(29, 53, 87));

        lbl_titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_titulo.setText("BITACORA");

        jPanel4.setBackground(new java.awt.Color(69, 155, 157));

        btn_consultar2.setText("CONSULTAR");
        btn_consultar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultar2ActionPerformed(evt);
            }
        });

        btn_regresar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/OpcionRegresar.png"))); // NOI18N
        btn_regresar2.setText("Regresar");
        btn_regresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresar2ActionPerformed(evt);
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
                "CODIGO", "USUARIO", "FECHA", "DESCRIPCION"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_consultar2)
                    .addComponent(btn_regresar2))
                .addGap(23, 23, 23))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btn_consultar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_regresar2)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(lbl_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        menu volver = new menu();
        volver.setVisible(true);
        dispose();
        volver.setLocationRelativeTo(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_regresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresar1ActionPerformed
        menu volver = new menu();
        volver.setVisible(true);
        dispose();
        volver.setLocationRelativeTo(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_regresar1ActionPerformed

    private void btn_regresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresar2ActionPerformed
        menu volver = new menu();
        volver.setVisible(true);
        dispose();
        volver.setLocationRelativeTo(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_regresar2ActionPerformed

    private void btn_consultar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultar2ActionPerformed
        // TODO add your handling code here:
        cargarTitulosColumas();
        try {
            cargarDatos();
        } catch (SQLException ex) {
            Logger.getLogger(bitacora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_consultar2ActionPerformed

    public void cargarTitulosColumas() {
        tabla.addColumn("Usuario");
        tabla.addColumn("Fecha");
        tabla.addColumn("Descripcion");
        this.jTable1.setModel(tabla);
    }
    
    public void cargarDatos() throws SQLException {
        String datos[] = new String[3];    //Variable que almacena los datos de la consulta
        ps = (PreparedStatement) con.prepareStatement("SELECT * FROM tbl_bitacora");//Evitar sql injection
        try {
            rs = ps.executeQuery();  //Linea que ejecuta la consulta sql y almacena los datos en resultado

            while (rs.next()) {                                    //Bucle que recorre la consulta obtenida
                datos[0] = rs.getString("cNombre_De_Usuario");
                datos[1] = rs.getString("dFecha");
                datos[2] = rs.getString("cTabla_Afectada");
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
            java.util.logging.Logger.getLogger(bitacora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bitacora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bitacora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bitacora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bitacora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_consultar1;
    private javax.swing.JButton btn_consultar2;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton btn_regresar1;
    private javax.swing.JButton btn_regresar2;
    private javax.swing.JButton btn_reporte;
    private javax.swing.JButton btn_reporte1;
    private javax.swing.JComboBox<String> cbx_repartidor;
    private javax.swing.JComboBox<String> cbx_repartidor1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JList<String> jlt_repartidor;
    private javax.swing.JList<String> jlt_repartidor1;
    private javax.swing.JLabel lbl_titulo;
    // End of variables declaration//GEN-END:variables
}

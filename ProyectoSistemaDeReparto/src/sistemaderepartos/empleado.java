/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaderepartos;

import com.placeholder.PlaceHolder;

/**
 *
 * @author dairy
 */
public class empleado extends javax.swing.JFrame {

    /**
     * Creates new form empleado
     */
    PlaceHolder holder;
    public empleado() {
        initComponents();
        holder = new PlaceHolder(txt_buscar,"Codigo a buscar");
        holder = new PlaceHolder(txt_cod_empleado,"Codigo de empleado");
        holder = new PlaceHolder(txt_nombre,"Nombre ");
        holder = new PlaceHolder(txt_apellido,"Apellido");
        holder = new PlaceHolder(txt_correo,"Correo");
        holder = new PlaceHolder(txt_telefono,"Telefono");
        holder = new PlaceHolder(txt_nacimiento,"Fecha de nacimiento");
        holder = new PlaceHolder(txt_dpi,"DPI");
        holder = new PlaceHolder(txt_puesto,"Puesto");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        lbl_texto = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_codigo_emp = new javax.swing.JLabel();
        lbl_apellido = new javax.swing.JLabel();
        lbl_correo = new javax.swing.JLabel();
        lbl_nacimiento = new javax.swing.JLabel();
        lbl_dpi = new javax.swing.JLabel();
        lbl_telefono = new javax.swing.JLabel();
        lbl_puesto = new javax.swing.JLabel();
        txt_cod_empleado = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_dpi = new javax.swing.JTextField();
        txt_nacimiento = new javax.swing.JTextField();
        txt_puesto = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        txt_buscar = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_texto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_texto.setText("EMPLEADO");

        lbl_nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_nombre.setText("Nombre:");

        lbl_codigo_emp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_codigo_emp.setText("Codigo Empleado:");

        lbl_apellido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_apellido.setText("Apellido:");

        lbl_correo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_correo.setText("Correo:");

        lbl_nacimiento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_nacimiento.setText("Fecha de Nacimiento:");

        lbl_dpi.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_dpi.setText("DPI:");

        lbl_telefono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_telefono.setText("Teléfono:");

        lbl_puesto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_puesto.setText("Puesto:");

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/OpcionGuardar.png"))); // NOI18N
        btn_guardar.setText("Guardar");

        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/OpcionModificar.png"))); // NOI18N
        btn_modificar.setText("Modificar");

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/OpcionEliminar.png"))); // NOI18N
        btn_eliminar.setText("Eliminar");

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/OpcionBuscar.png"))); // NOI18N
        btn_buscar.setText("Buscar");

        btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/OpcionRegresar.png"))); // NOI18N
        btn_regresar.setText("Regresar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_modificar)
                            .addComponent(lbl_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btn_buscar)))
                .addContainerGap(159, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_apellido)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_codigo_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_nombre)
                            .addComponent(lbl_correo)
                            .addComponent(lbl_telefono)
                            .addComponent(lbl_nacimiento)
                            .addComponent(lbl_dpi)
                            .addComponent(lbl_puesto)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btn_guardar)))
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_dpi, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cod_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(btn_eliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_regresar)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbl_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_codigo_emp)
                            .addComponent(txt_cod_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nombre)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_apellido)
                            .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_correo)
                            .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_telefono)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nacimiento)
                            .addComponent(txt_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_dpi)
                            .addComponent(txt_dpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_puesto)
                            .addComponent(txt_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addComponent(btn_regresar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_guardar)
                            .addComponent(btn_modificar)
                            .addComponent(btn_eliminar))
                        .addGap(23, 23, 23))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_codigo_emp;
    private javax.swing.JLabel lbl_correo;
    private javax.swing.JLabel lbl_dpi;
    private javax.swing.JLabel lbl_nacimiento;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_puesto;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel lbl_texto;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_cod_empleado;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_dpi;
    private javax.swing.JTextField txt_nacimiento;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_puesto;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}

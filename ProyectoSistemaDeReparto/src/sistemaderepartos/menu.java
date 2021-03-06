/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaderepartos;

import java.awt.Dimension;
import sistemaderepartos.accidente;
import sistemaderepartos.bodega;
import sistemaderepartos.cliente;
import sistemaderepartos.comprobante;
import sistemaderepartos.empleado;
import sistemaderepartos.entregas;
import sistemaderepartos.ordenes;
import sistemaderepartos.paquete;
import sistemaderepartos.quejas;
import sistemaderepartos.vehiculo;
import sistemaderepartos.zonasdestinadas;
import sistemaderepartos.consultas;
import sistemaderepartos.login;
import sistemaderepartos.usuarios;
import sistemaderepartos.mantenimientoVehiculo;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.sql.*;
import javax.swing.JOptionPane;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author dairy
 */
public class menu extends javax.swing.JFrame {

    //Instancias y variables---------
    Conexion cn = new Conexion();
    Connection con = cn.getConnection();
    PreparedStatement ps;
    
    ClsBitacora global = new ClsBitacora();

    FondoPanel fondoso = new FondoPanel();

    /**
     * Creates new form menu
     */
    public menu() {

        this.setContentPane(fondoso);
        initComponents();
        this.setSize(new Dimension(660, 750));
        ImageIcon imagen = new ImageIcon("src/imagenes/cliente.png");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(img_cliente.getWidth(), img_cliente.getHeight(), Image.SCALE_DEFAULT));
        img_cliente.setIcon(icono);
        this.repaint();

        ImageIcon imagen1 = new ImageIcon("src/imagenes/camion.png");
        Icon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(img_camion.getWidth(), img_camion.getHeight(), Image.SCALE_DEFAULT));
        img_camion.setIcon(icono1);
        this.repaint();

        ImageIcon imagen2 = new ImageIcon("src/imagenes/consulta.png");
        Icon icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(img_consulta.getWidth(), img_consulta.getHeight(), Image.SCALE_DEFAULT));
        img_consulta.setIcon(icono2);
        this.repaint();

        ImageIcon imagen3 = new ImageIcon("src/imagenes/empleados.png");
        Icon icono3 = new ImageIcon(imagen3.getImage().getScaledInstance(img_empleados.getWidth(), img_empleados.getHeight(), Image.SCALE_DEFAULT));
        img_empleados.setIcon(icono3);
        this.repaint();

        ImageIcon imagen4 = new ImageIcon("src/imagenes/paquete.png");
        Icon icono4 = new ImageIcon(imagen4.getImage().getScaledInstance(img_paquete.getWidth(), img_paquete.getHeight(), Image.SCALE_DEFAULT));
        img_paquete.setIcon(icono4);
        this.repaint();

        ImageIcon imagen5 = new ImageIcon("src/imagenes/mantenimiento.png");
        Icon icono5 = new ImageIcon(imagen5.getImage().getScaledInstance(img_mantenimiento.getWidth(), img_mantenimiento.getHeight(), Image.SCALE_DEFAULT));
        img_mantenimiento.setIcon(icono5);
        this.repaint();

        ImageIcon imagen6 = new ImageIcon("src/imagenes/acc.png");
        Icon icono6 = new ImageIcon(imagen6.getImage().getScaledInstance(img_accidente.getWidth(), img_accidente.getHeight(), Image.SCALE_DEFAULT));
        img_accidente.setIcon(icono6);
        this.repaint();

        ImageIcon imagen7 = new ImageIcon("src/imagenes/bodega.png");
        Icon icono7 = new ImageIcon(imagen7.getImage().getScaledInstance(img_bodega.getWidth(), img_bodega.getHeight(), Image.SCALE_DEFAULT));
        img_bodega.setIcon(icono7);
        this.repaint();

        ImageIcon imagen8 = new ImageIcon("src/imagenes/comprobante.png");
        Icon icono8 = new ImageIcon(imagen8.getImage().getScaledInstance(img_comprobante.getWidth(), img_comprobante.getHeight(), Image.SCALE_DEFAULT));
        img_comprobante.setIcon(icono8);
        this.repaint();

        /*ImageIcon imagen9 = new ImageIcon("src/imagenes/departamento.png");
        Icon icono9 = new ImageIcon(imagen9.getImage().getScaledInstance(img_departamento.getWidth(), img_departamento.getHeight(), Image.SCALE_DEFAULT));
        img_departamento.setIcon(icono9);
        this.repaint();*/
 /*ImageIcon imagen10 = new ImageIcon("src/imagenes/muni.png");
        Icon icono10 = new ImageIcon(imagen10.getImage().getScaledInstance(img_municipio.getWidth(), img_municipio.getHeight(), Image.SCALE_DEFAULT));
        img_municipio.setIcon(icono10);
        this.repaint();*/
        ImageIcon imagen11 = new ImageIcon("src/imagenes/entrega.png");
        Icon icono11 = new ImageIcon(imagen11.getImage().getScaledInstance(img_entrega.getWidth(), img_entrega.getHeight(), Image.SCALE_DEFAULT));
        img_entrega.setIcon(icono11);
        this.repaint();

        ImageIcon imagen12 = new ImageIcon("src/imagenes/orden.png");
        Icon icono12 = new ImageIcon(imagen12.getImage().getScaledInstance(img_orden.getWidth(), img_orden.getHeight(), Image.SCALE_DEFAULT));
        img_orden.setIcon(icono12);
        this.repaint();

        /*ImageIcon imagen13 = new ImageIcon("src/imagenes/puesto.png");
        Icon icono13 = new ImageIcon(imagen13.getImage().getScaledInstance(img_puesto.getWidth(), img_puesto.getHeight(), Image.SCALE_DEFAULT));
        img_puesto.setIcon(icono13);
        this.repaint();*/
        ImageIcon imagen14 = new ImageIcon("src/imagenes/queja.png");
        Icon icono14 = new ImageIcon(imagen14.getImage().getScaledInstance(img_quejas.getWidth(), img_quejas.getHeight(), Image.SCALE_DEFAULT));
        img_quejas.setIcon(icono14);
        this.repaint();

        ImageIcon imagen15 = new ImageIcon("src/imagenes/zona.png");
        Icon icono15 = new ImageIcon(imagen15.getImage().getScaledInstance(img_zonas.getWidth(), img_zonas.getHeight(), Image.SCALE_DEFAULT));
        img_zonas.setIcon(icono15);
        this.repaint();

        ImageIcon imagen16 = new ImageIcon("src/imagenes/usuario.png");
        Icon icono16 = new ImageIcon(imagen16.getImage().getScaledInstance(img_usuario.getWidth(), img_usuario.getHeight(), Image.SCALE_DEFAULT));
        img_usuario.setIcon(icono16);
        this.repaint();

        ImageIcon imagen17 = new ImageIcon("src/imagenes/cerrar.png");
        Icon icono17 = new ImageIcon(imagen17.getImage().getScaledInstance(img_cerrar.getWidth(), img_cerrar.getHeight(), Image.SCALE_DEFAULT));
        img_cerrar.setIcon(icono17);
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

        img_cliente = new javax.swing.JButton();
        img_camion = new javax.swing.JButton();
        lbl_menu = new javax.swing.JLabel();
        img_empleados = new javax.swing.JButton();
        img_accidente = new javax.swing.JButton();
        img_mantenimiento = new javax.swing.JButton();
        img_consulta = new javax.swing.JButton();
        lbl_vehiculo = new javax.swing.JLabel();
        lbl_consultas = new javax.swing.JLabel();
        lbl_cliente = new javax.swing.JLabel();
        lbl_reportes = new javax.swing.JLabel();
        lbl_empleados = new javax.swing.JLabel();
        lbl_paquete = new javax.swing.JLabel();
        img_paquete = new javax.swing.JButton();
        lbl_accidente = new javax.swing.JLabel();
        img_bodega = new javax.swing.JButton();
        lbl_bodega = new javax.swing.JLabel();
        img_comprobante = new javax.swing.JButton();
        lbl_comprobante = new javax.swing.JLabel();
        img_entrega = new javax.swing.JButton();
        lbl_entrega = new javax.swing.JLabel();
        img_orden = new javax.swing.JButton();
        lbl_orden = new javax.swing.JLabel();
        img_quejas = new javax.swing.JButton();
        lbl_quejas = new javax.swing.JLabel();
        img_zonas = new javax.swing.JButton();
        lbl_zonas = new javax.swing.JLabel();
        img_cerrar = new javax.swing.JButton();
        lbl_orden1 = new javax.swing.JLabel();
        img_usuario = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.red);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(667, 820));

        img_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente.png"))); // NOI18N
        img_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img_clienteActionPerformed(evt);
            }
        });

        img_camion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/camion.png"))); // NOI18N
        img_camion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img_camionActionPerformed(evt);
            }
        });

        lbl_menu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_menu.setForeground(new java.awt.Color(255, 255, 255));
        lbl_menu.setText("MENU");

        img_empleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empleados.png"))); // NOI18N
        img_empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img_empleadosActionPerformed(evt);
            }
        });

        img_accidente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/acc.png"))); // NOI18N
        img_accidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img_accidenteActionPerformed(evt);
            }
        });

        img_mantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mantenimiento.png"))); // NOI18N
        img_mantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img_mantenimientoActionPerformed(evt);
            }
        });

        img_consulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consulta.png"))); // NOI18N
        img_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img_consultaActionPerformed(evt);
            }
        });

        lbl_vehiculo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_vehiculo.setText("VEHICULO");

        lbl_consultas.setForeground(new java.awt.Color(255, 255, 255));
        lbl_consultas.setText("CONSULTAS");

        lbl_cliente.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cliente.setText("CLIENTE");

        lbl_reportes.setForeground(new java.awt.Color(255, 255, 255));
        lbl_reportes.setText("MANTENIMIENTO VEHICULO");

        lbl_empleados.setForeground(new java.awt.Color(255, 255, 255));
        lbl_empleados.setText("EMPLEADOS");

        lbl_paquete.setForeground(new java.awt.Color(255, 255, 255));
        lbl_paquete.setText("PAQUETE");

        img_paquete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/paquete.png"))); // NOI18N
        img_paquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img_paqueteActionPerformed(evt);
            }
        });

        lbl_accidente.setForeground(new java.awt.Color(255, 255, 255));
        lbl_accidente.setText("ACCIDENTE");

        img_bodega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bodega.png"))); // NOI18N
        img_bodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img_bodegaActionPerformed(evt);
            }
        });

        lbl_bodega.setForeground(new java.awt.Color(255, 255, 255));
        lbl_bodega.setText("BODEGA");

        img_comprobante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/comprobante.png"))); // NOI18N
        img_comprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img_comprobanteActionPerformed(evt);
            }
        });

        lbl_comprobante.setForeground(new java.awt.Color(255, 255, 255));
        lbl_comprobante.setText("COMPROBANTE");

        img_entrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrega.png"))); // NOI18N
        img_entrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img_entregaActionPerformed(evt);
            }
        });

        lbl_entrega.setForeground(new java.awt.Color(255, 255, 255));
        lbl_entrega.setText("ENTREGA");

        img_orden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/orden.png"))); // NOI18N
        img_orden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img_ordenActionPerformed(evt);
            }
        });

        lbl_orden.setForeground(new java.awt.Color(255, 255, 255));
        lbl_orden.setText("ORDEN");

        img_quejas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/queja.png"))); // NOI18N
        img_quejas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img_quejasActionPerformed(evt);
            }
        });

        lbl_quejas.setForeground(new java.awt.Color(255, 255, 255));
        lbl_quejas.setText("QUEJAS");

        img_zonas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zona.png"))); // NOI18N
        img_zonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img_zonasActionPerformed(evt);
            }
        });

        lbl_zonas.setForeground(new java.awt.Color(255, 255, 255));
        lbl_zonas.setText("ZONAS DESTINADAS");

        img_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        img_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img_cerrarActionPerformed(evt);
            }
        });

        lbl_orden1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_orden1.setText("USUARIOS");

        img_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        img_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img_usuarioActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/grabar(1).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BITACORA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lbl_comprobante)
                .addGap(88, 88, 88)
                .addComponent(lbl_entrega)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_quejas)
                .addGap(109, 109, 109)
                .addComponent(lbl_zonas)
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(img_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(lbl_paquete)
                                .addGap(126, 126, 126)
                                .addComponent(lbl_accidente))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(lbl_empleados))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(img_empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(img_paquete, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(158, 158, 158)
                                            .addComponent(img_camion, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(img_comprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(img_entrega, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(img_accidente, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(img_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(img_quejas, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lbl_cliente)
                        .addGap(114, 114, 114)
                        .addComponent(lbl_vehiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_consultas)
                        .addGap(66, 66, 66)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_reportes)
                            .addComponent(img_mantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(img_zonas, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(img_bodega, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_bodega)
                        .addGap(98, 98, 98))))
            .addGroup(layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(lbl_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(267, 267, 267))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1)))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(img_orden, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_orden)
                        .addGap(48, 48, 48)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(lbl_orden1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(img_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(img_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lbl_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_consultas)
                    .addComponent(lbl_vehiculo)
                    .addComponent(lbl_cliente)
                    .addComponent(lbl_reportes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(img_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(img_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(img_camion, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(img_mantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_empleados)
                    .addComponent(lbl_paquete)
                    .addComponent(lbl_accidente)
                    .addComponent(lbl_bodega))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(img_paquete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(img_empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(img_accidente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(img_bodega, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_comprobante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(img_comprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_quejas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(img_quejas, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_entrega, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_zonas, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(img_entrega, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(img_zonas, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_orden)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(img_orden, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_orden1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(img_cerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(img_usuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void img_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img_clienteActionPerformed
        cliente volver = new cliente();
        volver.setVisible(true);
        dispose();
        volver.setLocationRelativeTo(null);
    }//GEN-LAST:event_img_clienteActionPerformed

    private void img_camionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img_camionActionPerformed
        vehiculo volver = new vehiculo();
        volver.setVisible(true);
        dispose();
        volver.setLocationRelativeTo(null);
    }//GEN-LAST:event_img_camionActionPerformed

    private void img_accidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img_accidenteActionPerformed
        accidente volver = new accidente();
        volver.setVisible(true);
        dispose();
        volver.setLocationRelativeTo(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_img_accidenteActionPerformed

    private void img_bodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img_bodegaActionPerformed
        bodega volver = new bodega();
        volver.setVisible(true);
        dispose();
        volver.setLocationRelativeTo(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_img_bodegaActionPerformed

    private void img_comprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img_comprobanteActionPerformed
        comprobante volver = new comprobante();
        volver.setVisible(true);
        dispose();
        volver.setLocationRelativeTo(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_img_comprobanteActionPerformed

    private void img_entregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img_entregaActionPerformed
        entregas volver = new entregas();
        volver.setVisible(true);
        dispose();
        volver.setLocationRelativeTo(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_img_entregaActionPerformed

    private void img_ordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img_ordenActionPerformed
        ordenes volver = new ordenes();
        volver.setVisible(true);
        dispose();
        volver.setLocationRelativeTo(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_img_ordenActionPerformed

    private void img_quejasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img_quejasActionPerformed
        quejas volver = new quejas();
        volver.setVisible(true);
        dispose();
        volver.setLocationRelativeTo(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_img_quejasActionPerformed

    private void img_zonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img_zonasActionPerformed
        zonasdestinadas volver = new zonasdestinadas();
        volver.setVisible(true);
        dispose();
        volver.setLocationRelativeTo(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_img_zonasActionPerformed

    private void img_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img_consultaActionPerformed
        consultas volver = new consultas();
        volver.setVisible(true);
        dispose();
        volver.setLocationRelativeTo(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_img_consultaActionPerformed

    private void img_mantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img_mantenimientoActionPerformed
        mantenimientoVehiculo volver = new mantenimientoVehiculo();
        volver.setVisible(true);
        dispose();
        volver.setLocationRelativeTo(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_img_mantenimientoActionPerformed

    private void img_empleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img_empleadosActionPerformed
        empleado volver = new empleado();
        volver.setVisible(true);
        dispose();
        volver.setLocationRelativeTo(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_img_empleadosActionPerformed

    private void img_paqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img_paqueteActionPerformed
        paquete volver = new paquete();
        volver.setVisible(true);
        dispose();
        volver.setLocationRelativeTo(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_img_paqueteActionPerformed

    private void img_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img_cerrarActionPerformed
        login volver = new login();
        volver.setVisible(true);
        dispose();
        volver.setLocationRelativeTo(null);
        global.GrabaBitacora(ClsBitacora.SystemUser, "Salio del Programa");
        // TODO add your handling code here:
    }//GEN-LAST:event_img_cerrarActionPerformed

    private void img_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img_usuarioActionPerformed
        usuarios volver = new usuarios();
        volver.setVisible(true);
        dispose();
        volver.setLocationRelativeTo(null);
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_img_usuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        bitacora volver = new bitacora();
        volver.setVisible(true);
        dispose();
        volver.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new menu().setVisible(true);
                login log = new login();
                log.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton img_accidente;
    private javax.swing.JButton img_bodega;
    private javax.swing.JButton img_camion;
    private javax.swing.JButton img_cerrar;
    private javax.swing.JButton img_cliente;
    private javax.swing.JButton img_comprobante;
    private javax.swing.JButton img_consulta;
    private javax.swing.JButton img_empleados;
    private javax.swing.JButton img_entrega;
    private javax.swing.JButton img_mantenimiento;
    private javax.swing.JButton img_orden;
    private javax.swing.JButton img_paquete;
    private javax.swing.JButton img_quejas;
    private javax.swing.JButton img_usuario;
    private javax.swing.JButton img_zonas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_accidente;
    private javax.swing.JLabel lbl_bodega;
    private javax.swing.JLabel lbl_cliente;
    private javax.swing.JLabel lbl_comprobante;
    private javax.swing.JLabel lbl_consultas;
    private javax.swing.JLabel lbl_empleados;
    private javax.swing.JLabel lbl_entrega;
    private javax.swing.JLabel lbl_menu;
    private javax.swing.JLabel lbl_orden;
    private javax.swing.JLabel lbl_orden1;
    private javax.swing.JLabel lbl_paquete;
    private javax.swing.JLabel lbl_quejas;
    private javax.swing.JLabel lbl_reportes;
    private javax.swing.JLabel lbl_vehiculo;
    private javax.swing.JLabel lbl_zonas;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/fondo1.png")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);
        }
    }
}

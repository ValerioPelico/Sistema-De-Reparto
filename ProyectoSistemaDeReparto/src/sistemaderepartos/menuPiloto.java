/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaderepartos;
import java.awt.Dimension;
import sistemaderepartos.consultaAppPiloto;
import sistemaderepartos.login;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author dairy
 */
public class menuPiloto extends javax.swing.JFrame {

    /**
     * Creates new form menuPiloto
     */
    
    FondoPanel fondoso = new FondoPanel();
    
    public menuPiloto() {
        this.setContentPane(fondoso);
        initComponents();
        
        this.setSize(new Dimension(350, 350));
        
        ImageIcon imagen2 = new ImageIcon("src/imagenes/consulta.png");
        Icon icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(img_consulta.getWidth(), img_consulta.getHeight(), Image.SCALE_DEFAULT));
        img_consulta.setIcon(icono2);
        this.repaint();
        
        ImageIcon imagen = new ImageIcon("src/imagenes/cerrar.png");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(img_cerrar.getWidth(), img_cerrar.getHeight(), Image.SCALE_DEFAULT));
        img_cerrar.setIcon(icono);
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

        lbl_menu = new javax.swing.JLabel();
        img_consulta = new javax.swing.JButton();
        lbl_consultas = new javax.swing.JLabel();
        img_cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(624, 435));

        lbl_menu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_menu.setForeground(new java.awt.Color(255, 255, 255));
        lbl_menu.setText("MENU PILOTO");

        img_consulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consulta.png"))); // NOI18N
        img_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img_consultaActionPerformed(evt);
            }
        });

        lbl_consultas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_consultas.setForeground(new java.awt.Color(255, 255, 255));
        lbl_consultas.setText("CONSULTAS");

        img_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        img_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img_cerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_consultas)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(img_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(90, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lbl_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(img_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbl_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lbl_consultas)
                .addGap(18, 18, 18)
                .addComponent(img_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(img_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void img_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img_consultaActionPerformed
        consultaAppPiloto volver = new consultaAppPiloto();
        volver.setVisible(true);
        dispose();
        volver.setLocationRelativeTo(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_img_consultaActionPerformed

    private void img_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img_cerrarActionPerformed
        login volver = new login();
        volver.setVisible(true);
        dispose();
        volver.setLocationRelativeTo(null);
    // TODO add your handling code here:
    }//GEN-LAST:event_img_cerrarActionPerformed

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
            java.util.logging.Logger.getLogger(menuPiloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPiloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPiloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPiloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPiloto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton img_cerrar;
    private javax.swing.JButton img_consulta;
    private javax.swing.JLabel lbl_consultas;
    private javax.swing.JLabel lbl_menu;
    // End of variables declaration//GEN-END:variables

class FondoPanel extends JPanel
    {
            private Image imagen;
            
            @Override           
            public void paint(Graphics g)
            {
                imagen = new ImageIcon(getClass().getResource("/imagenes/fondo1.png")).getImage();
                
                g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
                
                setOpaque(false);
                
                super.paint(g);
            }
    }
    
}

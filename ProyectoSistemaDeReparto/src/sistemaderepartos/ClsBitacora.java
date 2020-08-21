/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaderepartos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josej
 */
public class ClsBitacora {

    static String SystemUser; // usuario del sistema

    Conexion cn = new Conexion();
    Connection con = cn.getConnection();
    PreparedStatement ps;

    // Graba en bitacora
    public void GrabaBitacora(String user, String descripcion) {

        //variable para el query
        String query;

        //variable para la fecha
        Date dateHoy = new Date();

        //variable para dar formato
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-mm-dd");

        String fecha = formato.format(dateHoy);

        java.util.Date fecha1 = null; // crea objetos tipo util.Date y sql.Date
        java.sql.Date fecha2 = null;
        try {
            fecha1 = formato.parse(fecha); // convierte el string en util.Date
        } catch (ParseException ex) {
            Logger.getLogger(mantenimientoVehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        fecha2 = new java.sql.Date(fecha1.getTime()); // convierte el util.Date en sql.Date

        //query para insertar
        try {
            ps = con.prepareStatement("INSERT INTO tbl_bitacora (cNombre_De_Usuario, dFecha, cTabla_Afectada) VALUES (?,?,?)");

            ps.setString(1, user);
            ps.setDate(2, fecha2);
            ps.setString(3, descripcion);

            System.out.println(user);
            System.out.println(fecha2);
            System.out.println(descripcion);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al grabar en bitacora");
        }

    }

}

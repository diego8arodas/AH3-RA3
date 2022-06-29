/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ClientesDAO {

    int r;
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion acceso = new Conexion();
    Usuarios pro = new Usuarios();

    public List listarUsuario() {
        String sql = "select * from usuarios";
        List<Usuarios> listaprod = new ArrayList<>();

        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Usuarios p = new Usuarios();
                p.setUsuarios_id(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setApellido(rs.getString(3));
                p.setTelefono(rs.getInt(4));
                p.setDireccion(rs.getString(5));
                p.setCorreo(rs.getString(6));
                p.setFecha_nacimiento(rs.getString(7));
                p.setRol_id(rs.getInt(8));
                p.setActivo(rs.getInt(9));
                p.setContrasena(rs.getString(10));
                listaprod.add(p);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return listaprod;
    }

    public int modificar(String nombre, String apellido, int telefono, String direccion, String correo_electronico, String fecha_nacimiento, int rol_id, int activo, String contraseña, int usuario_id) throws SQLException {
        String sql = "update usuarios set nombre=?, apellido=?, telefono=?, direccion=?, correo_electronico=?, fecha_nacimiento=?, rol_id=?, activo=?, contraseña=? where usuario_id=?";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setInt(3, telefono);
            ps.setString(4, direccion);
            ps.setString(5, correo_electronico);
            ps.setString(6, fecha_nacimiento);
            ps.setInt(7, rol_id);
            ps.setInt(8, activo);
            ps.setString(9, contraseña);
            ps.setInt(10, usuario_id);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;
    }

    public int agregar(int usuario_id, String nombre, String apellido, int telefono, String direccion, String correo_electronico, String fecha_nacimiento, int rol_id, int activo, String contraseña) {
        String sql = "insert into usuarios(nombre,apellido,telefono,direccion,correo_electronico,fecha_nacimiento,rol_id,activo,contraseña,usuario_id)values(?,?,?,?,?,?,?,?,?,?)";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setInt(3, telefono);
            ps.setString(4, direccion);
            ps.setString(5, correo_electronico);
            ps.setString(6, fecha_nacimiento);
            ps.setInt(7, rol_id);
            ps.setInt(8, activo);
            ps.setString(9, contraseña);
            ps.setInt(10, usuario_id);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;
    }

    private void delete(int id) {
        String sql = "delete from usuarios where usuario_id=?";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }
    
    public static void main(String[] args) {
        ClientesDAO rp = new ClientesDAO();
        List<Usuarios> lista = rp.listarUsuario();
        rp.delete(1);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getApellido());
            
        }
    }
    

}

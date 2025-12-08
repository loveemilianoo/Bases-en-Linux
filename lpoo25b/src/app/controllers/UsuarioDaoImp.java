package app.controllers;

import app.utils.Conexion;
import java.sql.*;
import app.models.*;

public class UsuarioDaoImp implements UsuarioDao {

    @Override
    public Usuario validarUsuario(String login, String password) {
        Usuario usuario = null;
        PreparedStatement ps= null;
        Connection conn = Conexion.getConexion();
        ResultSet rs = null;
        
        try{
            String query = "SELECT rfc , curp, nombre, edad, sexo, correo, login, password "
                    + "FROM personas p, usuarios u WHERE  login=? "
                    + "AND password=? AND p.id = u.persona_id;";
            ps = conn.prepareStatement(query);
            ps.setString(1, login);
            ps.setString(2, password);
            rs = ps.executeQuery();
            
            while (rs.next()){
                usuario = new Usuario (
                        rs.getString("rfc"), 
                        rs.getString("curp"), 
                        rs.getString("nombre"), 
                        rs.getInt("edad"), 
                        rs.getString(("sexo")).charAt(0), 
                        rs.getString("correo"), 
                        rs.getString("login"), 
                        rs.getString("password"));
            }
        } catch (SQLException e){
            e.printStackTrace();
            System.out.println("Error en la base de datos: "+e.toString());
            
        } finally {
            try {
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (SQLException e){
                e.printStackTrace();
                System.out.println("Error al cerrar recursos: "+e.toString());
            }
        }
        return usuario;
    }
    
    
}

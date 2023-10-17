
package DAO;

import Clases.Login;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import oracle.jdbc.OracleTypes;
import java.sql.ResultSet;

public class LoginDAO {
    private Connection conexion;

    public LoginDAO() {
    }
    
    public Login listarlogin(String correoelectronicoingreso, String contrasenaingreso) throws SQLException {
        Login login = new Login();
    try {
        //Abrir la conexion
        this.conexion = new Conexion.Conexion().obtenerConexion();
        //Crear la llamada al procedimiento Listar
        String llamada = "{call PKG_LOGINS.sp_login(?,?,?)}";
        //Crear callablestatement
        CallableStatement cstmt = this.conexion.prepareCall(llamada);
        //Pasamos el nombre de usuario como parámetro
        cstmt.setString(2, correoelectronicoingreso);
        cstmt.setString(3, contrasenaingreso);
        //Pasamos el cursor del procedimiento
        cstmt.registerOutParameter(1, OracleTypes.CURSOR);
        cstmt.execute(); //Se ejecuta el procedimiento
        //Se usa el ResultSet para obtener la información del cursor (se castea)
        ResultSet rs = (ResultSet) cstmt.getObject(1);
        //Recorrer el rs y sacar los Consultores
        while (rs.next()){              
                login.setNombre(rs.getString("nombre"));
            }
        } catch (Exception e) {
            System.out.println("Error al listar"+e.getMessage());
        } finally{
            this.conexion.close();
        }
        return login;   
    }
    
}

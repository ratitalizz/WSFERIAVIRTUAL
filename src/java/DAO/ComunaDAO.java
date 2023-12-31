
package DAO;

import Clases.Comuna;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import oracle.jdbc.OracleTypes;
import java.sql.ResultSet;

public class ComunaDAO {
    private Connection conexion;

    public ComunaDAO() {
    }
    
    //LISTAR COMUNAS POR ID REGION
    public List<Comuna> listarComuna(String idregion) throws SQLException{
        List<Comuna> lista = new ArrayList<>();
        try {
            //Abrir la conexion
            this.conexion = new Conexion.Conexion().obtenerConexion();
            //Crear la llamada al procedimiento Listar
            String llamada = "{call sp_listarComuna(?,?)}";
            //Crear callablestatement
            CallableStatement cstmt = this.conexion.prepareCall(llamada);
            cstmt.setString(2, idregion);
            //Pasamos el cursor del procedimiento
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.execute(); //Se ejecuta el procedimiento
            //Se usa el ResultSet para obtener la información del cursor (se castea)
            ResultSet rs = (ResultSet) cstmt.getObject(1);
            //Recorrer el rs y sacar los Admin
            while (rs.next()){
                Comuna comuna = new Comuna();
                comuna.setIdcomuna(rs.getString("idcomuna"));
                comuna.setNombrecomuna(rs.getString("nombrecomuna"));
                //Pasamos el objeto a la lista
                lista.add(comuna); 
            }
             } catch (Exception e) {
            System.out.println("Error al listar "+e.getMessage());
        } finally{
            this.conexion.close();
        }
        return lista;
        }
}

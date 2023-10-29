
package DAO;

import Clases.Modelo;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import oracle.jdbc.OracleTypes;
import java.sql.ResultSet;

public class ModeloDAO {
    private Connection conexion;

    public ModeloDAO() {
    }
    
    //LISTAR PRODUCTOS POR ID Y NOMBRE DEL PRODUCTOS
    public List<Modelo> listarModelos(String idmarca) throws SQLException{
        List<Modelo> lista = new ArrayList<>();
        try {
            //Abrir la conexion
            this.conexion = new Conexion.Conexion().obtenerConexion();
            //Crear la llamada al procedimiento Listar
            String llamada = "{call sp_listarModelo(?,?)}";
            //Crear callablestatement
            CallableStatement cstmt = this.conexion.prepareCall(llamada);
            cstmt.setString(2, idmarca);
            //Pasamos el cursor del procedimiento
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.execute(); //Se ejecuta el procedimiento
            //Se usa el ResultSet para obtener la información del cursor (se castea)
            ResultSet rs = (ResultSet) cstmt.getObject(1);
            //Recorrer el rs y sacar los Admin
            while (rs.next()){
                Modelo modelo = new Modelo();
                modelo.setIdmodelo(rs.getString("idmodelo"));
                modelo.setDescmodelo(rs.getString("descmodelo"));
                //Pasamos el objeto a la lista
                lista.add(modelo); 
            }
             } catch (Exception e) {
            System.out.println("Error al listar "+e.getMessage());
        } finally{
            this.conexion.close();
        }
        return lista;
        }
}

package DAO;

import Clases.Marca;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import oracle.jdbc.OracleTypes;
import java.sql.ResultSet;

public class MarcaDAO {
    private Connection conexion;

    public MarcaDAO() {
    }
    //LISTAR MARCAS
    public List<Marca> listarMarcas() throws SQLException {
        List<Marca> lista = new ArrayList<>();
        try {
            //Abrir la conexion
            this.conexion = new Conexion.Conexion().obtenerConexion();
            //Crear la llamada al procedimiento Listar
            String llamada = "{call sp_listarmarca(?)}";
            //Crear callablestatement
            CallableStatement cstmt = this.conexion.prepareCall(llamada);
            //Pasamos el cursor del procedimiento
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.execute(); //Se ejecuta el procedimiento
            //Se usa el ResultSet para obtener la información del cursor (se castea)
            ResultSet rs = (ResultSet) cstmt.getObject(1);
            while (rs.next()) {
                Marca marca = new Marca();
                marca.setIdmarca(rs.getString("idmarca"));
                marca.setDescmarca(rs.getString("descmarca"));         
                lista.add(marca);
            }
            // Cerrar la conexión y liberar los recursos
        } catch (Exception e) {
            System.out.println("Error al listar "+e.getMessage());
        } finally{
            this.conexion.close();
        }
        return lista;
    }
    
}

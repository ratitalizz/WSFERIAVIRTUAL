
package DAO;

import Clases.Pais;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import oracle.jdbc.OracleTypes;
import java.sql.ResultSet;

public class PaisDAO {
    private Connection conexion;

    public PaisDAO() {
    }
    
    public List<Pais> listarPais() throws SQLException{
        List<Pais> lista = new ArrayList<>();
        try {
            //Abrir la conexion
            this.conexion = new Conexion.Conexion().obtenerConexion();
            //Crear la llamada al procedimiento Listar
            String llamada = "{call sp_listarpais(?)}";
            //Crear callablestatement
            CallableStatement cstmt = this.conexion.prepareCall(llamada);
            //Pasamos el cursor del procedimiento
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.execute(); //Se ejecuta el procedimiento
            //Se usa el ResultSet para obtener la información del cursor (se castea)
            ResultSet rs = (ResultSet) cstmt.getObject(1);
            //Recorrer el rs y sacar los Admin
            while (rs.next()){
                Pais pais = new Pais();
                pais.setIdpais(rs.getString("idpais"));
                pais.setNombrepais(rs.getString("nombrepais"));
                //Pasamos el objeto a la lista
                lista.add(pais); 
                }
             } catch (Exception e) {
            System.out.println("Error al listar "+e.getMessage());
        } finally{
            this.conexion.close();
        }
        return lista;
        }
    
    
    
    
}

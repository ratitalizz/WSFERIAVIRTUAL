
package DAO;

import Clases.Region;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import oracle.jdbc.OracleTypes;
import java.sql.ResultSet;

public class RegionDAO {
    private Connection conexion;

    public RegionDAO() {
    }
    
    //Listar transporte x rut del transportista
    public List<Region> listarRegionesPorIDPais(String idpais) throws SQLException{
        List<Region> lista = new ArrayList<>();
        try {
            //Abrir la conexion
            this.conexion = new Conexion.Conexion().obtenerConexion();
            //Crear la llamada al procedimiento Listar
            String llamada = "{call sp_listarRegion(?,?)}";
            //Crear callablestatement
            CallableStatement cstmt = this.conexion.prepareCall(llamada);
            cstmt.setString(2, idpais);
            //Pasamos el cursor del procedimiento
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.execute(); //Se ejecuta el procedimiento
            //Se usa el ResultSet para obtener la información del cursor (se castea)
            ResultSet rs = (ResultSet) cstmt.getObject(1);
            //Recorrer el rs y sacar los Admin
            while (rs.next()){
                Region region = new Region();
                region.setIdregion(rs.getString("idregion"));
                region.setNombreregion(rs.getString("nombreregion"));
                //Pasamos el objeto a la lista
                lista.add(region);     
            }
        } catch (Exception e) {
            System.out.println("Error al listar"+e.getMessage());
        } finally{
            this.conexion.close();
        }
        return lista;     
    }
}

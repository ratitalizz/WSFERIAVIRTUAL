
package DAO;

import Clases.Subasta;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import oracle.jdbc.OracleTypes;
import java.sql.ResultSet;

public class SubastaDAO {
    private Connection conexion;

    public SubastaDAO() {
    }
    //LISTAR TODAS LAS SUBASTAS EXISTENTES
    public List<Subasta> listarSubastas() throws SQLException {
        List<Subasta> lista = new ArrayList<>();
        try {
            //Abrir la conexion
            this.conexion = new Conexion.Conexion().obtenerConexion();
            //Crear la llamada al procedimiento Listar
            String llamada = "{call sp_listasubastas(?)}";
            //Crear callablestatement
            CallableStatement cstmt = this.conexion.prepareCall(llamada);
            //Pasamos el cursor del procedimiento
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.execute(); //Se ejecuta el procedimiento
            //Se usa el ResultSet para obtener la información del cursor (se castea)
            ResultSet rs = (ResultSet) cstmt.getObject(1);
            while (rs.next()) {
                Subasta subasta = new Subasta();
                subasta.setIdSubasta(rs.getString("ID_SUBASTA"));
                subasta.setIdPedido(rs.getString("PEDIDO_IDPEDIDO"));
                subasta.setNombreCliente(rs.getString("NOMBRE_CLIENTE"));
                subasta.setNombreClienteEmp(rs.getString("NOMBRE_EMP"));
                subasta.setCantidadTotal(rs.getInt("CANTIDAD_TOTAL"));
                subasta.setTotalTransporte(rs.getInt("TOTALTRANSPORTE"));
                subasta.setFechaSubasta(rs.getString("FECHASUBASTA"));
                subasta.setHorarioTermino(rs.getString("HORARIO_TERMINO"));
                subasta.setDireccionOrigen(rs.getString("DIRECCION_ORIGEN"));
                subasta.setComunaOrigen(rs.getString("COMUNA_ORIGEN"));
                subasta.setDireccionDestino(rs.getString("DIRECCION_DESTINO"));
                subasta.setComunaDestino(rs.getString("COMUNA_DESTINO"));
                lista.add(subasta);
            }

            // Cerrar la conexión y liberar los recursos
            // ...
        } catch (Exception e) {
            System.out.println("Error al listar"+e.getMessage());
        } finally{
            this.conexion.close();
        }
        return lista;
    }
    
    
}

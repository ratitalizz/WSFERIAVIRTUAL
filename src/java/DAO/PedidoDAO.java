
package DAO;

import Clases.Pedido;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import oracle.jdbc.OracleTypes;
import java.sql.ResultSet;

public class PedidoDAO {
    private Connection conexion;  

    public PedidoDAO() {
    }
    
     //CREAR NUEVO PEDIDO
        public String crearNuevoPedido(Pedido pedido) throws SQLException{
        String idPedido = null;
        try{
            this.conexion = new Conexion.Conexion().obtenerConexion();
            String llamada = "{ call sp_crearpedido(?,?)}";
            CallableStatement cstmt = this.conexion.prepareCall(llamada);
            cstmt.setString(1,pedido.getCliente_id_cliente());
            cstmt.registerOutParameter(2, OracleTypes.VARCHAR);
            cstmt.executeUpdate();
            idPedido = cstmt.getString(2);
        } catch (Exception e){
            System.out.println("Error al crear pedido"+e.getMessage());
        } finally{
            this.conexion.close();
        }
        return idPedido;
    }
    
    
}

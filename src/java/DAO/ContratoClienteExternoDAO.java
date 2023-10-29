
package DAO;

import Clases.ContratoClienteExterno;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import oracle.jdbc.OracleTypes;
import java.sql.ResultSet;

public class ContratoClienteExternoDAO {
    private Connection conexion;

    public ContratoClienteExternoDAO() {
    }
    
    //LISTAR CONTRATOS DE CLIENTES EXTERNOS 
    public List<ContratoClienteExterno> listarContratosCliEx() throws SQLException {
        List<ContratoClienteExterno> lista = new ArrayList<>();
        try {
            //Abrir la conexion
            this.conexion = new Conexion.Conexion().obtenerConexion();
            //Crear la llamada al procedimiento Listar
            String llamada = "{call sp_listarcontratoCliex(?)}";
            //Crear callablestatement
            CallableStatement cstmt = this.conexion.prepareCall(llamada);
            //Pasamos el cursor del procedimiento
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.execute(); //Se ejecuta el procedimiento
            //Se usa el ResultSet para obtener la información del cursor (se castea)
            ResultSet rs = (ResultSet) cstmt.getObject(1);
            while (rs.next()) {
                ContratoClienteExterno contrato = new ContratoClienteExterno();
                contrato.setIdcontrato(rs.getString("idcontrato"));
                contrato.setFechainiciocontrato(rs.getString("fechainiciocontrato")); 
                contrato.setFechaterminocontrato("fechaterminocontrato");
                contrato.setCliente_id_cliente("cliente_id_cliente");
                lista.add(contrato);
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

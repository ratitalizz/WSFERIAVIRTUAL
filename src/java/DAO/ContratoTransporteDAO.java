package DAO;

import Clases.ContratoTransporte;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import oracle.jdbc.OracleTypes;
import java.sql.ResultSet;

public class ContratoTransporteDAO {
    private Connection conexion;

    public ContratoTransporteDAO() {
    }
    
    //LISTAR CONTRATOS DE TRANSPORTES
    public List<ContratoTransporte> listarContratosTransporte() throws SQLException {
        List<ContratoTransporte> lista = new ArrayList<>();
        try {
            //Abrir la conexion
            this.conexion = new Conexion.Conexion().obtenerConexion();
            //Crear la llamada al procedimiento Listar
            String llamada = "{call sp_listarcontratoTransporte(?)}";
            //Crear callablestatement
            CallableStatement cstmt = this.conexion.prepareCall(llamada);
            //Pasamos el cursor del procedimiento
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.execute(); //Se ejecuta el procedimiento
            //Se usa el ResultSet para obtener la información del cursor (se castea)
            ResultSet rs = (ResultSet) cstmt.getObject(1);
            while (rs.next()) {
                ContratoTransporte contrato = new ContratoTransporte();
                contrato.setId_contrato(rs.getString("id_contrato"));
                contrato.setFechacontrato(rs.getString("fechacontrato")); 
                contrato.setIdordent("idordent");
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

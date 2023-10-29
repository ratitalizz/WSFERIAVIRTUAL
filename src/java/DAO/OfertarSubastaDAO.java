
package DAO;

import Clases.OfertarSubasta;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import oracle.jdbc.OracleTypes;
import java.sql.ResultSet;

public class OfertarSubastaDAO {
    
    private Connection conexion;

    public OfertarSubastaDAO() {
    }
    
    //Crear nueva subasta
    public boolean crearNuevaOfertaEnSubasta(OfertarSubasta ofesubasta) throws SQLException{
        boolean centinela = false;
        try{
            //Abrir la conexion. La variable conexion va a ser igual a la nueva conexion. 
            //El primer conexion despues del new va al package y el segundo a la clase conexion
            this.conexion = new Conexion.Conexion().obtenerConexion();
            //Crear la llamada al procedimiento Agregar o Crear
            String llamada = "{ call sp_ofertarsubasta(?,?,?,?)}";
            //Crear el callablestatement para poder ejecutar el procedimiento
            CallableStatement cstmt = this.conexion.prepareCall(llamada);
            //Pasar los datos del productor al procedimiento
            cstmt.setInt(1,ofesubasta.getMontosubasta()); 
            cstmt.setString(2,ofesubasta.getSubasta_id_subasta());
            cstmt.setInt(3,ofesubasta.getTransportista_rut());
            cstmt.setString(4,ofesubasta.getPedido_idpedido());
            if (cstmt.executeUpdate()>0){
                centinela = true;
            }         
        } catch (Exception e){
            System.out.println("Error al crear oferta en subasta"+e.getMessage());
        } finally{
            this.conexion.close();            
        }    
        return centinela;
        }
    
        
    }
    



package Clases;


public class Modelo {
    private String idmodelo;
    private String descmodelo;
    private String marca_idmarca;

    public Modelo() {
    }

    public Modelo(String idmodelo, String descmodelo, String marca_idmarca) {
        this.idmodelo = idmodelo;
        this.descmodelo = descmodelo;
        this.marca_idmarca = marca_idmarca;
    }

    public String getIdmodelo() {
        return idmodelo;
    }

    public void setIdmodelo(String idmodelo) {
        this.idmodelo = idmodelo;
    }

    public String getDescmodelo() {
        return descmodelo;
    }

    public void setDescmodelo(String descmodelo) {
        this.descmodelo = descmodelo;
    }

    public String getMarca_idmarca() {
        return marca_idmarca;
    }

    public void setMarca_idmarca(String marca_idmarca) {
        this.marca_idmarca = marca_idmarca;
    }

    @Override
    public String toString() {
        return "Modelo{" + "idmodelo=" + idmodelo + ", descmodelo=" + descmodelo + ", marca_idmarca=" + marca_idmarca + '}';
    }
    
    
    
    
}

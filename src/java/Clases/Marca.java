
package Clases;


public class Marca {
    private String idmarca;
    private String descmarca;

    public Marca() {
    }

    public Marca(String idmarca, String descmarca) {
        this.idmarca = idmarca;
        this.descmarca = descmarca;
    }

    public String getIdmarca() {
        return idmarca;
    }

    public void setIdmarca(String idmarca) {
        this.idmarca = idmarca;
    }

    public String getDescmarca() {
        return descmarca;
    }

    public void setDescmarca(String descmarca) {
        this.descmarca = descmarca;
    }

    @Override
    public String toString() {
        return "Marca{" + "idmarca=" + idmarca + ", descmarca=" + descmarca + '}';
    }
    
    
}


package Clases;


public class Pais {
    private String idpais;
    private String nombrepais;

    public Pais() {
    }

    public Pais(String idpais, String nombrepais) {
        this.idpais = idpais;
        this.nombrepais = nombrepais;
    }

    public String getIdpais() {
        return idpais;
    }

    public void setIdpais(String idpais) {
        this.idpais = idpais;
    }

    public String getNombrepais() {
        return nombrepais;
    }

    public void setNombrepais(String nombrepais) {
        this.nombrepais = nombrepais;
    }

    @Override
    public String toString() {
        return "Pais{" + "idpais=" + idpais + ", nombrepais=" + nombrepais + '}';
    }
    
    
    
}

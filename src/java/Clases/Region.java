
package Clases;

public class Region {
    private String idregion;
    private String nombreregion;
    private String pais_idpais;

    public Region() {
    }

    public Region(String idregion, String nombreregion, String pais_idpais) {
        this.idregion = idregion;
        this.nombreregion = nombreregion;
        this.pais_idpais = pais_idpais;
    }

    public String getIdregion() {
        return idregion;
    }

    public void setIdregion(String idregion) {
        this.idregion = idregion;
    }

    public String getNombreregion() {
        return nombreregion;
    }

    public void setNombreregion(String nombreregion) {
        this.nombreregion = nombreregion;
    }

    public String getPais_idpais() {
        return pais_idpais;
    }

    public void setPais_idpais(String pais_idpais) {
        this.pais_idpais = pais_idpais;
    }

    @Override
    public String toString() {
        return "Region{" + "idregion=" + idregion + ", nombreregion=" + nombreregion + ", pais_idpais=" + pais_idpais + '}';
    }
    
    
    
}

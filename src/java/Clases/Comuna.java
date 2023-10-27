
package Clases;

public class Comuna {
    private String idcomuna;
    private String nombrecomuna;
    private String region_idregion;

    public Comuna() {
    }

    public Comuna(String idcomuna, String nombrecomuna, String region_idregion) {
        this.idcomuna = idcomuna;
        this.nombrecomuna = nombrecomuna;
        this.region_idregion = region_idregion;
    }

    public String getIdcomuna() {
        return idcomuna;
    }

    public void setIdcomuna(String idcomuna) {
        this.idcomuna = idcomuna;
    }

    public String getNombrecomuna() {
        return nombrecomuna;
    }

    public void setNombrecomuna(String nombrecomuna) {
        this.nombrecomuna = nombrecomuna;
    }

    public String getRegion_idregion() {
        return region_idregion;
    }

    public void setRegion_idregion(String region_idregion) {
        this.region_idregion = region_idregion;
    }

    @Override
    public String toString() {
        return "Comuna{" + "idcomuna=" + idcomuna + ", nombrecomuna=" + nombrecomuna + ", region_idregion=" + region_idregion + '}';
    }
    

    
}

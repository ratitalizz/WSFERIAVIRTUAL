
package Clases;


public class Subasta {
    
    private String idSubasta;
    private String idPedido;
    private int cantidadTotal;
    private int totalTransporte;
    private String fechaSubasta;
    private String horarioTermino;
    private String direccionOrigen;
    private String direccionDestino;

    public Subasta() {
    }

    public Subasta(String idSubasta, String idPedido, int cantidadTotal, int totalTransporte, String fechaSubasta, String horarioTermino, String direccionOrigen, String direccionDestino) {
        this.idSubasta = idSubasta;
        this.idPedido = idPedido;
        this.cantidadTotal = cantidadTotal;
        this.totalTransporte = totalTransporte;
        this.fechaSubasta = fechaSubasta;
        this.horarioTermino = horarioTermino;
        this.direccionOrigen = direccionOrigen;
        this.direccionDestino = direccionDestino;
    }

    public String getIdSubasta() {
        return idSubasta;
    }

    public void setIdSubasta(String idSubasta) {
        this.idSubasta = idSubasta;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public int getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(int cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public int getTotalTransporte() {
        return totalTransporte;
    }

    public void setTotalTransporte(int totalTransporte) {
        this.totalTransporte = totalTransporte;
    }

    public String getFechaSubasta() {
        return fechaSubasta;
    }

    public void setFechaSubasta(String fechaSubasta) {
        this.fechaSubasta = fechaSubasta;
    }

    public String getHorarioTermino() {
        return horarioTermino;
    }

    public void setHorarioTermino(String horarioTermino) {
        this.horarioTermino = horarioTermino;
    }

    public String getDireccionOrigen() {
        return direccionOrigen;
    }

    public void setDireccionOrigen(String direccionOrigen) {
        this.direccionOrigen = direccionOrigen;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public void setDireccionDestino(String direccionDestino) {
        this.direccionDestino = direccionDestino;
    }

    @Override
    public String toString() {
        return "Subasta{" + "idSubasta=" + idSubasta + ", idPedido=" + idPedido + ", cantidadTotal=" + cantidadTotal + ", totalTransporte=" + totalTransporte + ", fechaSubasta=" + fechaSubasta + ", horarioTermino=" + horarioTermino + ", direccionOrigen=" + direccionOrigen + ", direccionDestino=" + direccionDestino + '}';
    }
    
   
          
}

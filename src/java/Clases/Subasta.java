
package Clases;


public class Subasta {
    
    private String idSubasta;
    private String idPedido;
    private int cantidadTotal;
    private int totalTransporte;
    private String fechaSubasta;
    private String horarioTermino;
    private String direccionOrigen;
    private String comunaOrigen;
    private String direccionDestino;
    private String comunaDestino;
    private String nombreCliente;
    private String nombreClienteEmp;

    public Subasta() {
    }

    public Subasta(String idSubasta, String idPedido, int cantidadTotal, int totalTransporte, String fechaSubasta, String horarioTermino, String direccionOrigen, String comunaOrigen, String direccionDestino, String comunaDestino, String nombreCliente, String nombreClienteEmp) {
        this.idSubasta = idSubasta;
        this.idPedido = idPedido;
        this.cantidadTotal = cantidadTotal;
        this.totalTransporte = totalTransporte;
        this.fechaSubasta = fechaSubasta;
        this.horarioTermino = horarioTermino;
        this.direccionOrigen = direccionOrigen;
        this.comunaOrigen = comunaOrigen;
        this.direccionDestino = direccionDestino;
        this.comunaDestino = comunaDestino;
        this.nombreCliente = nombreCliente;
        this.nombreClienteEmp = nombreClienteEmp;
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

    public String getComunaOrigen() {
        return comunaOrigen;
    }

    public void setComunaOrigen(String comunaOrigen) {
        this.comunaOrigen = comunaOrigen;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public void setDireccionDestino(String direccionDestino) {
        this.direccionDestino = direccionDestino;
    }

    public String getComunaDestino() {
        return comunaDestino;
    }

    public void setComunaDestino(String comunaDestino) {
        this.comunaDestino = comunaDestino;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreClienteEmp() {
        return nombreClienteEmp;
    }

    public void setNombreClienteEmp(String nombreClienteEmp) {
        this.nombreClienteEmp = nombreClienteEmp;
    }

    @Override
    public String toString() {
        return "Subasta{" + "idSubasta=" + idSubasta + ", idPedido=" + idPedido + ", cantidadTotal=" + cantidadTotal + ", totalTransporte=" + totalTransporte + ", fechaSubasta=" + fechaSubasta + ", horarioTermino=" + horarioTermino + ", direccionOrigen=" + direccionOrigen + ", comunaOrigen=" + comunaOrigen + ", direccionDestino=" + direccionDestino + ", comunaDestino=" + comunaDestino + ", nombreCliente=" + nombreCliente + ", nombreClienteEmp=" + nombreClienteEmp + '}';
    }

   
          
}

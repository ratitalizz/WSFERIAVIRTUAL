
package Clases;


public class Subasta {
    
    private String id_subasta; 
    private String fechasubasta;
    private String horainiciosubasta;
    private String horaterminosubasta;
    private String estadodelasubasta;
    private String pedido_idpedido;

    public Subasta() {
    }
    
    public Subasta(String id_subasta, String fechasubasta, String horainiciosubasta, String horaterminosubasta, String estadodelasubasta, String pedido_idpedido) {
        this.id_subasta = id_subasta;
        this.fechasubasta = fechasubasta;
        this.horainiciosubasta = horainiciosubasta;
        this.horaterminosubasta = horaterminosubasta;
        this.estadodelasubasta = estadodelasubasta;
        this.pedido_idpedido = pedido_idpedido;
    }

    public String getId_subasta() {
        return id_subasta;
    }

    public void setId_subasta(String id_subasta) {
        this.id_subasta = id_subasta;
    }

    public String getFechasubasta() {
        return fechasubasta;
    }

    public void setFechasubasta(String fechasubasta) {
        this.fechasubasta = fechasubasta;
    }

    public String getHorainiciosubasta() {
        return horainiciosubasta;
    }

    public void setHorainiciosubasta(String horainiciosubasta) {
        this.horainiciosubasta = horainiciosubasta;
    }

    public String getHoraterminosubasta() {
        return horaterminosubasta;
    }

    public void setHoraterminosubasta(String horaterminosubasta) {
        this.horaterminosubasta = horaterminosubasta;
    }

    public String getEstadodelasubasta() {
        return estadodelasubasta;
    }

    public void setEstadodelasubasta(String estadodelasubasta) {
        this.estadodelasubasta = estadodelasubasta;
    }

    public String getPedido_idpedido() {
        return pedido_idpedido;
    }

    public void setPedido_idpedido(String pedido_idpedido) {
        this.pedido_idpedido = pedido_idpedido;
    }

    @Override
    public String toString() {
        return "Subasta{" + "id_subasta=" + id_subasta + ", fechasubasta=" + fechasubasta + ", horainiciosubasta=" + horainiciosubasta + ", horaterminosubasta=" + horaterminosubasta + ", estadodelasubasta=" + estadodelasubasta + ", pedido_idpedido=" + pedido_idpedido + '}';
    }
    
    
    
}

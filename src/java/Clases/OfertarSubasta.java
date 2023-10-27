
package Clases;


public class OfertarSubasta {
    private int montosubasta;
    private String subasta_id_subasta;
    private int transportista_rut;
    private String pedido_idpedido;

    public OfertarSubasta() {
    }

    public OfertarSubasta(int montosubasta, String subasta_id_subasta, int transportista_rut, String pedido_idpedido) {
        this.montosubasta = montosubasta;
        this.subasta_id_subasta = subasta_id_subasta;
        this.transportista_rut = transportista_rut;
        this.pedido_idpedido = pedido_idpedido;
    }

    public int getMontosubasta() {
        return montosubasta;
    }

    public void setMontosubasta(int montosubasta) {
        this.montosubasta = montosubasta;
    }

    public String getSubasta_id_subasta() {
        return subasta_id_subasta;
    }

    public void setSubasta_id_subasta(String subasta_id_subasta) {
        this.subasta_id_subasta = subasta_id_subasta;
    }

    public int getTransportista_rut() {
        return transportista_rut;
    }

    public void setTransportista_rut(int transportista_rut) {
        this.transportista_rut = transportista_rut;
    }

    public String getPedido_idpedido() {
        return pedido_idpedido;
    }

    public void setPedido_idpedido(String pedido_idpedido) {
        this.pedido_idpedido = pedido_idpedido;
    }

    @Override
    public String toString() {
        return "OfertarSubasta{" + "montosubasta=" + montosubasta + ", subasta_id_subasta=" + subasta_id_subasta + ", transportista_rut=" + transportista_rut + ", pedido_idpedido=" + pedido_idpedido + '}';
    }

    
    
}

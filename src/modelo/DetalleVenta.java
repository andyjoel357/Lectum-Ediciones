package modelo;

public class DetalleVenta {
    private int id_detalleVenta;
    private int id_detalleCabecera;
    private int id_libro;
    
    private String titulo;
    private int cantidad;
    private double precioU;
    private double subtotal;
    private double descuento;
    private double total;
    
    public DetalleVenta(){
    this.id_detalleVenta= 0;
    this.id_detalleCabecera=0;
    this.id_libro = 0;
    this.titulo="";
    this.cantidad=0;
    this.precioU=0.0;
    this.subtotal=0.0;
    this.descuento=0.0;
    this.total=0.0;
       
    }

    public DetalleVenta(int id_detalleVenta, int id_detalleCabecera,int id_libro, String titulo, int cantidad, double precioU, double subtotal, double descuento, double total) {
        this.id_detalleVenta = id_detalleVenta;
        this.id_detalleCabecera=id_detalleCabecera;
        this.id_libro = id_libro;
        this.titulo = titulo;
        this.cantidad = cantidad;
        this.precioU = precioU;
        this.subtotal = subtotal;
        this.descuento = descuento;
        this.total = total;
    }

    public int getId_detalleCabecera() {
        return id_detalleCabecera;
    }

    public void setId_detalleCabecera(int id_detalleCabecera) {
        this.id_detalleCabecera = id_detalleCabecera;
    }

    
    public int getId_detalleVenta() {
        return id_detalleVenta;
    }

    public void setId_detalleVenta(int id_detalleVenta) {
        this.id_detalleVenta = id_detalleVenta;
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioU() {
        return precioU;
    }

    public void setPrecioU(double precioU) {
        this.precioU = precioU;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double  getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "DetalleVenta{" + "id_detalleVenta=" + id_detalleVenta + ", id_libro=" + id_libro + ", titulo=" + titulo + ", cantidad=" + cantidad + ", precioU=" + precioU + ", subtotal=" + subtotal + ", descuento=" + descuento + ", total=" + total + '}';
    }
    
    
    
}

package modelo;

import java.sql.Date;


public class Notas_Entrega {
    private int id_notaEntrega;
    private int id_libros;
    private String nombre_cliente;
    private Date fecha;
    private String direccion;
    private String telefono;
    private String ruc;
    private String detalle;
    private int cantidad;
    private double precio_unitario;
    private double valor;
    private double descuento;
    private double valor_total;
    
    public Notas_Entrega() {
        this.id_notaEntrega = 0;
        this.id_libros= 0;
        this.nombre_cliente= "";
        this.fecha = null;
        this.direccion= "";
        this.telefono= "";
        this.ruc= "";
        this.detalle= "";
        this.cantidad=0;
        this.precio_unitario=0;
        this.valor=0;
        this.descuento=0;
        this.valor_total=0;
    }

    public Notas_Entrega(int id_notaEntrega, int id_libros, String nombre_cliente, Date fecha, String direccion, String telefono, String ruc, String detalle, int cantidad, double precio_unitario, double valor, double descuento, double valor_total) {
        this.id_notaEntrega = id_notaEntrega;
        this.id_libros = id_libros;
        this.nombre_cliente = nombre_cliente;
        this.fecha = fecha;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ruc = ruc;
        this.detalle = detalle;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
        this.valor = valor;
        this.descuento = descuento;
        this.valor_total = valor_total;
    }

   

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public int getId_notaEntrega() {
        return id_notaEntrega;
    }

    public void setId_notaEntrega(int id_notaEntrega) {
        this.id_notaEntrega = id_notaEntrega;
    }

    public int getId_libros() {
        return id_libros;
    }

    public void setId_libros(int id_libros) {
        this.id_libros = id_libros;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }
    
}

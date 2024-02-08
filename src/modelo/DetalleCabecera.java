package modelo;

public class DetalleCabecera {

    private int id_detalleCabecera;
    private String institucion;
    private String cliente;
    private String fecha;
    private String direccion;
    private String ruc_ci;
    private String telefono;

    public DetalleCabecera() {
        this.id_detalleCabecera = 0;
        this.institucion = "";
        this.cliente = "";
        this.fecha = "";
        this.direccion = "";
        this.ruc_ci = "";
        this.telefono = "";
    }

    public DetalleCabecera(int id_detalleCabecera, String institucion, String cliente, String fecha, String direccion, String ruc_ci, String telefono) {
        this.id_detalleCabecera = id_detalleCabecera;
        this.institucion = institucion;
        this.cliente = cliente;
        this.fecha = fecha;
        this.direccion = direccion;
        this.ruc_ci = ruc_ci;
        this.telefono = telefono;

    }

    public int getId_detalleCabecera() {
        return id_detalleCabecera;
    }

    public void setId_detalleCabecera(int id_detalleCabecera) {
        this.id_detalleCabecera = id_detalleCabecera;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRuc_ci() {
        return ruc_ci;
    }

    public void setRuc_ci(String ruc_ci) {
        this.ruc_ci = ruc_ci;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}

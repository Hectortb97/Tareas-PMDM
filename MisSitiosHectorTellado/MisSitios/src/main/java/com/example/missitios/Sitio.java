package com.example.missitios;

public class Sitio {

    private String nombre;
    private String direccion;
    private GeoPunto posicion;
    private String foto;
    private String telefono;
    private String url;
    private String comentario;
    private long fecha;
    private float valoracion;
    private TipoSitio tipo;

    //Constructor de la clase
    public Sitio(String nombre, String direccion, double longitud,
                 double latitud, TipoSitio tipo, String telefono, String url, String comentario,
                 int valoracion) {

        fecha = System.currentTimeMillis();
        posicion = new GeoPunto(longitud, latitud);
        this.tipo = tipo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.url = url;
        this.comentario = comentario;
        this.valoracion = valoracion;

    }

    public Sitio() {
        fecha = System.currentTimeMillis();
        posicion = new GeoPunto(0, 0);
        tipo=TipoSitio.OTROS;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public GeoPunto getPosicion() {
        return posicion;
    }

    public void setPosicion(GeoPunto posicion) {
        this.posicion = posicion;
    }

    public TipoSitio getTipo() {
        return tipo;
    }

    public void setTipo(TipoSitio tipo) {
        this.tipo = tipo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public long getFecha() {
        return fecha;
    }

    public void setFecha(long fecha) {
        this.fecha = fecha;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

    @Override
    public String toString() {
        return "Sitio{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", posicion=" + posicion +
                ", foto='" + foto + '\'' +
                ", telefono='" + telefono + '\'' +
                ", url='" + url + '\'' +
                ", comentario='" + comentario + '\'' +
                ", fecha=" + fecha +
                ", valoracion=" + valoracion +
                ", tipo=" + tipo +
                '}';
    }
}
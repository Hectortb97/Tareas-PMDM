package com.example.adivinanzas;

public class Adivinanza {

    private int id;
    private String adivinanza;
    private String respuesta;

    public Adivinanza(int id, String adivinanza, String respuesta)
    {
        this.id = id;
        this.adivinanza = adivinanza;
        this.respuesta = respuesta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdivinanza() {
        return adivinanza;
    }

    public void setAdivinanza(String adivinanza) {
        this.adivinanza = adivinanza;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return "Adivinanza{" +
                "id=" + id +
                ", adivinanza='" + adivinanza + '\'' +
                ", respuesta='" + respuesta + '\'' +
                '}';
    }
}

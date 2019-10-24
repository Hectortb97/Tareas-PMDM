package com.example.missitios;

public enum TipoSitio {
    OTROS("Otros", 1),
    RESTAURANTE("Restaurante", 2),
    BAR("Bar", 3),
    COPAS("Copas", 4),
    ESPECTACULO("Espectáculo", 5),
    HOTEL("Hotel", 6),
    COMPRAS("Compras", 7),
    EDUCACION("Educación", 8),
    DEPORTE("Deporte", 9),
    NATURALEZA("Naturaleza", 10),
    GASOLINERA("Gasolinera", 11),
    MUSEO("Museo", 12);
    private final String texto;
    private final int recurso;

    TipoSitio(String texto, int recurso) {
        this.texto = texto;
        this.recurso = recurso;
    }

    public String getTexto() {
        return texto;
    }

    public int getRecurso() {
        return recurso;
    }
}

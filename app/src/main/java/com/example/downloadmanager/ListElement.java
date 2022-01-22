package com.example.downloadmanager;

public class ListElement {
    public String color;
    public String fichero;
    public String fecha;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ListElement(String fichero, String fecha, String color) {
        this.fichero = fichero;
        this.fecha = fecha;
        this.color = color;
    }

    public String getFichero() {
        return fichero;
    }

    public void setFichero(String fichero) {
        this.fichero = fichero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}

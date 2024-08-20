package Ejercicio2;

public class Asiento {
    private int fila;
    private int columna;
    private String estado = null;



    public String reservar() {
        if (estado.equals("ocupao")) {
            estado = "Ocupado";
        }
        return estado = "Reservado";
    }

    public String ocupar() {
        if (estado.equals("Reservado")) {
            estado = "Reservado";
        }
        return estado = "Ocupado";
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    }


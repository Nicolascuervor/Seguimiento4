package Ejercicio5;

import java.util.ArrayList;

public class Avion {
    private String modelo;
    private int capacidad;
    private ArrayList<String> listaAsientos;
    Asiento asiento;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<String> getListaAsientos() {
        return listaAsientos;
    }

    public void setListaAsientos(ArrayList<String> listaAsientos) {
        this.listaAsientos = listaAsientos;
    }
}

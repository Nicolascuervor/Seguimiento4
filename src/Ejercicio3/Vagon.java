package Ejercicio3;

import javax.swing.*;
import java.util.ArrayList;

public class Vagon {
    private Cliente cliente;
    private String tipo;
    private int capacidad;
    private Asiento asiento;
    private Tren tren;

    public Vagon(Cliente cliente, Asiento asiento, Tren tren) {
        this.cliente = cliente;
        this.asiento = asiento;
        this.tren = tren;
    }

    ArrayList<String> listaAsientos = new ArrayList<>();


    public void reserva(){
        int num = (int)(Math.random()*5 + 1);

        asiento.setNumero(num);
        asiento.setEstado("Reservado");
        tren.setListaVagones(num + "X");


        JOptionPane.showMessageDialog(null, "Al Tren "+ this.tren.getNumero() + " se le ha reservado el asiento " + this.asiento.getNumero() + "A al cliente " + this.cliente.getNombre() );
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public void setListaAsientos(String dato) {
        listaAsientos.add(dato);
    }
}

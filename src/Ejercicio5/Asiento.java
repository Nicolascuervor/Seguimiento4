package Ejercicio5;

import javax.swing.*;

public class Asiento {
    private int numero;
    private String clase;
    private String estado = " ";
    Avion avion;
    Pasajero pasajero;

    public Asiento( Avion avion, Pasajero pasajero) {
        this.avion = avion;
        this.pasajero = pasajero;
    }

    public void reservarAsiento(){
        int num = (int)(Math.random()*5 + 1);
        numero = num;
        estado = "Reservado";
        JOptionPane.showMessageDialog(null, "Al Avion modelo: "+ this.avion.getModelo() + " se le ha reservado el asiento " + num + "A al cliente " + this.pasajero.getNombre());

    }

    public void hola(){
        System.out.println("Hola");
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public void reservar(){
        if (estado.equals("Ocupado") || estado.equals(" ")){
            estado = "Reservado";
        }
        else estado = "Ocupado";
    }

    public void ocupar(){
        if (estado.equals("Reservado") || estado.equals(" ")){
            estado = "Ocupado";
        }
        else estado = "Reservado";
    }
}

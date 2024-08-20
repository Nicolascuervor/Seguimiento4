package Ejercicio5;

import javax.swing.*;

public class Reserva {
    private Pasajero pasajero;
    private Vuelo vuelo;
    private Asiento asiento;

    public Reserva(Pasajero pasajero, Vuelo vuelo, Asiento asiento) {
        this.pasajero = pasajero;
        this.vuelo = vuelo;
        this.asiento = asiento;
    }

    public void compra(){
        int decision = JOptionPane.showConfirmDialog(null,"Esta seguro de comprar el boleto con las siguiente especificaciones? \n " +
                "Destino: " + vuelo.getRuta() + "\n " +
                "Fecha: " + vuelo.getFecha() + "\n " +
                "Salida: " + vuelo.getHoraSalida() + "\n " +
                "Llegada: " + vuelo.getHoraLlegada() + "\n " +
                "Precio: 500000" );

        if(decision == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"Compra realizada con exito");
        }
    }



    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }
}

package Ejercicio3;

import javax.swing.*;

public class Boleto {
    private Cliente cliente;
    private Viaje viaje;
    private Asiento asiento;
    private Tren tren;


    public Boleto(Cliente cliente, Viaje viaje, Asiento asiento, Tren tren) {
        this.cliente = cliente;
        this.viaje = viaje;
        this.asiento = asiento;
        this.tren = tren;
    }

    public Tren getTren() {
        return tren;
    }

    public void setTren(Tren tren) {
        this.tren = tren;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }


    public void compra(){
        int decision = JOptionPane.showConfirmDialog(null,"Esta seguro de comprar el boleto con las siguiente especificaciones? \n " +
                "Destino: " + tren.getRuta() + "\n " +
                "Fecha: " + viaje.getFecha() + "\n " +
                "Salida: " + viaje.getHoraSalida() + "\n " +
                "Llegada: " + viaje.getHoraLlegada() + "\n " +
                "Precio: 50000" );

        if(decision == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"Compra realizada con exito");
        }
    }
}

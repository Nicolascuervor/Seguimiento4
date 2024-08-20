package Ejercicio2;

import javax.swing.*;

public class Reserva {
    private Cliente cliente;
    private Funcion funcion;
    private Sala sala;


    public Reserva(Cliente cliente, Funcion funcion, Sala sala) {
        this.cliente = cliente;
        this.funcion = funcion;
        this.sala = sala;
    }


    public void confirmarReservar(){
            JOptionPane.showMessageDialog(null, "Datos del cliente: \nNombre: "+this.cliente.getNombre() + "\nIdentificacion: " +this.cliente.getId() + "\nDireccion: "+ this.cliente.getDireccion());
            JOptionPane.showMessageDialog(null,"Pelicula reservada: \n" + this.funcion.getPelicula() + "// Hora: " + funcion.getHoraInicio() + "\n Asiento: " + sala.asientoEscogido);
            JOptionPane.showMessageDialog(null,"Valor total por la entrada: " + this.funcion.getPrecioEntrada() + "$ pesos");

        System.out.println("Historial de reservas: ");
            cliente.llenarHistorialReservas("Pelicula: " + this.funcion.getPelicula() + " Hora: " + this.funcion.getHoraInicio() + " Sala: " + sala.getNum() +  " Asiento: " + sala.asientoEscogido);

        System.out.println(cliente.getHistorialReservas());

       }



    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
}

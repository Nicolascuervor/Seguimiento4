package Ejercicio5;

import javax.swing.*;
import java.util.ArrayList;

public class Pasajero extends Persona{
    private ArrayList<String> historialReservas;

    public ArrayList<String> getHistorialReservas() {
        return historialReservas;
    }

    public void setHistorialReservas(ArrayList<String> historialReservas) {
        this.historialReservas = historialReservas;
    }

    public void llenarDatos(){
        String name = JOptionPane.showInputDialog(null,"Ingrese su nombre completo: ");
        setNombre(name);

        int identication = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingre su numero de cedula: "));
        setIdentificacion(identication);


        int contac = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su contacto: "));
        setContacto(contac);

    }
}

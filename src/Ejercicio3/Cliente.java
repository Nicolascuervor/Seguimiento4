package Ejercicio3;

import javax.swing.*;
import java.util.ArrayList;

public class Cliente  extends Persona{
    private ArrayList<String> historialCompras = new ArrayList<>();


    public ArrayList<String> getHistorialCompras() {
        return historialCompras;
    }

    public void setHistorialCompras(String dato) {
        historialCompras.add(dato);
    }

    public void llenarDatos(){
        String name = JOptionPane.showInputDialog(null,"Ingrese su nombre completo: ");
        setNombre(name);

        int identication = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingre su numero de cedula: "));
        setId(identication);


        String direction = JOptionPane.showInputDialog(null,"Ingrese su direccion: ");
        setDireccion(direction);

    }
}

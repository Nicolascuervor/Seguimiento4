package Ejercicio2;

import javax.swing.*;
import java.util.ArrayList;

public class Cliente  extends Persona{

  public void llenarDatos(){
      String name = JOptionPane.showInputDialog(null,"Ingrese su nombre completo: ");
      setNombre(name);

      int identication = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingre su numero de cedula: "));
      setId(identication);


      String direction = JOptionPane.showInputDialog(null,"Ingrese su direccion: ");
      setDireccion(direction);

  }



    private ArrayList<String> historialReservas = new ArrayList<>();

    public ArrayList<String> getHistorialReservas() {
        return historialReservas;
    }

    public void llenarHistorialReservas(String dato) {
        historialReservas.add(dato);
    }
}

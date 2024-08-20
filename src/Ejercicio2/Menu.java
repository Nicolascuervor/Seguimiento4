package Ejercicio2;

import javax.swing.*;

public class Menu {


    public void desplegarMenu(Cliente cliente, Funcion funcion, Reserva reserva, Asiento asiento, Sala sala){
        int num = 0;
        while(num < 1){
        int seccion1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Bienbenido, ingrese el respectivo numero para continuar: \n1. Registrar mis datos \n2. Elegir pelicula \n3. Elegir mi asiento \n4. Confirmar mi reserva \n5. Salir"));
                switch (seccion1){
                    case 1: cliente.llenarDatos();
                        break;
                    case 2: funcion.elegirPelicula();
                        break;
                    case 3: sala.marcarListaAsientos();
                        break;
                    case 4: reserva.confirmarReservar();
                        break;
                    case 5: num = 1;
            }





            }


    }


}

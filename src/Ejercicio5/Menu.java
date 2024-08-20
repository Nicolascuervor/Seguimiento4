package Ejercicio5;



import javax.swing.*;

public class Menu {
    public void desplegarMenu(Pasajero pasajero, Avion avion, Asiento asiento, Vuelo vuelo, Reserva reserva){
        int num = 0;
        while(num < 1){
            int seccion1 = Integer.parseInt(JOptionPane.showInputDialog(null,"|Menu de vuelo| Ingrese el respectivo numero para continuar: \n1. Registrar mis datos \n2. Buscar Viajes \n3. Reservar mi asiento \n4. Comprar Boletos \n5. Salir"));
            switch (seccion1){
                case 1: pasajero.llenarDatos();
                    break;
                case 2: vuelo.buscaViaje(avion);
                    break;
                case 3: asiento.reservarAsiento();
                    break;
                case 4: reserva.compra();
                    break;
                case 5: num = 1;
            }


        }
}
}

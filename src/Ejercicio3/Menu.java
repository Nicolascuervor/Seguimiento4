package Ejercicio3;
import javax.swing.*;

public class Menu {
    public void desplegarMenu(Cliente cliente, Tren tren, Vagon vagon, Asiento asiento,Viaje viaje, Boleto boleto){
        int num = 0;
        while(num < 1){
            int seccion1 = Integer.parseInt(JOptionPane.showInputDialog(null,"|Menu de viajes| Ingrese el respectivo numero para continuar: \n1. Registrar mis datos \n2. Buscar Viajes \n3. Reservar mi asiento \n4. Comprar Boletos \n5. Salir"));
            switch (seccion1){
                case 1: cliente.llenarDatos();
                    break;
                case 2: viaje.buscaViaje(tren);
                    break;
                case 3: vagon.reserva();
                    break;
                case 4:
                        boleto.compra();
                    break;
                case 5: num = 1;
            }


        }
    }
}

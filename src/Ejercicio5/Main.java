package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        Pasajero pasajero = new Pasajero();
        Vuelo vuelo = new Vuelo();
        Avion avion = new Avion();
        Asiento asiento = new Asiento(avion,pasajero);
        Reserva reserva = new Reserva(pasajero,vuelo,asiento);


        menu.desplegarMenu(pasajero,avion,asiento,vuelo,reserva);

    }
}

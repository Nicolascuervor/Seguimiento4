package Ejercicio2;

public class Main {
    public static void main(String[] args) {

        Funcion funcion = new Funcion(12000);
        Cliente cliente = new Cliente();
        Asiento asiento = new Asiento();
        Sala sala = new Sala(3,30,asiento);
        Reserva reserva = new Reserva(cliente,funcion,sala);



        Menu menu = new Menu();

        menu.desplegarMenu(cliente,funcion,reserva,asiento,sala);

    }
}

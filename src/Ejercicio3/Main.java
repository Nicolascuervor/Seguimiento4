package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        Viaje viaje = new Viaje();

        Tren tren = new Tren();
        tren.setListaVagones("1");
        tren.setListaVagones("2");
        tren.setListaVagones("3");
        tren.setListaVagones("4");

        Asiento asiento = new Asiento();

        Vagon vagon = new Vagon(cliente,asiento,tren);
        vagon.setListaAsientos("1A");
        vagon.setListaAsientos("2A");
        vagon.setListaAsientos("3A");
        vagon.setListaAsientos("4A");
        vagon.setListaAsientos("5A");

        Boleto boleto = new Boleto(cliente,viaje,asiento,tren);

        Menu menu = new Menu();

        menu.desplegarMenu(cliente,tren,vagon, asiento,viaje,boleto);



    }


}

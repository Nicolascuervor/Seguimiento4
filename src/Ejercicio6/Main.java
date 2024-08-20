package Ejercicio6;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        int num = 0;
        Biblioteca biblioteca = new Biblioteca();


        while (num < 1){

            int decision1 = Integer.parseInt(JOptionPane.showInputDialog("Bienbenido a la pagina de la biblioteca, ingrese un numero para continuar: \n" +
                    "1. Agregar libro \n" +
                    "2. Eliminar libro \n" +
                    "3. Buscar libro por titulo \n" +
                    "4. Buscar libro por autor \n" +
                    "5. Listar de libros \n" +
                    "6. Salir "));

            switch (decision1){
                case 1: biblioteca.agregarLibro();
                break;
                case 2: biblioteca.borrarLibro();
                break;
                case 3: biblioteca.buscarLibro();
                break;
                case 4: biblioteca.buscarLibroAutor();
                break;
                case 5: biblioteca.listaLibrosPagina();
                break;
                case 6:
                    num+=1;
                    break;


            }
        }





    }
}

package Ejercicio2;

import javax.swing.*;

public class Funcion {
    private String pelicula;
    private String horaInicio;
    private int sala;
    private int precioEntrada;

    public Funcion(int precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public void elegirPelicula(){
       int movie = Integer.parseInt(JOptionPane.showInputDialog("Eliga la pelicula que desea ver: \n1. Harry potter \n2. Deadpool \n3. Iron man"));
       switch(movie){
           case 1:
               setPelicula("Harry Potter");
               break;
           case 2:
               setPelicula("Deadpool");
               break;
           case 3:
               setPelicula("Iron Man");
               break;
       }
       int hora = Integer.parseInt(JOptionPane.showInputDialog("Eliga la hora de inicio de la pelicula: \n1. 12:00 pm\n2. 5:00 pm \n3. 10:00 pm"));
       switch(hora){
           case 1:
               setHoraInicio("12:00 pm");
               break;
           case 2:
               setHoraInicio("5:00 pm");
               break;
           case 3:
               setHoraInicio("10:00 pm");
               break;
       }
   }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public int getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(int precioEntrada) {
        this.precioEntrada = precioEntrada;
    }
}

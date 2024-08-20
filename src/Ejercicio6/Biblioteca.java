package Ejercicio6;

import javax.swing.*;
import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Libro> listaLibros = new ArrayList<Libro>();

    public void agregarLibro() {
        String title = JOptionPane.showInputDialog(null, "Ingrese el nombre del libro: ");
        String caseInsensitiveTitle = title.toLowerCase();

        String author = JOptionPane.showInputDialog(null, "Ingrese el nombre del autor: ");
        String isbnIngresado = JOptionPane.showInputDialog(null, "Ingrese el ISBN del libro: ");
        int year = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el año de publicacion del libro: "));

        listaLibros.add(new Libro(caseInsensitiveTitle, author, isbnIngresado, year));

    }


    public void buscarLibro() {
        String busqueda = JOptionPane.showInputDialog(null, "Ingrese el titulo del libro: ");
        String caseInsensitiveTitleInput = busqueda.toLowerCase();

        for (Libro libro : listaLibros) {
            if (libro.getTitulo().equals(caseInsensitiveTitleInput)) {
                JOptionPane.showMessageDialog(null, "Libro encontrado");
            }
            else JOptionPane.showMessageDialog(null, "Libro no encontrado");
        }
    }


    public Libro buscarLibroIsbn(String dato) {
        for (Libro libro : listaLibros) {
            if (libro.getIsbn().equals(dato)) {
                return libro;
            }
            return null;

        }
        return null;
    }



        public void borrarLibro() {
            String ingreso = JOptionPane.showInputDialog(null, "Ingrese el ISBN del libro para removerlo de la biblioteca:");

            Libro libro = buscarLibroIsbn(ingreso);

            if (libro.getIsbn().equals(libro.getIsbn())) {
                JOptionPane.showMessageDialog(null, "Libro eliminado");
                listaLibros.remove(libro);
            } else JOptionPane.showMessageDialog(null, "Libro no encontrado");

        }



        public void buscarLibroAutor (){
            String busqueda = JOptionPane.showInputDialog(null, "Ingrese el titulo del libro: ");
            for (Libro libro : listaLibros) {
                if (libro.getAutor().equals(busqueda)) {
                    JOptionPane.showMessageDialog(null, "Autor encontrado");
                } else JOptionPane.showMessageDialog(null, "Autor no encontrado");
            }
        }

        public void listaLibrosPagina () {
            if (listaLibros.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay productos registrados");
            } else {
                StringBuilder sb = new StringBuilder();
                for (Libro libro : listaLibros) {
                    sb.append(libro.listaLibros()).append("\n\n");
                }
                JOptionPane.showMessageDialog(null, sb.toString());
            }
        }


    }

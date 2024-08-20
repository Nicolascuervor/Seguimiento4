package Ejercicio2;

import javax.swing.*;


public class Sala {
    private int num;
    private int capacidad;
    Asiento asiento;
    public String asientoEscogido;


    public Sala(int num, int capacidad, Asiento asiento) {
        this.num = num;
        this.capacidad = capacidad;
        this.asiento = asiento;
    }

    final String[][] LISTASIENTOS = {
            {"1A " , "1B " , "1C " , "1D " , "1E " , "1F "},
            {"2A " , "2B " , "2C " , "2D " , "2E " , "2F "},
            {"3A " , "3B " , "3C " , "3D " , "3E " , "3F "},
            {"4A " , "4B " , "4C " , "4D " , "4E " , "4F "},
            {"5A " , "5B " , "5C " , "5D " , "5E " , "5F "},
    };

    final String[][] LISTASIENTOSORIGINAL = {
            {"1A " , "1B " , "1C " , "1D " , "1E " , "1F "},
            {"2A " , "2B " , "2C " , "2D " , "2E " , "2F "},
            {"3A " , "3B " , "3C " , "3D " , "3E " , "3F "},
            {"4A " , "4B " , "4C " , "4D " , "4E " , "4F "},
            {"5A " , "5B " , "5C " , "5D " , "5E " , "5F "},
    };


    public void mostrar() {
        JOptionPane.showMessageDialog(null, LISTASIENTOS);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }


    public void marcarListaAsientos() {

        StringBuilder matrizActualizada = new StringBuilder();
        StringBuilder matrizActualizada2 = new StringBuilder();

        for (int i = 0; i < LISTASIENTOSORIGINAL.length; i++) {
            for (int j = 0; j < LISTASIENTOSORIGINAL[i].length; j++) {
                matrizActualizada2.append(LISTASIENTOSORIGINAL[i][j]);
                if (j < LISTASIENTOSORIGINAL[i].length - 1) {
                    matrizActualizada2.append("  ");
                }
            }
            matrizActualizada2.append("\n");
        }


        JOptionPane.showMessageDialog(null,matrizActualizada2.toString());


        int buscarFila = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una fila de la planilla [0-4]: "));


        int buscarColumna = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una columna de la planilla [0-5]: "));


        if (buscarFila >= 0 && buscarFila < LISTASIENTOS.length && buscarColumna >= 0 && buscarColumna < LISTASIENTOS[0].length && !LISTASIENTOS[buscarFila][buscarColumna].equals("  X  ")) {
            asientoEscogido = LISTASIENTOS[buscarFila][buscarColumna];
            LISTASIENTOS[buscarFila][buscarColumna] = "  X  ";
            LISTASIENTOSORIGINAL[buscarFila][buscarColumna] = "  X  ";
            this.asiento.setEstado("Reservado");

        } else {
            JOptionPane.showMessageDialog(null, "El asiento ya se encuentra ocupado! o has elegido una fila o culumna fuera de rango");
            return;
        }
        
        for (int i = 0; i < LISTASIENTOS.length; i++) {
            for (int j = 0; j < LISTASIENTOS[i].length; j++) {
                matrizActualizada.append(LISTASIENTOS[i][j]);
                if (j < LISTASIENTOS[i].length - 1) {
                    matrizActualizada.append("  ");
                }
            }
            matrizActualizada.append("\n");
        }
        JOptionPane.showMessageDialog(null,matrizActualizada.toString());


    }
}




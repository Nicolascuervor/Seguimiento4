package Ejercicio3;

import java.util.ArrayList;

public class Tren {
    private int numero;
    private String ruta;
    private Vagon vagon;

    ArrayList<String> listaVagones = new ArrayList<>();


    public Vagon getVagon() {
        return vagon;
    }

    public void setVagon(Vagon vagon) {
        this.vagon = vagon;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public ArrayList<String> getListaVagones() {
        return listaVagones;
    }

    public void setListaVagones(String dato) {
        listaVagones.add(dato);
    }
}

package Ejercicio3;

public class Asiento {
    private int numero;
    private String estado = " ";

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    public void reservar(){
        if (estado.equals("Ocupado") || estado.equals(" ")){
            estado = "Reservado";
        }
        else estado = "Ocupado";
    }

    public void ocupar(){
        if (estado.equals("Reservado") || estado.equals(" ")){
            estado = "Ocupado";
        }
        else estado = "Reservado";
    }
}

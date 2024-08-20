package Ejercicio1;

import java.util.ArrayList;

public class Cliente extends Persona {

    private int ingresos;
    private ArrayList<String> historialCrediticio = new ArrayList<>();


    public void llenarHistorialCrediticio(String dato) {
        historialCrediticio.add(dato);
    }

    public ArrayList<String> getHistorialCrediticio() {
        return historialCrediticio;
    }

    public void setHistorialCrediticio(ArrayList historialCrediticio) {
        this.historialCrediticio = historialCrediticio;
    }

    public int getIngresos() {
        return ingresos;
    }

    public void setIngresos(int ingresos) {
        this.ingresos = ingresos;
    }


}

package Ejercicio3;

import javax.swing.*;

public class Viaje {
    private String fecha;
    private String horaSalida;
    private String horaLlegada;
    private Tren tren;

    public void buscaViaje(Tren tren) {
        int decision = Integer.parseInt(JOptionPane.showInputDialog(null,"Viajes disponibles en tu zona: \n" +
                "1. Tren: 01 - Destino: Bogota - Fecha: 12/08/2024 - hora de salida: 12:00 pm - hora de llegada 3:00 pm \n" +
                "2. Tren: 04 - Destino: Medellin - Fecha: 1/12/2024 - hora de salida: 2:00 am - hora de llegada 6:00 am \n" +
                "3. Tren: 07 - Destino: Barranquilla - Fecha: 3/01/2025 - hora de salida: 5:00 pm - hora de llegada 2:00 am"));

        switch (decision) {
            case 1:
                fecha = "12/08/2024";
                horaSalida = "12:00 pm";
                horaLlegada = "3:00 pm";
                tren.setNumero(1);
                tren.setRuta("Bogota");
                break;

            case 2:
                fecha = "1/12/2024";
                horaSalida = "2:00 am";
                horaLlegada = "6:00 am";
                tren.setNumero(2);
                tren.setRuta("Medellin");
                break;


            case 3:
                fecha = "3/01/2025";
                horaSalida = "5:00 pm";
                horaLlegada = "2:00 am";
                tren.setNumero(3);
                tren.setRuta("Barranquilla");
                break;
        }
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public Tren getTren() {
        return tren;
    }

    public void setTren(Tren tren) {
        this.tren = tren;
    }
}

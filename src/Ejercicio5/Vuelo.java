package Ejercicio5;



import javax.swing.*;

public class Vuelo {
    private String ruta;
    private String fecha;
    private String horaSalida;
    private String horaLlegada;
    private Avion avion;

    public void buscaViaje(Avion avion) {
        int decision = Integer.parseInt(JOptionPane.showInputDialog(null,"Vuelos disponibles en tu zona: \n" +
                "1. Modelo del avion: boeing 737 - Destino: Brazil - Fecha: 2/10/2024 - hora de salida: 2:00 pm - hora de llegada 7:00 pm \n" +
                "2. Modelo del avion: airbus a320 - Destino: Miami - Fecha: 4/12/2025 - hora de salida: 6:00 am - hora de llegada 12:00 pm \n" +
                "3. Modelo del avion: Gulfstream G550 - Destino: Ecuador - Fecha: 23/07/2025 - hora de salida: 3:00 pm - hora de llegada 5:00 pm"));

        switch (decision) {
            case 1:
                fecha = "2/10/2024";
                horaSalida = "2:00 pm";
                horaLlegada = "7:00 pm";
                avion.setModelo("boeing 737");
                ruta = "Brazil";
                break;

            case 2:
                fecha = "4/12/2025";
                horaSalida = "6:00 am";
                horaLlegada = "12:00 pm";
                avion.setModelo("airbus a320");
                ruta = "Miami";
                break;

            case 3:
                fecha = "3/01/2025";
                horaSalida = "3:00 pm";
                horaLlegada = "5:00 am";
                avion.setModelo("Gulfstream G550");
                ruta = "Ecuador";
                break;
        }
    }


    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
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

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }
}

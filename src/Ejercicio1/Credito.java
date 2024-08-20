package Ejercicio1;

public class Credito {
    private SolicitudCredito solicitudCredito;
    private String estado = " ";


    public void aprobar(){
        if (estado.equals("Rechazado") || estado.equals("rechazado") || estado.equals(" ")){
            estado = "Aprobado";
        }
        else estado = "Rechazado";
    }

    public void rechazar(){
        if (estado.equals("Aprobado") || estado.equals("aprobado") || estado.equals(" ")){
            estado = "Rechazado";
        }
        else estado = "Aprobado";
    }



    public SolicitudCredito getSolicitudCredito() {
        return solicitudCredito;
    }

    public void setSolicitudCredito(SolicitudCredito solicitudCredito) {
        this.solicitudCredito = solicitudCredito;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

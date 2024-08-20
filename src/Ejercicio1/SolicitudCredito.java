package Ejercicio1;

public class SolicitudCredito {
    private Cliente cliente;
    private String tipoCredito;
    private int monto;
    private int plazo;
    private int tasaInteres;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getTipoCredito() {
        return tipoCredito;
    }

    public void setTipoCredito(String tipoCredito) {
        this.tipoCredito = tipoCredito;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public int getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(int tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
}

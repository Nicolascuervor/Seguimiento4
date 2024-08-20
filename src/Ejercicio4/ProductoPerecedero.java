package Ejercicio4;

class ProductoPerecedero extends Producto {
    private String fechaVencimiento;

    public ProductoPerecedero(String nombre, String descripcion, double precio, int stock, String fechaVencimiento) {
        super(nombre, descripcion, precio, stock);
        this.fechaVencimiento = fechaVencimiento;
    }


    public String obtenerFechaVencimiento() {
        return fechaVencimiento;
    }


    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + "\nFecha de Vencimiento: " + fechaVencimiento;
    }
}
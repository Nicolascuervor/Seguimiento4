package Ejercicio4;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Menu {
    ArrayList<Producto> productos = new ArrayList<>();

        public void desplegarMenu() {
            while (true) {
                String menu = "Seleccione una opción:\n" +
                        "1. Agregar Producto\n" +
                        "2. Agregar Producto Perecedero\n" +
                        "3. Modificar Stock\n" +
                        "4. Eliminar Producto\n" +
                        "5. Ver Productos\n" +
                        "6. Salir";

                String opcion = JOptionPane.showInputDialog(menu);

                int opcion2;
                try {
                    opcion2 = Integer.parseInt(opcion);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, ingrese un número entre 1 y 6.");
                    continue;
                }

                switch (opcion2) {
                    case 1:
                        agregarProducto(false);
                        break;
                    case 2:
                        agregarProducto(true);
                        break;
                    case 3:
                        modificarStock();
                        break;
                    case 4:
                        eliminarProducto();
                        break;
                    case 5:
                        verProductos();
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, ingrese un número entre 1 y 6.");
                        break;
                }
            }
        }

        public void agregarProducto(boolean esPerecedero) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
            if (nombre == null) return;

            String descripcion = JOptionPane.showInputDialog("Ingrese la descripción del producto:");
            if (descripcion == null) return;

            double precio;
            try {
                precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto:"));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Precio no válido.");
                return;
            }

            int stock;
            try {
                stock = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock del producto:"));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Stock no válido.");
                return;
            }

            if (esPerecedero) {
                String fechaStr = JOptionPane.showInputDialog("Ingrese la fecha de vencimiento (dd/MM/yyyy):");


                productos.add(new ProductoPerecedero(nombre, descripcion, precio, stock, fechaStr));
            } else {
                productos.add(new Producto(nombre, descripcion, precio, stock));
            }

            JOptionPane.showMessageDialog(null, "Producto agregado con éxito");
        }

        public void modificarStock() {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto a modificar:");
            if (nombre == null) return;

            Producto producto = buscarProductoPorNombre(nombre);
            if (producto != null) {
                int cantidad;
                try {
                    cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a modificar (positivo para agregar, negativo para reducir):"));
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Cantidad no válida.");
                    return;
                }
                producto.modificarStock(cantidad);
                JOptionPane.showMessageDialog(null, "Stock modificado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "Producto no encontrado");
            }
        }

        public void eliminarProducto() {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto a eliminar:");
            if (nombre == null) return;

            Producto producto = buscarProductoPorNombre(nombre);
            if (producto != null) {
                productos.remove(producto);
                JOptionPane.showMessageDialog(null, "Producto eliminado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "Producto no encontrado");
            }
        }

        public Producto buscarProductoPorNombre(String nombre) {
            for (Producto producto : productos) {
                if (producto.obtenerNombre().equalsIgnoreCase(nombre)) {
                    return producto;
                }
            }
            return null;
        }

        public void verProductos() {
            if (productos.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay productos registrados");
            } else {
                StringBuilder sb = new StringBuilder();
                for (Producto producto : productos) {
                    sb.append(producto.mostrarInfo()).append("\n\n");
                }
                JOptionPane.showMessageDialog(null, sb.toString());
            }
        }
    }

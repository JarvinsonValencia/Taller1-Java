package ejercicio1;

public class Producto implements Pagable, Serializable {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double calcularTotal() {
        return this.precio * (double) this.cantidad;
    }

    @Override
    public double calcularPago() {
        return precio;
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        double total = calcularTotal();
        return total - (total * porcentaje / 100);
    }

    @Override
    public String descripcion() {
        return String.format("Producto: %s, Precio: %.2f, Cantidad: %d", this.nombre, this.precio, this.cantidad);
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String toString() {
        return descripcion();
    }

    @Override
    public String serialize() {
        return null;
    }
}

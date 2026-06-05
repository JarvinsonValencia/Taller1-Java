public class Producto implements Pagable{
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String n, double p, int c) {
        this.nombre = n;
        this.precio = p;
        this.cantidad = c;
    }

        @Override
        public double calcularTotal() {
            return precio * cantidad;
        }

        @Override
        public double aplicarDescuento(double porcentaje) {
            return calcularTotal() * (1 - porcentaje);
        }


}


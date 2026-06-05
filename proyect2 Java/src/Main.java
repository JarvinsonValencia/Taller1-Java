public class Main {

    public static void Main (String[] args) {
        Factura factura = new Factura();

        factura.agregarItem(new Producto("Laptop", 1200.00, 1));
        factura.agregarItem(new Servicio("Consultoría", 100.00, 5));
        factura.agregarItem(new Servicio("Desarrollo Web", 80.00, 10));

        factura.imprimir();

    }
}

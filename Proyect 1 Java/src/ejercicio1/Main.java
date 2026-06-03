package ejercicio1;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ejercicio: Factura con polimorfismo y serialización \n");

        Producto laptop = new Producto("Laptop", 1500.00, 2);
        Producto teclado = new Producto("Teclado", 50.00, 1);
        Producto monitor = new Producto("Monitor", 300.00, 3);

        Servicio soporte = new Servicio("Soporte Técnico", 200.00, 5);
        Servicio desarrollo = new Servicio("Desarrollo de Software", 1000.00, 10);

        Factura factura = new Factura("F001", "Juan Pérez", null);
        factura.agregarItem(laptop);
        factura.agregarItem(teclado);
        factura.agregarItem(monitor);
        factura.agregarItem(soporte);
        factura.agregarItem(desarrollo);
        factura.imprimirFactura();
        factura.serializarItems();

        Pagable [] elementos = new Pagable[]{laptop, teclado, monitor, soporte, desarrollo};

        for (Pagable elemento : elementos) {
            System.out.println("Elemento: " + elemento.descripcion() + ", Pago: $" + elemento.calcularPago());
        }
    }
}

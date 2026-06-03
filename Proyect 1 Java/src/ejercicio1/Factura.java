package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    private String numeroFactura;
    private String cliente;
    private List<Pagable> items;

    public Factura(String numeroFactura, String cliente, List<Pagable> items) {
        this.numeroFactura = numeroFactura;
        this.cliente = cliente;
        this.items = new ArrayList<>();
    }

    public void agregarItem(Pagable item) {
        items.add(item);
        System.out.println("Item agregado: " + item.descripcion() );
    }

    public double calcularTotal() {
        double total = (double)0.0f;
        for (Pagable item : items) {
            total += item.calcularPago();
        }
        return total;
    }

    public void imprimirFactura() {
        System.out.println("\n |--------------------------------------------------|");
        System.out.println(" |                  FACTURA DE VENTA"                   );
        System.out.println("\n |--------------------------------------------------|");
        System.out.println(" |        FACTURA N°: " + numeroFactura + "            |");
        System.out.println(" |        CLIENTE: " + cliente + "                   |");
        System.out.println("Items: ");
        for (Pagable item : items) {
            System.out.println(" - " + item.descripcion() + ": $" + item.calcularPago());
        }

        System.out.println("Total a pagar: $" + calcularTotal());
    }

    public void serializarItems() {
        System.out.println("\n |--------------------------------------------------|");
        System.out.println(" |                  SERIALIZACIÓN DE ITEMS"                   );
        System.out.println("\n |--------------------------------------------------|");
        for (Pagable item : items) {
            System.out.println("Item: " + item.descripcion() + ", Pago: $" + item.calcularPago());
        }
    }

    public List<Pagable> getItems() {
        return items;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public String getCliente() {
        return cliente;
    }

}

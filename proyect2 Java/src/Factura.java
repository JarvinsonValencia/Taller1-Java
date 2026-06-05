import java.util.ArrayList;
import java.util.List;

public class Factura {
    private String numero;
    private List<Pagable> items = new ArrayList<>();

    public void agregarItem(Pagable item) {
        items.add(item);
    }

    public double calcularGranTotal(){
        return items.stream()
                .mapToDouble(Pagable::calcularTotal)
                .sum();
    }

    public void imprimir(){
        items.forEach(
                item -> System.out.println(item.resumen())
        );
        System.out.println("Total: $ " + calcularGranTotal());
    }
}

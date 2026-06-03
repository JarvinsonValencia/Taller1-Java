package ejercicio1;

public class Servicio implements Pagable, Serializable {
    private String descripcion;
    private double precioHora;
    private double horasTrabajadas;

       public Servicio(String descripcion, double precioHora, double horasTrabajadas) {
            this.descripcion = descripcion;
            this.precioHora = precioHora;
            this.horasTrabajadas = horasTrabajadas;
        }

    public double calcularTotal() {
        return this.precioHora * this.horasTrabajadas;
    }

    @Override
    public double calcularPago() {
        return 0;
    }

    public double aplicarDescuento(double porcentaje) {
        double total = calcularTotal();
        return total - (total * porcentaje / 100);
    }

    public String descripcion() {
        return String.format("Servicio: %s, Precio por Hora: %.2f, Horas Trabajadas: %.2f", this.descripcion, this.precioHora, this.horasTrabajadas);
    }

    public String serializar() {
        return String.format("%s,%.2f,%.2f", this.descripcion, this.precioHora, this.horasTrabajadas);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public String toString() {
        return descripcion();
    }

    @Override
    public String serialize() {
        return null;
    }
}

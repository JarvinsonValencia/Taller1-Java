public class Servicio implements Pagable{
    private String descripcion;
    private double precioHora;
    private double horasTrabajadas;

    public Servicio(String descripcion, double precioHora, double horasTrabajadas) {
        this.descripcion = descripcion;
        this.precioHora = precioHora;
        this.horasTrabajadas = horasTrabajadas;
    }


    @Override
    public double calcularTotal() {
        return precioHora * horasTrabajadas;
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        return calcularTotal() * (1 - porcentaje);
    }
}

package ejercicio1;

public class AutoElectrico extends Auto implements VehiculoElectrico {
    private final double capacidadBateriaKwh;
    private double nivelCargaPorcentaje;
    private final double consumoKwhPor100Km;
    private final double precioKwh;

    public AutoElectrico(String marca, String modelo, int anio, double capacidadBateriaKwh,
            double nivelCargaPorcentaje, double consumoKwhPor100Km, double precioKwh) {
        super(marca, modelo, anio, 0, 0);
        this.capacidadBateriaKwh = capacidadBateriaKwh;
        setNivelCargaPorcentaje(nivelCargaPorcentaje);
        this.consumoKwhPor100Km = consumoKwhPor100Km;
        this.precioKwh = precioKwh;
    }

    @Override
    public double getCapacidadBateriaKwh() {
        return capacidadBateriaKwh;
    }

    @Override
    public double getNivelCargaPorcentaje() {
        return nivelCargaPorcentaje;
    }

    @Override
    public void cargar(double porcentaje) {
        setNivelCargaPorcentaje(nivelCargaPorcentaje + porcentaje);
    }

    @Override
    public double calcularCostoViaje(double kilometros) {
        double energiaNecesaria = (kilometros / 100.0) * consumoKwhPor100Km;
        return energiaNecesaria * precioKwh;
    }

    private void setNivelCargaPorcentaje(double nivelCargaPorcentaje) {
        this.nivelCargaPorcentaje = nivelCargaPorcentaje;
    }
}

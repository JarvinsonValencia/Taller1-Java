package ejercicio1;

public class Auto extends Vehiculo {
    private final double consumoGalonPor100Km;
    private final double precioCombustibleXGalon;

    public Auto (String marca, String modelo, int anio,
            double consumoGalonPor100Km,
            double precioCombustibleXGalon) {
        super(marca, modelo, anio);
        this.consumoGalonPor100Km = consumoGalonPor100Km;
        this.precioCombustibleXGalon = precioCombustibleXGalon;
    }

    @Override
    public double calcularCostoViaje(double kilometros) {
        double galonesNecesarios = (kilometros / 100.0) * consumoGalonPor100Km;
        return galonesNecesarios * precioCombustibleXGalon;
    }
}

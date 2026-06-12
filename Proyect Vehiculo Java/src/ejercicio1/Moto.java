package ejercicio1;

public class Moto extends Vehiculo{
    private final double consumoGalonPor100Km;
    private final double precioCombustibleXGalon;

    public Moto(
            String marca,
            String modelo,
            int anio,
            double consumoGalonPor100Km,
            double precioCombustibleXGalon) {
        super(marca, modelo, anio);
        this.consumoGalonPor100Km = consumoGalonPor100Km;
        this.precioCombustibleXGalon = precioCombustibleXGalon;
    }

    @Override
    public double calcularCostoViaje(double kilometros) {
        double galonessNecesarios = (kilometros / 100.0) * consumoGalonPor100Km;
        return galonessNecesarios * precioCombustibleXGalon;
    }
}

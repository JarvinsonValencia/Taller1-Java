package ejercicio1;

public abstract class Vehiculo {

    private final String marca;
    private final String modelo;
    private final int anio;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public String getDescripcion() {
        return marca + " " + modelo + " (" + anio + ")";
    }

    public abstract double calcularCostoViaje(double kilometros);
}

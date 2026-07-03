package com.demo.vehiculoService.model;

import jakarta.persistence.Entity;

@Entity
public class Auto extends Vehiculo {
    private double consumoLitrosPor100Km;
    private double precioLitroCombustible;

    public Auto() {
    }

    public Auto(String marca, String modelo, int anio,
            double consumoLitrosPor100Km, double precioLitroCombustible) {
        super(marca, modelo, anio);
        this.consumoLitrosPor100Km = consumoLitrosPor100Km;
        this.precioLitroCombustible = precioLitroCombustible;
    }

    public double getConsumoLitrosPor100Km() {
        return consumoLitrosPor100Km;
    }

    public void setConsumoLitrosPor100Km(double consumoLitrosPor100Km) {
        this.consumoLitrosPor100Km = consumoLitrosPor100Km;
    }

    public double getPrecioLitroCombustible() {
        return precioLitroCombustible;
    }

    public void setPrecioLitroCombustible(double precioLitroCombustible) {
        this.precioLitroCombustible = precioLitroCombustible;
    }

    @Override
    public double calcularCostoViaje(double distanciaKm) {
        double litrosNecesarios = (distanciaKm / 100.0) * consumoLitrosPor100Km;
        return litrosNecesarios * precioLitroCombustible;
    }
}
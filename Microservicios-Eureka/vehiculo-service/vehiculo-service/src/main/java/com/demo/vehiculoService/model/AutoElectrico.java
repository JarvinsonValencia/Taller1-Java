package com.demo.vehiculoService.model;

import com.demo.vehiculoService.repository.VehiculoElectrico;
import jakarta.persistence.Entity;

@Entity
public class AutoElectrico extends Auto implements VehiculoElectrico {
    private double capacidadBateriaKwh;
    private double nivelCargaPorcentaje;
    private double consumoKwhPor100Km;
    private double precioKwh;

    public AutoElectrico() {
    }

    public AutoElectrico(String marca, String modelo, int anio,
            double capacidadBateriaKwh, double nivelCargaPorcentaje,
            double consumoKwhPor100Km, double precioKwh) {
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

    public void setCapacidadBateriaKwh(double capacidadBateriaKwh) {
        this.capacidadBateriaKwh = capacidadBateriaKwh;
    }

    @Override
    public double getNivelCargaPorcentaje() {
        return nivelCargaPorcentaje;
    }

    public void setNivelCargaPorcentaje(double nivelCargaPorcentaje) {
        if (nivelCargaPorcentaje < 0 || nivelCargaPorcentaje > 100) {
            throw new IllegalArgumentException("El nivel de carga debe estar entre 0 y 100.");
        }
        this.nivelCargaPorcentaje = nivelCargaPorcentaje;
    }

    public double getConsumoKwhPor100Km() {
        return consumoKwhPor100Km;
    }

    public void setConsumoKwhPor100Km(double consumoKwhPor100Km) {
        this.consumoKwhPor100Km = consumoKwhPor100Km;
    }

    public double getPrecioKwh() {
        return precioKwh;
    }

    public void setPrecioKwh(double precioKwh) {
        this.precioKwh = precioKwh;
    }

    @Override
    public void cargar(double porcentaje) {
        setNivelCargaPorcentaje(nivelCargaPorcentaje + porcentaje);
    }

    @Override
    public boolean puedeRealizarViaje(double distanciaKm) {
        double energiaNecesaria = (distanciaKm / 100.0) * consumoKwhPor100Km;
        return energiaNecesaria <= getEnergiaDisponibleKwh();
    }

    @Override
    public double calcularCostoViaje(double distanciaKm) {
        double energiaNecesaria = (distanciaKm / 100.0) * consumoKwhPor100Km;
        return energiaNecesaria * precioKwh;
    }
}
package com.demo.cotizadorService.model;

public class Cotizacion {
    private double distanciaKm;
    private String tipoVehiculo;
    private double consumoLitrosPor100Km;
    private double precioLitroCombustible;
    private double capacidadBateriaKwh;
    private double nivelCargaPorcentaje;
    private double consumoKwhPor100Km;
    private double precioKwh;
    private boolean puedeRealizarViaje;
    private double costo;
    private String mensaje;

    public Cotizacion() {
    }

    public Cotizacion(double distanciaKm, String tipoVehiculo,
            double consumoLitrosPor100Km, double precioLitroCombustible,
            double capacidadBateriaKwh, double nivelCargaPorcentaje,
            double consumoKwhPor100Km, double precioKwh) {
        this.distanciaKm = distanciaKm;
        this.tipoVehiculo = tipoVehiculo;
        this.consumoLitrosPor100Km = consumoLitrosPor100Km;
        this.precioLitroCombustible = precioLitroCombustible;
        this.capacidadBateriaKwh = capacidadBateriaKwh;
        this.nivelCargaPorcentaje = nivelCargaPorcentaje;
        this.consumoKwhPor100Km = consumoKwhPor100Km;
        this.precioKwh = precioKwh;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
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

    public double getCapacidadBateriaKwh() {
        return capacidadBateriaKwh;
    }

    public void setCapacidadBateriaKwh(double capacidadBateriaKwh) {
        this.capacidadBateriaKwh = capacidadBateriaKwh;
    }

    public double getNivelCargaPorcentaje() {
        return nivelCargaPorcentaje;
    }

    public void setNivelCargaPorcentaje(double nivelCargaPorcentaje) {
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

    public boolean isPuedeRealizarViaje() {
        return puedeRealizarViaje;
    }

    public void setPuedeRealizarViaje(boolean puedeRealizarViaje) {
        this.puedeRealizarViaje = puedeRealizarViaje;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
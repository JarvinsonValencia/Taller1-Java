package com.demo.flotaService.model;

import java.util.List;

public class Flota {
    private double distanciaKm;
    private List<CotizacionFlota> cotizaciones;
    private VehiculoFlota vehiculoMasEconomico;
    private CotizacionFlota cotizacionMasEconomica;

    public Flota() {
    }

    public Flota(double distanciaKm, List<CotizacionFlota> cotizaciones) {
        this.distanciaKm = distanciaKm;
        this.cotizaciones = cotizaciones;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public List<CotizacionFlota> getCotizaciones() {
        return cotizaciones;
    }

    public void setCotizaciones(List<CotizacionFlota> cotizaciones) {
        this.cotizaciones = cotizaciones;
    }

    public VehiculoFlota getVehiculoMasEconomico() {
        return vehiculoMasEconomico;
    }

    public void setVehiculoMasEconomico(VehiculoFlota vehiculoMasEconomico) {
        this.vehiculoMasEconomico = vehiculoMasEconomico;
    }

    public CotizacionFlota getCotizacionMasEconomica() {
        return cotizacionMasEconomica;
    }

    public void setCotizacionMasEconomica(CotizacionFlota cotizacionMasEconomica) {
        this.cotizacionMasEconomica = cotizacionMasEconomica;
    }
}
package com.demo.vehiculoService.repository;

public interface VehiculoElectrico {
    double getCapacidadBateriaKwh();

    double getNivelCargaPorcentaje();

    void cargar(double porcentaje);

    default double getEnergiaDisponibleKwh() {
        return getCapacidadBateriaKwh() * (getNivelCargaPorcentaje() / 100.0);
    }
}
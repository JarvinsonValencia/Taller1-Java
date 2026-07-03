package com.demo.cotizadorService.service;

import com.demo.cotizadorService.model.Cotizacion;
import org.springframework.stereotype.Service;

@Service
public class CotizadorService {
    public Cotizacion cotizar(Cotizacion cotizacion) {
        if (esElectrico(cotizacion.getTipoVehiculo())) {
            return cotizarElectrico(cotizacion);
        }
        return cotizarCombustible(cotizacion);
    }

    private Cotizacion cotizarCombustible(Cotizacion cotizacion) {
        double litrosNecesarios = (cotizacion.getDistanciaKm() / 100.0)
                * cotizacion.getConsumoLitrosPor100Km();
        double costo = litrosNecesarios * cotizacion.getPrecioLitroCombustible();

        cotizacion.setPuedeRealizarViaje(true);
        cotizacion.setCosto(costo);
        cotizacion.setMensaje("Cotizacion generada");
        return cotizacion;
    }

    private Cotizacion cotizarElectrico(Cotizacion cotizacion) {
        double energiaNecesaria = (cotizacion.getDistanciaKm() / 100.0) * cotizacion.getConsumoKwhPor100Km();
        double energiaDisponible = cotizacion.getCapacidadBateriaKwh() * (cotizacion.getNivelCargaPorcentaje() / 100.0);
        boolean puedeRealizarViaje = energiaNecesaria <= energiaDisponible;
        double costo = energiaNecesaria * cotizacion.getPrecioKwh();
        String mensaje = puedeRealizarViaje
                ? "Cotizacion generada"
                : "El vehiculo electrico no tiene carga suficiente";

        cotizacion.setPuedeRealizarViaje(puedeRealizarViaje);
        cotizacion.setCosto(costo);
        cotizacion.setMensaje(mensaje);
        return cotizacion;
    }

    private boolean esElectrico(String tipoVehiculo) {
        return "autoElectrico".equalsIgnoreCase(tipoVehiculo)
                || "electrico".equalsIgnoreCase(tipoVehiculo);
    }
}
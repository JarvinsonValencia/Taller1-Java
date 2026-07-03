package com.demo.flotaService.service;

import java.util.List;

import com.demo.flotaService.model.CotizacionFlota;
import com.demo.flotaService.model.Flota;
import com.demo.flotaService.model.VehiculoFlota;
import org.springframework.stereotype.Service;

@Service
public class FlotaService {
    private final List<VehiculoFlota> flota = List.of(
            new VehiculoFlota(1L, "auto", "Toyota", "Corolla", 2022),
            new VehiculoFlota(2L, "moto", "Yamaha", "FZ", 2021),
            new VehiculoFlota(3L, "autoElectrico", "Tesla", "Model 3", 2024));

    public List<VehiculoFlota> listarFlota() {
        return flota;
    }

    public Flota buscarVehiculoMasEconomico(Flota flota) {
        if (flota.getCotizaciones() == null || flota.getCotizaciones().isEmpty()) {
            throw new IllegalArgumentException("Debe enviar cotizaciones para evaluar la flota.");
        }

        CotizacionFlota cotizacionMasEconomica = null;

        for (CotizacionFlota cotizacion : flota.getCotizaciones()) {
            if (!cotizacion.isPuedeRealizarViaje()) {
                continue;
            }

            if (cotizacionMasEconomica == null || cotizacion.getCosto() < cotizacionMasEconomica.getCosto()) {
                cotizacionMasEconomica = cotizacion;
            }
        }

        if (cotizacionMasEconomica == null) {
            throw new IllegalStateException("No hay vehiculos disponibles para comparar el costo del viaje.");
        }

        flota.setVehiculoMasEconomico(cotizacionMasEconomica.getVehiculo());
        flota.setCotizacionMasEconomica(cotizacionMasEconomica);
        return flota;
    }
}
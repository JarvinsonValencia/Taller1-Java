package com.demo.flotaService.controller;

import java.util.List;

import com.demo.flotaService.model.Flota;
import com.demo.flotaService.service.FlotaService;
import com.demo.flotaService.model.VehiculoFlota;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flota")
public class FlotaController {
    private final FlotaService flotaService;

    public FlotaController(FlotaService flotaService) {
        this.flotaService = flotaService;
    }

    @GetMapping
    public List<VehiculoFlota> listarFlota() {
        return flotaService.listarFlota();
    }

    @PostMapping("/vehiculo-mas-economico")
    public Flota buscarVehiculoMasEconomico(@RequestBody Flota flota) {
        return flotaService.buscarVehiculoMasEconomico(flota);
    }
}
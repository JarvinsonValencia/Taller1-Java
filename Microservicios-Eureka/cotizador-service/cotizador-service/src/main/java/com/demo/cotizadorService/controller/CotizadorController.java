package com.demo.cotizadorService.controller;

import com.demo.cotizadorService.model.Cotizacion;
import com.demo.cotizadorService.service.CotizadorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cotizaciones")
public class CotizadorController {
    private final CotizadorService cotizadorService;

    public CotizadorController(CotizadorService cotizadorService) {
        this.cotizadorService = cotizadorService;
    }

    @PostMapping
    public Cotizacion cotizar(@RequestBody Cotizacion cotizacion) {
        return cotizadorService.cotizar(cotizacion);
    }
}
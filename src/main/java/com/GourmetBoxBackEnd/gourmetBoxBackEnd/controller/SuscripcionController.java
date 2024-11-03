package com.GourmetBoxBackEnd.gourmetBoxBackEnd.controller;

import com.GourmetBoxBackEnd.gourmetBoxBackEnd.model.Suscripcion;
import com.GourmetBoxBackEnd.gourmetBoxBackEnd.service.ISuscripcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SuscripcionController {

    @Autowired
    private ISuscripcionService suscripcionService;

    // Metodo para obtener todas las suscripciones
    @GetMapping("/suscripcion/traer")
    public List<Suscripcion> getSuscripciones() {
        return suscripcionService.getSuscripciones();
    }

}

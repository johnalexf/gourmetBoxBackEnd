package com.GourmetBoxBackEnd.gourmetBoxBackEnd.service;

import com.GourmetBoxBackEnd.gourmetBoxBackEnd.model.Suscripcion;
import com.GourmetBoxBackEnd.gourmetBoxBackEnd.repository.ISuscripcionRepository; // Asegúrate de crear este repositorio
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuscripcionService implements ISuscripcionService {

    @Autowired
    private ISuscripcionRepository suscripcionRepository;

    @Override
    public List<Suscripcion> getSuscripciones() {
        return suscripcionRepository.findAll();
    }



}

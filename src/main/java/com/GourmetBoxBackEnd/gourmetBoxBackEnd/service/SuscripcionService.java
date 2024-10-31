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

    @Override
    public void saveSuscripcion(Suscripcion suscripcion) {
        suscripcionRepository.save(suscripcion);
    }

    @Override
    public Suscripcion findSuscripcionById(Integer id) {
        return suscripcionRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteSuscripcion(Integer id) {
        suscripcionRepository.deleteById(id);
    }

    @Override
    public void editSuscripcion(Integer idOriginal, String nuevoNombrePlan, String nuevoDescripcionPlan, Double nuevoPrecio, String nuevaImgSuscripcion) {
        Suscripcion suscripcion = this.findSuscripcionById(idOriginal);
        if (suscripcion != null) {
            suscripcion.setNombrePlan(nuevoNombrePlan);
            suscripcion.setDescripcionPlan(nuevoDescripcionPlan);
            suscripcion.setPrecio(nuevoPrecio);
            suscripcion.setImgSuscripcion(nuevaImgSuscripcion);
            saveSuscripcion(suscripcion); // Guardar cambios
        }
    }
}

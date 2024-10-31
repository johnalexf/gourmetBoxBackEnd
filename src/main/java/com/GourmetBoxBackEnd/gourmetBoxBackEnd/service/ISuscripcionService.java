package com.GourmetBoxBackEnd.gourmetBoxBackEnd.service;

import com.GourmetBoxBackEnd.gourmetBoxBackEnd.model.Suscripcion;
import java.util.List;

public interface ISuscripcionService {
    // Traer todas las suscripciones
    List<Suscripcion> getSuscripciones();

    // Guardar suscripción
    void saveSuscripcion(Suscripcion suscripcion);

    // Buscar suscripción por ID
    Suscripcion findSuscripcionById(Integer id);

    // Eliminar suscripción
    void deleteSuscripcion(Integer id);

    // Editar suscripción
    void editSuscripcion(Integer idOriginal, String nuevoNombrePlan, String nuevoDescripcionPlan, Double nuevoPrecio, String nuevaImgSuscripcion);
}

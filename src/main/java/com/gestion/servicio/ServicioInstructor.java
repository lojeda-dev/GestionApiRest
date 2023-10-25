package com.gestion.servicio;

import com.gestion.entidad.Instructor;

import java.util.List;

public interface ServicioInstructor {
    List<Instructor> findAll();

    Instructor findById(Long id);

    Instructor save(Instructor instructor);

    void deleteById(Long id);
}

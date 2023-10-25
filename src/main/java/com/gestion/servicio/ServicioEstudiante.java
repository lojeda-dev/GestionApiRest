package com.gestion.servicio;

import com.gestion.entidad.Estudiante;

import java.util.List;

public interface ServicioEstudiante {


    List<Estudiante> findAll();

    Estudiante findById(Long id);

    Estudiante save(Estudiante estudiante);

    void deleteById(Long id);
}

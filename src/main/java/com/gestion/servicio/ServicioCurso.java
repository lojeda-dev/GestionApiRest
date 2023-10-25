package com.gestion.servicio;

import com.gestion.entidad.Curso;

import java.util.List;

public interface ServicioCurso {
    List<Curso> findAll();

    Curso findById(Long id);

    Curso save(Curso curso);

    void deleteById(Long id);
}

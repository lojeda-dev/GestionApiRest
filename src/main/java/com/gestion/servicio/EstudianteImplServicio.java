package com.gestion.servicio;

import com.gestion.entidad.Estudiante;
import com.gestion.repositorio.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteImplServicio implements ServicioEstudiante{

    @Autowired
    private EstudianteRepositorio estudianteRepositorio;

    @Transactional(readOnly = true)
    @Override
    public List<Estudiante> findAll() {
        return estudianteRepositorio.findAll();
    }
    @Transactional(readOnly = true)
    @Override
    public Estudiante findById(Long id) {
        Optional<Estudiante> e = estudianteRepositorio.findById(id);
        Estudiante estudiante = e.get();
        return estudiante;
    }
    @Transactional
    @Override
    public Estudiante save(Estudiante estudiante) {
        return estudianteRepositorio.save(estudiante);
    }
    @Transactional
    @Override
    public void deleteById(Long id) {
        estudianteRepositorio.deleteById(id);
    }
}

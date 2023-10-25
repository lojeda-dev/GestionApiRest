package com.gestion.servicio;

import com.gestion.entidad.Curso;
import com.gestion.repositorio.CursoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CursoImplServicio implements ServicioCurso{

    @Autowired
    private CursoRepositorio cursoRepositorio;

    @Transactional(readOnly = true)
    @Override
    public List<Curso> findAll() {
        return cursoRepositorio.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Curso findById(Long id) {
        Optional<Curso> c = cursoRepositorio.findById(id);
        Curso curso = c.get();
        return curso;
    }
    @Transactional
    @Override
    public Curso save(Curso curso) {
        return cursoRepositorio.save(curso);
    }
    @Transactional
    @Override
    public void deleteById(Long id) {
        cursoRepositorio.deleteById(id);
    }
}

package com.gestion.servicio;

import com.gestion.entidad.Instructor;
import com.gestion.repositorio.InstructorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class InstructorImplServicio implements ServicioInstructor{

    @Autowired
    private InstructorRepositorio instructorRepositorio;

    @Transactional(readOnly = true)
    @Override
    public List<Instructor> findAll() {
        return instructorRepositorio.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Instructor findById(Long id) {
        Optional<Instructor> i = instructorRepositorio.findById(id);
        Instructor instructor = i.get();
        return instructor;
    }
    @Transactional
    @Override
    public Instructor save(Instructor instructor) {
        return instructorRepositorio.save(instructor);
    }
    @Transactional
    @Override
    public void deleteById(Long id) {
        instructorRepositorio.deleteById(id);
    }
}

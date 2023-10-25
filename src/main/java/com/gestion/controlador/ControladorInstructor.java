package com.gestion.controlador;


import com.gestion.entidad.Instructor;
import com.gestion.servicio.InstructorImplServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ControladorInstructor {

    @Autowired
    private InstructorImplServicio service;

    @GetMapping("/instructores")
    @ResponseStatus(HttpStatus.OK)
    public List<Instructor> findAll() {
        return service.findAll();
    }

    @GetMapping("/instructor/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Instructor get(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping("/instructor")
    @ResponseStatus(HttpStatus.CREATED)
    public Instructor create(@RequestBody Instructor i) {
        return service.save(i);
    }

    @PutMapping("/instructor/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Instructor update(@RequestBody Instructor i) {
        return service.save(i);
    }

    @DeleteMapping("/instructor/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }
}

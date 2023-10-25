package com.gestion.controlador;

import com.gestion.entidad.Estudiante;
import com.gestion.servicio.EstudianteImplServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ControladorEstudiante {

    @Autowired
    private EstudianteImplServicio service;

    @GetMapping("/estudiantes")
    @ResponseStatus(HttpStatus.OK)
    public List<Estudiante> findAll() {
        return service.findAll();
    }

    @GetMapping("/estudiante/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Estudiante get(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping("/estudiante")
    @ResponseStatus(HttpStatus.CREATED)
    public Estudiante create(@RequestBody Estudiante e) {
        return service.save(e);
    }

    @PutMapping("/estudiante/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Estudiante update(@RequestBody Estudiante e) {
        return service.save(e);
    }

    @DeleteMapping("/estudiante/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }
}

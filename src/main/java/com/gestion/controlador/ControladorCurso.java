package com.gestion.controlador;


import com.gestion.entidad.Curso;
import com.gestion.servicio.CursoImplServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ControladorCurso {

    @Autowired
    private CursoImplServicio service;

    @GetMapping("/cursos")
    @ResponseStatus(HttpStatus.OK)
    public List<Curso> findAll() {
        return service.findAll();
    }

    @GetMapping("/curso/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Curso get(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping("/curso")
    @ResponseStatus(HttpStatus.CREATED)
    public Curso create(@RequestBody Curso c) {
        return service.save(c);
    }

    @PutMapping("/curso/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Curso update(@RequestBody Curso c) {
        return service.save(c);
    }

    @DeleteMapping("/curso/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }
}

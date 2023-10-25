package com.gestion.controlador;

import com.gestion.entidad.Contacto;
import com.gestion.servicio.ContactoImplServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ControladorContacto {

    @Autowired
    private ContactoImplServicio service;

    @GetMapping("/contactos")
    @ResponseStatus(HttpStatus.OK)
    public List<Contacto> findAll() {
        return service.findAll();
    }

    @GetMapping("/contacto/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Contacto get(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping("/contacto")
    @ResponseStatus(HttpStatus.CREATED)
    public Contacto create(@RequestBody Contacto c) {
        return service.save(c);
    }

    @PutMapping("/contacto/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Contacto update(@RequestBody Contacto c) {
        return service.save(c);
    }

    @DeleteMapping("/contacto/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }
}

package com.gestion.servicio;

import com.gestion.entidad.Contacto;

import java.util.List;

public interface ServicioContacto {

    List<Contacto> findAll();

    Contacto findById(Long id);

    Contacto save(Contacto contacto);

    void deleteById(Long id);
}

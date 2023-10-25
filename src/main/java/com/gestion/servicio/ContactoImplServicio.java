package com.gestion.servicio;

import com.gestion.entidad.Contacto;
import com.gestion.repositorio.ContactoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ContactoImplServicio implements ServicioContacto{

    @Autowired
    private ContactoRepositorio contactoRepositorio;

    @Transactional(readOnly = true)
    @Override
    public List<Contacto> findAll() {
        return contactoRepositorio.findAll();
    }
    @Transactional(readOnly = true)
    @Override
    public Contacto findById(Long id) {
        Optional<Contacto> c = contactoRepositorio.findById(id);
        Contacto contacto = c.get();
        return contacto;
    }
    @Transactional
    @Override
    public Contacto save(Contacto contacto) {
        return contactoRepositorio.save(contacto);
    }
    @Transactional
    @Override
    public void deleteById(Long id) {
        contactoRepositorio.deleteById(id);
    }
}

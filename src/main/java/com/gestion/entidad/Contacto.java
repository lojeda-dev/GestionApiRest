package com.gestion.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity(name = "contactos")
public class Contacto extends Entidad{

    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "telefono", nullable = false)
    private String telefono;
    @Column(name = "direccion", nullable = false)
    private String direccion;
    @Column(name = "ciudad", nullable = false)
    private String ciudad;
    @Column(name = "provincia", nullable = false)
    private String provincia;
    @Column(name = "codigo_postal", nullable = false)
    private String codigoPostal;
}

package com.gestion.entidad;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity(name = "estudiantes")
public class Estudiante extends Entidad{

    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "apellido", nullable = false)
    private String apellido;
    @Column(name = "fecha_nacimiento", nullable = false)
    private String fechaNacimiento;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "id_contacto")
    private Contacto contacto;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(name = "estudiante_curso",
            joinColumns = @JoinColumn(name = "id_estudiante"),
            inverseJoinColumns = @JoinColumn(name = "id_curso"))
    private List<Curso> cursos = new ArrayList<>();

}

package com.gestion.repositorio;

import com.gestion.entidad.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorRepositorio extends JpaRepository<Instructor,Long> {
}

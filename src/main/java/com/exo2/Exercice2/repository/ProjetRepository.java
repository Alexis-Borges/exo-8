package com.exo2.Exercise2.repository;

import com.exo2.Exercise2.entity.Student;
import com.exo2.Exercise2.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProjetRepository extends JpaRepository<Project, Long> {
    @Query("SELECT p.etudiants FROM Project p WHERE p.id = :projetId")
    List<Student> findEtudiantsByProjetId(@Param("projetId") Long projetId);

    Page<Project> findAll(Pageable pageable);
}

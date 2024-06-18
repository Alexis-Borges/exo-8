package com.exo2.Exercise2.repository;

import com.exo2.Exercise2.entity.School;
import com.exo2.Exercise2.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EcoleRepository extends JpaRepository<School, Long> {

    @Query("SELECT e FROM School e LEFT JOIN e.etudiants et where et.nom LIKE %:nomEtudiant%")
    List<School> findEcolesFromNomEtudiant(String nomEtudiant);

    Page<School> findAll(Pageable pageable);
}

package com.exo2.Exercise2.repository;

import com.exo2.Exercise2.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EtudiantRepository extends JpaRepository<Student, Long> {
    Optional<Student> findOneEtudiantByNomAndPrenom(String nom, String prenom);

    Page<Student> findAll(Pageable pageable);

}

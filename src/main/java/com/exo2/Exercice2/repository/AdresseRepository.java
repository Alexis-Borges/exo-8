package com.exo2.Exercise2.repository;

import com.exo2.Exercise2.entity.Address;
import com.exo2.Exercise2.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdresseRepository extends JpaRepository<Address, Long> {
    List<Address> findAdresseByVille(String city);

    Page<Address> findAll(Pageable pageable);
}

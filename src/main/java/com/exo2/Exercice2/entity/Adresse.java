package com.exo2.Exercise2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.BatchSize;

@Entity
@Table(name = "adresse", indexes = @Index(name = "idx_ville", columnList = "city"))
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "adresse_id")
    private Long id;

    @Column(name = "city")
    private String city;
    private String addressComplement;
    private int postalCode;

    @OneToOne(mappedBy = "adresse")
    private School school;
}

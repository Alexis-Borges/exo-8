package com.exo2.Exercise2.mapper;

import com.exo2.Exercise2.dto.EtudiantDto;
import com.exo2.Exercise2.entity.Student;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = ProjetMapper.class)
public interface EtudiantMapper {
    // Single Object
    Student toEntity(EtudiantDto etudiantDto);
    @Mapping(target = "projets.etudiants", ignore = true)
    EtudiantDto toDto(Student etudiant);
    // List of Objects
    List<Student> toEntities(List<EtudiantDto> etudiantsDto);

    List<EtudiantDto> toDtos(List<Student> etudiants);

}

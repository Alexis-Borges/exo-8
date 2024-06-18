package com.exo2.Exercise2.mapper;

import com.exo2.Exercise2.dto.EcoleDto;
import com.exo2.Exercise2.entity.School;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {EtudiantMapper.class})
public interface EcoleMapper {
    // Single Object
    School toEntity(EcoleDto ecoleDto);
    EcoleDto toDto(School school);
    // List of objects
    List<School> toEntities(List<EcoleDto> ecoleDtos);
    List<EcoleDto> toDtos(List<School> ecoles);
}

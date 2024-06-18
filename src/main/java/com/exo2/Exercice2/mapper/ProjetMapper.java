package com.exo2.Exercise2.mapper;

import com.exo2.Exercise2.dto.ProjetDto;
import com.exo2.Exercise2.entity.Project;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProjetMapper {

    ProjetDto toDto(Project projet);

    Project toEntity(ProjetDto projetDto);

    List<ProjetDto> toDtos(List<Project> projets);

    List<Project> toEntities(List<ProjetDto> projetDtos);
}

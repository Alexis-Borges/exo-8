package com.exo2.Exercise2.service;

import com.exo2.Exercise2.dto.EcoleDto;
import com.exo2.Exercise2.entity.School;
import com.exo2.Exercise2.mapper.EcoleMapper;
import com.exo2.Exercise2.repository.EcoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EcoleService {
    private EcoleRepository ecoleRepository;
    private EcoleMapper ecoleMapper;

    public List<EcoleDto> findAll(Pageable pageable) {
        return ecoleRepository.findAll(pageable).map(ecoleMapper::toDto).getContent();
    }

    public EcoleDto findById(long id) {
        return ecoleMapper.toDto(ecoleRepository.findById(id).orElse(null));
    }

    public List<EcoleDto> findByNomEtudiant(String nomEtudiant) {
        return ecoleMapper.toDtos(ecoleRepository.findEcolesFromNomEtudiant(nomEtudiant));
    }

    public EcoleDto save(EcoleDto ecoleDto) {
        School school = ecoleMapper.toEntity(ecoleDto);
        school.getEtudiants().stream().forEach(e -> e.setEcole(school));
        return ecoleMapper.toDto(ecoleRepository.save(school));
    }
}

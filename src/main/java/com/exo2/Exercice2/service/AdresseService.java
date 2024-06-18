package com.exo2.Exercise2.service;

import com.exo2.Exercise2.dto.AdresseDto;
import com.exo2.Exercise2.entity.Address;
import com.exo2.Exercise2.mapper.AdresseMapper;
import com.exo2.Exercise2.repository.AdresseRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AdresseService {
    private AdresseRepository adresseRepository;
    private AdresseMapper adresseMapper;

    public List<AdresseDto> findAll(Pageable pageable)
    {
        return adresseRepository.findAll(pageable).map(adresseMapper::toDto).getContent();
    }

    public AdresseDto findById(Long id)
    {
        return adresseMapper.toDto(adresseRepository.findById(id).get());
    }

    public List<AdresseDto> findByVille(String city) {
        return adresseMapper.toDtos(adresseRepository.findAdresseByVille(city));
    }
}

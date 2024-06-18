package com.exo2.Exercise2.mapper;

import com.exo2.Exercise2.dto.AdresseDto;
import com.exo2.Exercise2.entity.Address;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AdresseMapper {
    AdresseDto toDto(Address adresse);
    Address toEntity(AdresseDto adresseDto);
    List<AdresseDto> toDtos(List<Address> adresses);
    List<Address> toEntities(List<AdresseDto> adressesDto);
}

package com.exo2.Exercise2.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdresseDto {
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;
    private String city;
    private String addressComplement;
    private int postalCode;
}

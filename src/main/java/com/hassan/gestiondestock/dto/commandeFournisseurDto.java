package com.hassan.gestiondestock.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hassan.gestiondestock.model.commandeFournisseurs;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.Instant;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class commandeFournisseurDto {

    private Integer id;

    private String  code;

    private Instant dateComande;

    @JsonIgnore
    private fournisseurDto fournisseurid;

    private List<ligneCommandeFournisseurDto> ligneCommandeFournisseursF;
}

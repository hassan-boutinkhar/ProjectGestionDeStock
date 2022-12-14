package com.hassan.gestiondestock.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hassan.gestiondestock.model.Article;
import com.hassan.gestiondestock.model.commandeFournisseurs;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ligneCommandeFournisseurDto {

    private Integer id;

    private ArticleDto articleIdCF;

    @JsonIgnore
    private commandeFournisseurDto commandeFournisseursFid;
}

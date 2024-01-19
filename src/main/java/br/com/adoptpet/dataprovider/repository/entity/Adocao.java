package br.com.adoptpet.dataprovider.repository.entity;

import br.com.adoptpet.core.domain.shared.AdocaoEnum;

import java.time.LocalDate;
import java.util.List;

public class Adocao {
    private Long id;
    private AdotanteEntity adotanteEntity;
    private List<PetEntity> pets;
    private AdocaoEnum status;
    private LocalDate dataAdocao;
}

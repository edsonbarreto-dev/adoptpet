package br.com.fiap.pettech.pettech.dataprovider.repository.entity;

import br.com.fiap.pettech.pettech.core.shared.AdocaoEnum;

import java.time.LocalDate;
import java.util.List;

public class Adocao {
    private Long id;
    private AdotanteEntity adotanteEntity;
    private List<PetEntity> pets;
    private AdocaoEnum status;
    private LocalDate dataAdocao;
}

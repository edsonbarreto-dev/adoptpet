package br.com.adoptpet.dataprovider.repository.mapper;

import br.com.adoptpet.core.domain.adotante.Adotante;
import br.com.adoptpet.dataprovider.repository.entity.AdotanteEntity;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AdotanteEntityMapper {
    Adotante toAdotante(AdotanteEntity entity);

    @Mapping(target = "endereco", ignore = true)
    AdotanteEntity toAdotanteEntity(Adotante adotante);
}

package br.com.adoptpet.dataprovider.repository.mapper;

import br.com.adoptpet.core.domain.ong.Ong;
import br.com.adoptpet.dataprovider.repository.entity.OngEntity;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OngEntityMapper {
    Ong toOng(OngEntity entity);

    @Mapping(target = "endereco", ignore = true)
    OngEntity toOngEntity(Ong ong);
}

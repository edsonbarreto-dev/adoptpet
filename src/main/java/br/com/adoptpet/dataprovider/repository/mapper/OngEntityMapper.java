package br.com.adoptpet.dataprovider.repository.mapper;

import br.com.adoptpet.core.domain.ong.Ong;
import br.com.adoptpet.dataprovider.repository.entity.OngEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OngEntityMapper {
    Ong toOng(OngEntity ongEntity);

    OngEntity toOngEntity(Ong ong);
}

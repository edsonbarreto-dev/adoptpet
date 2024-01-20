package br.com.adoptpet.dataprovider.repository.mapper;

import br.com.adoptpet.core.domain.ong.Ong;
import br.com.adoptpet.dataprovider.repository.entity.OngEntity;
import br.com.adoptpet.dataprovider.repository.vo.OngVO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OngEntityMapper {
    OngVO toOngVO(OngEntity ongEntity);

    OngEntity toOngEntity(Ong ong);
}

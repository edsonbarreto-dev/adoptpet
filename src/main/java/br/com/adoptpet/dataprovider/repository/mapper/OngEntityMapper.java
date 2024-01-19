package br.com.adoptpet.dataprovider.repository.mapper;

import br.com.adoptpet.core.domain.ong.Ong;
import br.com.adoptpet.dataprovider.repository.entity.OngEntity;
import br.com.adoptpet.dataprovider.repository.vo.OngVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OngEntityMapper {
    OngVO toOngVO(OngEntity ongEntity);

    OngEntity toOngEntity(Ong ong);
}

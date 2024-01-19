package br.com.adoptpet.dataprovider.repository.mapper;

import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.dataprovider.repository.entity.AdotanteEntity;
import br.com.adoptpet.dataprovider.repository.vo.AdotanteVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdotanteEntityMapper {
    AdotanteVO toAdotanteVO(AdotanteEntity adotanteEntity);

    AdotanteEntity toAdotanteEntity(Pessoa adotante);
}

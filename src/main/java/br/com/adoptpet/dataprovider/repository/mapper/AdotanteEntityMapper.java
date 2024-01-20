package br.com.adoptpet.dataprovider.repository.mapper;

import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.dataprovider.repository.entity.AdotanteEntity;
import br.com.adoptpet.dataprovider.repository.vo.AdotanteVO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AdotanteEntityMapper {
    AdotanteVO toAdotanteVO(AdotanteEntity adotanteEntity);
    AdotanteEntity toAdotanteEntity(Pessoa adotante);
}

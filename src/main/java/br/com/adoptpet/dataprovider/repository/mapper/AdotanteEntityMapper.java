package br.com.adoptpet.dataprovider.repository.mapper;

import br.com.adoptpet.core.domain.adotante.Adotante;
import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.dataprovider.repository.entity.AdotanteEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdotanteEntityMapper {
    Adotante toAdotante(AdotanteEntity adotanteEntity);

    AdotanteEntity toAdotanteEntity(Pessoa adotante);
}

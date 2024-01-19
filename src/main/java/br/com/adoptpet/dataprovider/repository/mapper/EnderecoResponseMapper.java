package br.com.adoptpet.dataprovider.repository.mapper;

import br.com.adoptpet.core.domain.shared.Endereco;
import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.dataprovider.repository.entity.AdotanteEntity;
import br.com.adoptpet.dataprovider.repository.entity.EnderecoEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EnderecoResponseMapper {

    Endereco toEndereco(EnderecoEntity adotanteEntity);

    AdotanteEntity toAdotanteEntity(Pessoa adotante);

}

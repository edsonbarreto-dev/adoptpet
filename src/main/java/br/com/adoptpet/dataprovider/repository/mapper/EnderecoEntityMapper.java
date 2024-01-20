package br.com.adoptpet.dataprovider.repository.mapper;

import br.com.adoptpet.core.domain.shared.Endereco;
import br.com.adoptpet.dataprovider.repository.entity.EnderecoEntity;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EnderecoEntityMapper {
    Endereco toEndereco(EnderecoEntity entity);

    EnderecoEntity toEnderecoEntity(Endereco endereco);
}

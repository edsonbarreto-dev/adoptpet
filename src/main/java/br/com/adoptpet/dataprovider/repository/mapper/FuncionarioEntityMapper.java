package br.com.adoptpet.dataprovider.repository.mapper;

import br.com.adoptpet.core.domain.funcionario.Funcionario;
import br.com.adoptpet.dataprovider.repository.entity.FuncionarioEntity;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface FuncionarioEntityMapper {

    Funcionario toFuncionario(FuncionarioEntity entity);

    @Mapping(target = "endereco", ignore = true)
    FuncionarioEntity toFuncionarioEntity(Funcionario funcionario);
}

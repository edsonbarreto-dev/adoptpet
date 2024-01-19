package br.com.adoptpet.dataprovider.repository.mapper;

import br.com.adoptpet.core.domain.funcionario.Funcionario;
import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.dataprovider.repository.entity.FuncionarioEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FuncionarioEntityMapper {

    Funcionario toFuncionario(FuncionarioEntity funcionarioEntity);

    FuncionarioEntity toFuncionarioEntity(Pessoa funcionario);
}

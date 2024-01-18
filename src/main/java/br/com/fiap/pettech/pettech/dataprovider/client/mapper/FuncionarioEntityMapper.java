package br.com.fiap.pettech.pettech.dataprovider.client.mapper;

import br.com.fiap.pettech.pettech.core.domain.funcionario.Funcionario;
import br.com.fiap.pettech.pettech.core.shared.Endereco;
import br.com.fiap.pettech.pettech.dataprovider.client.response.EnderecoResponse;
import br.com.fiap.pettech.pettech.dataprovider.repository.entity.FuncionarioEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FuncionarioEntityMapper {

    Funcionario toFuncionario(FuncionarioEntity funcionarioEntity);

    FuncionarioEntity toFuncionarioEntity(Funcionario funcionario);
}

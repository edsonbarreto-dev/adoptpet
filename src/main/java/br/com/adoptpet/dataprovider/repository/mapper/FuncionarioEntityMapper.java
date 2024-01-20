package br.com.adoptpet.dataprovider.repository.mapper;

import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.dataprovider.repository.entity.FuncionarioEntity;
import br.com.adoptpet.dataprovider.repository.vo.FuncionarioVO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FuncionarioEntityMapper {

    FuncionarioVO toFuncionarioVO(FuncionarioEntity funcionarioEntity);

    FuncionarioEntity toFuncionarioEntity(Pessoa funcionario);
}

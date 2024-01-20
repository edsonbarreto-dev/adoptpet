package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.funcionario.ExcluirFuncionario;
import br.com.adoptpet.core.domain.funcionario.Funcionario;
import br.com.adoptpet.dataprovider.repository.FuncionarioRepository;
import br.com.adoptpet.dataprovider.repository.mapper.FuncionarioEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExcluirFuncionarioImpl implements ExcluirFuncionario {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Autowired
    private FuncionarioEntityMapper funcionarioEntityMapper;

    @Override
    public void delete(Funcionario funcionario) {
        var funcionarioEntity = funcionarioEntityMapper.toFuncionarioEntity(funcionario);
        funcionarioRepository.delete(funcionarioEntity);
    }
}

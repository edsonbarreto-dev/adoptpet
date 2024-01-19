package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.funcionario.AlterarFuncionario;
import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.dataprovider.repository.FuncionarioRepository;
import br.com.adoptpet.dataprovider.repository.mapper.FuncionarioEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AlterarFuncionarioImpl implements AlterarFuncionario {
    @Autowired
    private FuncionarioRepository funcionarioRepository;
    @Autowired
    private FuncionarioEntityMapper funcionarioEntityMapper;

    @Override
    public void update(Pessoa funcionario) {
        var funcionarioEntity = funcionarioEntityMapper.toFuncionarioEntity(funcionario);
        funcionarioRepository.save(funcionarioEntity);
    }
}

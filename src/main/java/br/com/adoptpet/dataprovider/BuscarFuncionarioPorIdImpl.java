package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.domain.dataprovider.funcionario.BuscarFuncionarioPorId;
import br.com.adoptpet.core.domain.funcionario.Funcionario;
import br.com.adoptpet.dataprovider.repository.FuncionarioRepository;
import br.com.adoptpet.dataprovider.repository.entity.FuncionarioEntity;
import br.com.adoptpet.dataprovider.repository.mapper.FuncionarioEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BuscarFuncionarioPorIdImpl implements BuscarFuncionarioPorId {
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Autowired
    private FuncionarioEntityMapper funcionarioEntityMapper;

    @Override
    public Funcionario find(Long id) {
        FuncionarioEntity funcionarioEntity = funcionarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Funcionário não localizado"));

        return funcionarioEntityMapper.toFuncionario(funcionarioEntity);
    }

}

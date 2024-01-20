package br.com.adoptpet.dataprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.adoptpet.core.dataprovider.funcionario.BuscarFuncionario;
import br.com.adoptpet.core.domain.funcionario.Funcionario;
import br.com.adoptpet.dataprovider.repository.FuncionarioRepository;
import br.com.adoptpet.dataprovider.repository.entity.FuncionarioEntity;
import br.com.adoptpet.dataprovider.repository.mapper.FuncionarioEntityMapper;

@Component
public class BuscarFuncionarioImpl implements BuscarFuncionario {
    @Autowired
    private FuncionarioRepository repository;

    @Autowired
    private FuncionarioEntityMapper mapper;

    @Override
    public Funcionario findById(Long id) {
        FuncionarioEntity funcionarioEntity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Funcionário não localizado"));

        return mapper.toFuncionario(funcionarioEntity);
    }

    @Override
    public Funcionario findBy(Funcionario funcionario) {
        FuncionarioEntity funcionarioEntity = repository.findById(funcionario.getId())
                .orElseThrow(() -> new RuntimeException("Funcionário não localizado"));

        return mapper.toFuncionario(funcionarioEntity);
    }
}

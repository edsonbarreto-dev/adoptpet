package br.com.fiap.pettech.pettech.dataprovider;

import br.com.fiap.pettech.pettech.core.domain.dataprovider.funcionario.BuscarFuncionarioPorId;
import br.com.fiap.pettech.pettech.core.domain.funcionario.Funcionario;
import br.com.fiap.pettech.pettech.dataprovider.client.mapper.FuncionarioEntityMapper;
import br.com.fiap.pettech.pettech.dataprovider.repository.FuncionarioRepository;
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
    public Optional<Funcionario> find(Long id) {
        var funcionarioEntity = funcionarioRepository.findById(id);
        return funcionarioEntity.map(entity -> funcionarioEntityMapper.toFuncionario(entity));
    }

}

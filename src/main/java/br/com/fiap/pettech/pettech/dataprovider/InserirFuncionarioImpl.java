package br.com.fiap.pettech.pettech.dataprovider;

import br.com.fiap.pettech.pettech.core.dataprovider.InserirFuncionario;
import br.com.fiap.pettech.pettech.core.domain.funcionario.Funcionario;
import br.com.fiap.pettech.pettech.dataprovider.client.mapper.FuncionarioEntityMapper;
import br.com.fiap.pettech.pettech.dataprovider.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InserirFuncionarioImpl implements InserirFuncionario {

    @Autowired
    private FuncionarioRepository funcionarioRepository;
    @Autowired
    private FuncionarioEntityMapper funcionarioEntityMapper;
    @Override
    public void insert(Funcionario funcionario) {
        var funcionarioEntity = funcionarioEntityMapper.toFuncionarioEntity(funcionario);
        funcionarioRepository.save(funcionarioEntity);
    }
}

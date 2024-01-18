package br.com.fiap.pettech.pettech.dataprovider;

import br.com.fiap.pettech.pettech.core.dataprovider.ExcluirFuncionarioPorId;
import br.com.fiap.pettech.pettech.dataprovider.client.mapper.FuncionarioEntityMapper;
import br.com.fiap.pettech.pettech.dataprovider.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExcluirFuncionarioPorIdImpl implements ExcluirFuncionarioPorId {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Override
    public void delete(Long id) {

        funcionarioRepository.deleteById(id);
    }
}

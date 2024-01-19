package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.funcionario.ExcluirFuncionarioPorId;
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

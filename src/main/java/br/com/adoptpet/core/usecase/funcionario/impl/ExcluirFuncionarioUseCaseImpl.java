package br.com.adoptpet.core.usecase.funcionario.impl;

import br.com.adoptpet.core.dataprovider.funcionario.BuscarFuncionario;
import br.com.adoptpet.core.dataprovider.funcionario.ExcluirFuncionario;
import br.com.adoptpet.core.domain.funcionario.Funcionario;
import br.com.adoptpet.core.usecase.funcionario.ExcluirFuncionarioPorIdUseCase;

public class ExcluirFuncionarioUseCaseImpl implements ExcluirFuncionarioPorIdUseCase {
    private final BuscarFuncionario buscarFuncionario;
    private final ExcluirFuncionario excluirFuncionario;

    public ExcluirFuncionarioUseCaseImpl(
            BuscarFuncionario buscarFuncionario,
            ExcluirFuncionario excluirFuncionario
    ) {
        this.buscarFuncionario = buscarFuncionario;
        this.excluirFuncionario = excluirFuncionario;
    }

    @Override
    public void deleteById(Long id) {
        Funcionario funcionario = buscarFuncionario.findById(id);
        delete(funcionario);
    }

    @Override
    public void delete(Funcionario funcionario) {
        excluirFuncionario.delete(funcionario);
    }
}

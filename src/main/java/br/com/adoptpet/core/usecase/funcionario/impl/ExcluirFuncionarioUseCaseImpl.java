package br.com.adoptpet.core.usecase.funcionario.impl;

import br.com.adoptpet.core.dataprovider.funcionario.ExcluirFuncionario;
import br.com.adoptpet.core.domain.funcionario.Funcionario;
import br.com.adoptpet.core.usecase.funcionario.ExcluirFuncionarioUseCase;

public class ExcluirFuncionarioUseCaseImpl implements ExcluirFuncionarioUseCase {
    private final ExcluirFuncionario excluirFuncionarioPorId;

    public ExcluirFuncionarioUseCaseImpl(
            ExcluirFuncionario excluirFuncionario
    ) {
        this.excluirFuncionarioPorId = excluirFuncionario;
    }

    @Override
    public void delete(Funcionario funcionario) {
        excluirFuncionarioPorId.delete(funcionario);
    }
}

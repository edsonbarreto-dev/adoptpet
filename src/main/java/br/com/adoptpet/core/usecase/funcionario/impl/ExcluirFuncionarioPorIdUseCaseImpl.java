package br.com.adoptpet.core.usecase.funcionario.impl;

import br.com.adoptpet.core.dataprovider.funcionario.ExcluirFuncionarioPorId;
import br.com.adoptpet.core.usecase.funcionario.BuscaFuncionarioPorIdUseCase;
import br.com.adoptpet.core.usecase.funcionario.ExcluirFuncionarioPorIdUseCase;

public class ExcluirFuncionarioPorIdUseCaseImpl implements ExcluirFuncionarioPorIdUseCase {
    private final BuscaFuncionarioPorIdUseCase buscaFuncionarioPorIdUseCase;

    private final ExcluirFuncionarioPorId excluirFuncionarioPorId;

    public ExcluirFuncionarioPorIdUseCaseImpl(
            BuscaFuncionarioPorIdUseCase buscaFuncionarioPorIdUseCase,
            ExcluirFuncionarioPorId excluirFuncionarioPorId
    ) {
        this.buscaFuncionarioPorIdUseCase = buscaFuncionarioPorIdUseCase;
        this.excluirFuncionarioPorId = excluirFuncionarioPorId;
    }

    @Override
    public void delete(Long id) {
        buscaFuncionarioPorIdUseCase.find(id);
        excluirFuncionarioPorId.delete(id);
    }
}

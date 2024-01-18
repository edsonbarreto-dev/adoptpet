package br.com.fiap.pettech.pettech.core.usecase.impl;

import br.com.fiap.pettech.pettech.core.dataprovider.ExcluirFuncionarioPorId;
import br.com.fiap.pettech.pettech.core.usecase.BuscaFuncionarioPorIdUseCase;
import br.com.fiap.pettech.pettech.core.usecase.ExcluirFuncionarioPorIdUseCase;

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

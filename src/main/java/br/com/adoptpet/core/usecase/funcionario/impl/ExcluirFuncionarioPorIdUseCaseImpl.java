package br.com.adoptpet.core.usecase.funcionario.impl;

import br.com.adoptpet.core.dataprovider.funcionario.BuscarFuncionarioPorId;
import br.com.adoptpet.core.dataprovider.funcionario.ExcluirFuncionarioPorId;
import br.com.adoptpet.core.usecase.funcionario.BuscaFuncionarioPorIdUseCase;
import br.com.adoptpet.core.usecase.funcionario.ExcluirFuncionarioPorIdUseCase;

public class ExcluirFuncionarioPorIdUseCaseImpl implements ExcluirFuncionarioPorIdUseCase {
    private final BuscarFuncionarioPorId buscarFuncionarioPorId;
    private final ExcluirFuncionarioPorId excluirFuncionarioPorId;

    public ExcluirFuncionarioPorIdUseCaseImpl(
            BuscarFuncionarioPorId buscarFuncionarioPorId,
            ExcluirFuncionarioPorId excluirFuncionarioPorId
    ) {
        this.buscarFuncionarioPorId = buscarFuncionarioPorId;
        this.excluirFuncionarioPorId = excluirFuncionarioPorId;
    }

    @Override
    public void delete(Long id) {
        buscarFuncionarioPorId.find(id);
        excluirFuncionarioPorId.delete(id);
    }
}

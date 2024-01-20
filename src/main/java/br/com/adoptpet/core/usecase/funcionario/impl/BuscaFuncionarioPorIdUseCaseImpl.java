package br.com.adoptpet.core.usecase.funcionario.impl;

import br.com.adoptpet.core.dataprovider.funcionario.BuscarFuncionarioPorId;
import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.core.usecase.funcionario.BuscaFuncionarioPorIdUseCase;

public class BuscaFuncionarioPorIdUseCaseImpl implements BuscaFuncionarioPorIdUseCase{
    private final BuscarFuncionarioPorId buscarFuncionarioPorId;

    public BuscaFuncionarioPorIdUseCaseImpl(BuscarFuncionarioPorId buscarFuncionarioPorId) {
        this.buscarFuncionarioPorId = buscarFuncionarioPorId;
    }

    @Override
    public Pessoa find(Long id) {
        return buscarFuncionarioPorId.find(id);
    }
}

package br.com.adoptpet.core.usecase.funcionario.impl;

import br.com.adoptpet.core.dataprovider.funcionario.BuscarFuncionario;
import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.core.usecase.funcionario.BuscaFuncionarioPorIdUseCase;

public class BuscaFuncionarioUseCaseImpl implements BuscaFuncionarioPorIdUseCase{
    private final BuscarFuncionario buscarFuncionarioPorId;

    public BuscaFuncionarioUseCaseImpl(BuscarFuncionario buscarFuncionarioPorId) {
        this.buscarFuncionarioPorId = buscarFuncionarioPorId;
    }

    @Override
    public Pessoa find(Long id) {
        return buscarFuncionarioPorId.findById(id);
    }
}

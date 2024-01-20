package br.com.adoptpet.core.usecase.funcionario.impl;

import br.com.adoptpet.core.dataprovider.shared.BuscarPorId;
import br.com.adoptpet.core.domain.funcionario.Funcionario;
import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.core.usecase.funcionario.BuscaFuncionarioPorIdUseCase;

public class BuscaFuncionarioPorIdUseCaseImpl implements BuscaFuncionarioPorIdUseCase{
    private final BuscarPorId<Funcionario> buscarFuncionarioPorId;

    public BuscaFuncionarioPorIdUseCaseImpl(BuscarPorId<Funcionario> buscarFuncionarioPorId) {
        this.buscarFuncionarioPorId = buscarFuncionarioPorId;
    }

    @Override
    public Pessoa find(Long id) {
        return buscarFuncionarioPorId.findById(id);
    }
}

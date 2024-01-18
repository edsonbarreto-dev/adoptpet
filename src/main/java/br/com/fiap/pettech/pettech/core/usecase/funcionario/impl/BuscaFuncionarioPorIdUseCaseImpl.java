package br.com.fiap.pettech.pettech.core.usecase.funcionario.impl;

import br.com.fiap.pettech.pettech.core.dataprovider.funcionario.BuscarFuncionarioPorId;
import br.com.fiap.pettech.pettech.core.domain.funcionario.Funcionario;
import br.com.fiap.pettech.pettech.core.usecase.funcionario.BuscaFuncionarioPorIdUseCase;

public class BuscaFuncionarioPorIdUseCaseImpl implements BuscaFuncionarioPorIdUseCase {
    private final BuscarFuncionarioPorId buscarFuncionarioPorId;

    public BuscaFuncionarioPorIdUseCaseImpl(BuscarFuncionarioPorId buscarFuncionarioPorId) {
        this.buscarFuncionarioPorId = buscarFuncionarioPorId;
    }

    @Override
    public Funcionario find(Long id) {
        return buscarFuncionarioPorId.find(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}

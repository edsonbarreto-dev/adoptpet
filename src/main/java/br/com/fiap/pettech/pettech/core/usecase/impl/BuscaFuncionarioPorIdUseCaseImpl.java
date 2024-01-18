package br.com.fiap.pettech.pettech.core.usecase.impl;

import br.com.fiap.pettech.pettech.core.dataprovider.BuscarFuncionarioPorId;
import br.com.fiap.pettech.pettech.core.domain.funcionario.Funcionario;
import br.com.fiap.pettech.pettech.core.usecase.BuscaFuncionarioPorIdUseCase;

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

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

        Pessoa funcionario = buscarFuncionarioPorId.find(id);
        if (funcionario == null) {
            throw new RuntimeException("Funcionário não encontrado");
        }
        return funcionario;
       // return buscarFuncionarioPorId.find(id)
       //         .orElseThrow(() -> new RuntimeException("Funcionário não encontrado"));
    }
}

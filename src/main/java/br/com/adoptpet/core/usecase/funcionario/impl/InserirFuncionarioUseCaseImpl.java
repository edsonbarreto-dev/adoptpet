package br.com.adoptpet.core.usecase.funcionario.impl;

import br.com.adoptpet.core.dataprovider.shared.BuscarEnderecoPorCep;
import br.com.adoptpet.core.dataprovider.funcionario.InserirFuncionario;
import br.com.adoptpet.core.domain.funcionario.Funcionario;
import br.com.adoptpet.core.usecase.funcionario.InserirFuncionarioUseCase;

public class InserirFuncionarioUseCaseImpl implements InserirFuncionarioUseCase {
    private final BuscarEnderecoPorCep buscarEnderecoPorCep;
    private final InserirFuncionario inserirFuncionario;

    public InserirFuncionarioUseCaseImpl(
            BuscarEnderecoPorCep buscarEnderecoPorCep,
            InserirFuncionario inserirFuncionario
    ) {
        this.buscarEnderecoPorCep = buscarEnderecoPorCep;
        this.inserirFuncionario = inserirFuncionario;
    }

    @Override
    public void insert(Funcionario funcionario, String cep) {
        var endereco = buscarEnderecoPorCep.find(cep);
        funcionario.setEndereco(endereco);
        inserirFuncionario.insert(funcionario);
    }
}

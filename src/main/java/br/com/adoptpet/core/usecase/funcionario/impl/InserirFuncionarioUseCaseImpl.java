package br.com.adoptpet.core.usecase.funcionario.impl;

import br.com.adoptpet.core.dataprovider.BuscarCep;
import br.com.adoptpet.core.dataprovider.funcionario.InserirFuncionario;
import br.com.adoptpet.core.domain.funcionario.Funcionario;
import br.com.adoptpet.core.usecase.funcionario.InserirFuncionarioUseCase;

public class InserirFuncionarioUseCaseImpl implements InserirFuncionarioUseCase {

    private final BuscarCep buscarCep;

    private final InserirFuncionario inserirFuncionario;



    public InserirFuncionarioUseCaseImpl(
            BuscarCep buscarCep,
            InserirFuncionario inserirFuncionario
    ) {

        this.buscarCep = buscarCep;
        this.inserirFuncionario = inserirFuncionario;
    }

    @Override
    public void insert(Funcionario funcionario, String cep) {
        var endereco = buscarCep.find(cep);
        funcionario.setEndereco(endereco);
        inserirFuncionario.insert(funcionario);

    }

}

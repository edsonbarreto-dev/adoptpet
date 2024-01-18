package br.com.fiap.pettech.pettech.core.usecase.impl;

import br.com.fiap.pettech.pettech.core.dataprovider.AlterarFuncionario;
import br.com.fiap.pettech.pettech.core.dataprovider.BuscarCep;
import br.com.fiap.pettech.pettech.core.dataprovider.InserirFuncionario;
import br.com.fiap.pettech.pettech.core.domain.funcionario.Funcionario;
import br.com.fiap.pettech.pettech.core.usecase.BuscaFuncionarioPorIdUseCase;
import br.com.fiap.pettech.pettech.core.usecase.InserirFuncionarioUseCase;

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

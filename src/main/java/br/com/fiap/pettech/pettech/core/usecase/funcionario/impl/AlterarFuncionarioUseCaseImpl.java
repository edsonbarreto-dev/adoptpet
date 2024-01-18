package br.com.fiap.pettech.pettech.core.usecase.funcionario.impl;

import br.com.fiap.pettech.pettech.core.dataprovider.funcionario.AlterarFuncionario;
import br.com.fiap.pettech.pettech.core.dataprovider.BuscarCep;
import br.com.fiap.pettech.pettech.core.domain.funcionario.Funcionario;
import br.com.fiap.pettech.pettech.core.usecase.funcionario.AlterarFuncionarioUseCase;
import br.com.fiap.pettech.pettech.core.usecase.funcionario.BuscaFuncionarioPorIdUseCase;

public class AlterarFuncionarioUseCaseImpl implements AlterarFuncionarioUseCase {

    private final BuscaFuncionarioPorIdUseCase buscaFuncionarioPorIdUseCase;
    private final BuscarCep buscarCep;

    private final AlterarFuncionario alterarFuncionario;



    public AlterarFuncionarioUseCaseImpl(
            BuscaFuncionarioPorIdUseCase buscaFuncionarioPorIdUseCase,
            BuscarCep buscarCep,
            AlterarFuncionario alterarFuncionario
    ) {
        this.buscaFuncionarioPorIdUseCase = buscaFuncionarioPorIdUseCase;
        this.buscarCep = buscarCep;
        this.alterarFuncionario = alterarFuncionario;
    }

    @Override
    public void update(Funcionario funcionario, String cep) {
        buscaFuncionarioPorIdUseCase.find(funcionario.getId());
        var endereco = buscarCep.find(cep);
        funcionario.setEndereco(endereco);
        alterarFuncionario.update(funcionario);

    }
}

package br.com.adoptpet.core.usecase.funcionario.impl;

import br.com.adoptpet.core.dataprovider.funcionario.AlterarFuncionario;
import br.com.adoptpet.core.dataprovider.BuscarCep;
import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.core.usecase.funcionario.AlterarFuncionarioUseCase;
import br.com.adoptpet.core.usecase.funcionario.BuscaFuncionarioPorIdUseCase;

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
    public void update(Pessoa funcionario, String cep) {
        buscaFuncionarioPorIdUseCase.find(funcionario.getId());
        var endereco = buscarCep.find(cep);
        funcionario.setEndereco(endereco);
        alterarFuncionario.update(funcionario);

    }
}

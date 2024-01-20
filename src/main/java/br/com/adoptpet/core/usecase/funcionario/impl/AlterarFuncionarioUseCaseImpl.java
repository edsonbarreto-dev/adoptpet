package br.com.adoptpet.core.usecase.funcionario.impl;

import br.com.adoptpet.core.dataprovider.funcionario.AlterarFuncionario;
import br.com.adoptpet.core.dataprovider.BuscarEnderecoPorCep;
import br.com.adoptpet.core.dataprovider.funcionario.BuscarFuncionarioPorId;
import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.core.usecase.funcionario.AlterarFuncionarioUseCase;
import br.com.adoptpet.dataprovider.BuscarFuncionarioPorIdImpl;

public class AlterarFuncionarioUseCaseImpl implements AlterarFuncionarioUseCase {
    private final BuscarFuncionarioPorId buscaFuncionarioPorId;
    private final BuscarEnderecoPorCep buscarCep;
    private final AlterarFuncionario alterarFuncionario;

    public AlterarFuncionarioUseCaseImpl(
            BuscarFuncionarioPorId buscaFuncionarioPorId,
            BuscarEnderecoPorCep buscarCep,
            AlterarFuncionario alterarFuncionario
    ) {
        this.buscaFuncionarioPorId = buscaFuncionarioPorId;
        this.buscarCep = buscarCep;
        this.alterarFuncionario = alterarFuncionario;
    }

    @Override
    public void update(Pessoa funcionario, String cep) {
        buscaFuncionarioPorId.find(funcionario.getId());
        var endereco = buscarCep.find(cep);
        funcionario.setEndereco(endereco);
        alterarFuncionario.update(funcionario);

    }
}

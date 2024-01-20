package br.com.adoptpet.core.usecase.funcionario.impl;

import br.com.adoptpet.core.dataprovider.funcionario.AlterarFuncionario;
import br.com.adoptpet.core.dataprovider.BuscarEnderecoPorCep;
import br.com.adoptpet.core.dataprovider.funcionario.BuscarFuncionario;
import br.com.adoptpet.core.domain.funcionario.Funcionario;
import br.com.adoptpet.core.usecase.funcionario.AlterarFuncionarioUseCase;

public class AlterarFuncionarioUseCaseImpl implements AlterarFuncionarioUseCase {
    private final BuscarFuncionario buscaFuncionarioPorId;
    private final BuscarEnderecoPorCep buscarCep;
    private final AlterarFuncionario alterarFuncionario;

    public AlterarFuncionarioUseCaseImpl(
            BuscarFuncionario buscaFuncionarioPorId,
            BuscarEnderecoPorCep buscarCep,
            AlterarFuncionario alterarFuncionario
    ) {
        this.buscaFuncionarioPorId = buscaFuncionarioPorId;
        this.buscarCep = buscarCep;
        this.alterarFuncionario = alterarFuncionario;
    }

    @Override
    public void update(Funcionario funcionario, String cep) {
        buscaFuncionarioPorId.findBy(funcionario);
        var endereco = buscarCep.find(cep);
        funcionario.setEndereco(endereco);
        alterarFuncionario.update(funcionario);

    }
}

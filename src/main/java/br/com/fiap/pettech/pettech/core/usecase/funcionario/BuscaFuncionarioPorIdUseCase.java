package br.com.fiap.pettech.pettech.core.usecase.funcionario;

import br.com.fiap.pettech.pettech.core.domain.funcionario.Funcionario;

public interface BuscaFuncionarioPorIdUseCase {

    Funcionario find(final Long id);

}

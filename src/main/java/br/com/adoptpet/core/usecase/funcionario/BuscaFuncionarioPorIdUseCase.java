package br.com.adoptpet.core.usecase.funcionario;

import br.com.adoptpet.core.domain.funcionario.Funcionario;

public interface BuscaFuncionarioPorIdUseCase {

    Funcionario find(final Long id);

}

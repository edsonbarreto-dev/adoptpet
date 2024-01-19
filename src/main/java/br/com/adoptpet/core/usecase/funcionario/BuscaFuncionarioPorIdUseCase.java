package br.com.adoptpet.core.usecase.funcionario;

import br.com.adoptpet.core.domain.funcionario.Funcionario;
import br.com.adoptpet.core.domain.shared.Pessoa;

public interface BuscaFuncionarioPorIdUseCase{

    Pessoa find(final Long id);

}

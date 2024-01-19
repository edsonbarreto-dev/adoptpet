package br.com.adoptpet.core.usecase.funcionario;

import br.com.adoptpet.core.domain.shared.Pessoa;

public interface AlterarFuncionarioUseCase {

    void update(Pessoa funcionario, String cep);
}

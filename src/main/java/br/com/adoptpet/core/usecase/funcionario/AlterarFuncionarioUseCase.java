package br.com.adoptpet.core.usecase.funcionario;

import br.com.adoptpet.core.domain.funcionario.Funcionario;

public interface AlterarFuncionarioUseCase {

    void update(Funcionario funcionario, String cep);
}

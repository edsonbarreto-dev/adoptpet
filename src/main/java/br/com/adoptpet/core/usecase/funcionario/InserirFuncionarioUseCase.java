package br.com.adoptpet.core.usecase.funcionario;

import br.com.adoptpet.core.domain.funcionario.Funcionario;

public interface InserirFuncionarioUseCase {

    void insert(Funcionario funcionario, String cep);

}

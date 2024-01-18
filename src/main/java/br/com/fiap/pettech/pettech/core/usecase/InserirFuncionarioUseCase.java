package br.com.fiap.pettech.pettech.core.usecase;

import br.com.fiap.pettech.pettech.core.domain.funcionario.Funcionario;

public interface InserirFuncionarioUseCase {

    void insert(Funcionario funcionario, String cep);

}

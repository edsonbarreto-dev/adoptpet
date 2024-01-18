package br.com.fiap.pettech.pettech.core.usecase;

import br.com.fiap.pettech.pettech.core.domain.funcionario.Funcionario;

public interface AlterarFuncionarioUseCase {

    void update(Funcionario funcionario, String cep);
}

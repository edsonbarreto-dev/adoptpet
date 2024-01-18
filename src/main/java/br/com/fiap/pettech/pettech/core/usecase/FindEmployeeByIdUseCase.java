package br.com.fiap.pettech.pettech.core.usecase;

import br.com.fiap.pettech.pettech.core.domain.funcionario.Funcionario;

public interface FindEmployeeByIdUseCase {

    Funcionario find(final String id);

}

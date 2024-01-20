package br.com.adoptpet.core.usecase.funcionario;

import br.com.adoptpet.core.domain.funcionario.Funcionario;

public interface ExcluirFuncionarioPorIdUseCase {
    void deleteById(final Long id);
    void delete(Funcionario funcionario);
}

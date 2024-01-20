package br.com.adoptpet.core.usecase.adotante.impl;

import br.com.adoptpet.core.domain.adotante.Adotante;
import br.com.adoptpet.core.usecase.adotante.ExcluirAdotanteUseCase;

public class ExcluirAdotanteUseCaseImpl implements ExcluirAdotanteUseCase {
    private final ExcluirAdotanteUseCase excluirAdotanteUseCase;

    public ExcluirAdotanteUseCaseImpl(ExcluirAdotanteUseCase excluirAdotanteUseCase) {
        this.excluirAdotanteUseCase = excluirAdotanteUseCase;
    }

    @Override
    public void delete(Adotante adotante) {
        excluirAdotanteUseCase.delete(adotante);
    }
}

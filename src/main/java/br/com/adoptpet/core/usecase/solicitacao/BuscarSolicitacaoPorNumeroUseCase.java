package br.com.adoptpet.core.usecase.solicitacao;

public interface BuscarSolicitacaoPorNumeroUseCase<T> {
    T findByNumero(final Long numero);
}

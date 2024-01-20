package br.com.adoptpet.core.dataprovider.solicitacao;

public interface BuscarSolicitacaoPorNumero<T> {
    T find(final Long id);
}

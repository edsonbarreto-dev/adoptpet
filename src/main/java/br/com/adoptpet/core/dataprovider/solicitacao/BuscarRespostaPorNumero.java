package br.com.adoptpet.core.dataprovider.solicitacao;

public interface BuscarRespostaPorNumero<T> {
    T findById(final Long id);
}

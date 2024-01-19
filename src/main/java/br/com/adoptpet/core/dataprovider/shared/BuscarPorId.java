package br.com.adoptpet.core.dataprovider.shared;

public interface BuscarPorId<T> {
    T find(final Long id);
}

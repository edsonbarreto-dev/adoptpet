package br.com.adoptpet.core.dataprovider.shared;

public interface BuscarPorId<T> {
    T findById(final Long id);
}

package br.com.adoptpet.core.dataprovider.ong;

public interface BuscarOngPorId<T> {
    T find(final Long id);
}

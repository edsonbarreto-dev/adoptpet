package br.com.adoptpet.core.dataprovider.ong;

import br.com.adoptpet.core.domain.ong.Ong;

public interface BuscarOngPorId {
    Ong find(final Long id);
}

package br.com.adoptpet.core.domain.dataprovider.adotante;

import br.com.adoptpet.core.domain.adotante.Adotante;

import java.util.Optional;

public interface FindAdopterById {
    Optional<Adotante> find(final String id);
}

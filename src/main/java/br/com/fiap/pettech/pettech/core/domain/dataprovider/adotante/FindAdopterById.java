package br.com.fiap.pettech.pettech.core.domain.dataprovider.adotante;

import br.com.fiap.pettech.pettech.core.domain.adotante.Adotante;

import java.util.Optional;

public interface FindAdopterById {

    Optional<Adotante> find(final String id);
}

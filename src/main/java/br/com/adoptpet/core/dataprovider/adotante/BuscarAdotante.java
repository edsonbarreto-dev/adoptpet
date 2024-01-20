package br.com.adoptpet.core.dataprovider.adotante;

import br.com.adoptpet.core.domain.adotante.Adotante;

public interface BuscarAdotante {
   Adotante findBy(Adotante adotante);
   Adotante findById(final Long id) throws Exception;
}

package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.adotante.InserirAdotante;
import br.com.adoptpet.core.domain.adotante.Adotante;
import br.com.adoptpet.dataprovider.repository.AdotanteRepository;
import br.com.adoptpet.dataprovider.repository.mapper.AdotanteEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InserirAdotanteImpl implements InserirAdotante {

    @Autowired
    private AdotanteRepository repository;

    @Autowired
    private AdotanteEntityMapper mapper;

    @Override
    public void insert(Adotante adotante) {
        repository.save(mapper.toAdotanteEntity(adotante));
    }
}

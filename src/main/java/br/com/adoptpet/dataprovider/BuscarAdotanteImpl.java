package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.adotante.BuscarAdotante;
import br.com.adoptpet.core.domain.adotante.Adotante;
import br.com.adoptpet.dataprovider.repository.AdotanteRepository;
import br.com.adoptpet.dataprovider.repository.entity.AdotanteEntity;
import br.com.adoptpet.dataprovider.repository.mapper.AdotanteEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BuscarAdotanteImpl implements BuscarAdotante {
    @Autowired
    private AdotanteRepository repository;

    @Autowired
    private AdotanteEntityMapper mapper;

    @Override
    public Adotante findBy(Adotante adotante) {
        AdotanteEntity entity = repository.findBy(adotante);
        return mapper.toAdotante(entity);
    }

    @Override
    public Adotante findById(Long id) throws Exception {
        AdotanteEntity entity = repository.findById(id)
                .orElseThrow(() -> new Exception("O adotante não foi localizado!"));
        return mapper.toAdotante(entity);
    }
}

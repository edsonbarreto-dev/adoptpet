package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.adotante.AlterarAdotante;
import br.com.adoptpet.core.domain.adotante.Adotante;
import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.dataprovider.repository.AdotanteRepository;
import br.com.adoptpet.dataprovider.repository.mapper.AdotanteEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AlterarAdotanteImpl implements AlterarAdotante {
    @Autowired
    private AdotanteRepository adotanteRepository;

    @Autowired
    private AdotanteEntityMapper adotanteEntityMapper;

    @Override
    public void update(Adotante adotante) {
        var adotanteEntity = adotanteEntityMapper.toAdotanteEntity(adotante);
        adotanteRepository.save(adotanteEntity);
    }
}

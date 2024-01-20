package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.adotante.BuscarAdotantePorId;
import br.com.adoptpet.core.domain.adotante.Adotante;
import br.com.adoptpet.dataprovider.repository.AdotanteRepository;
import br.com.adoptpet.dataprovider.repository.mapper.AdotanteEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BuscarAdotantePorIdImpl implements BuscarAdotantePorId {
    @Autowired
    private AdotanteRepository adotanteRepository;

    @Autowired
    private AdotanteEntityMapper adotanteEntityMapper;

    @Override
    public Adotante findById(Long id) {
        return adotanteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Adotante não encontrado"));
    }
}

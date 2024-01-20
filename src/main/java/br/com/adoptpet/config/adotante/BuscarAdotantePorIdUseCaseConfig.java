package br.com.adoptpet.config.adotante;

import br.com.adoptpet.core.dataprovider.shared.BuscarPorId;
import br.com.adoptpet.core.domain.adotante.Adotante;
import br.com.adoptpet.core.usecase.adotante.impl.BuscarAdotantePorIdUseCaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuscarAdotantePorIdUseCaseConfig {

    @Autowired
    BuscarPorId<Adotante> buscarAdotantePorId;

    @Bean
    public BuscarAdotantePorIdUseCaseImpl buscarAdotantePorIdUseCaseImpl(BuscarPorId<Adotante> buscarAdotantePorId) {
        this.buscarAdotantePorId = buscarAdotantePorId;
        return new BuscarAdotantePorIdUseCaseImpl(buscarAdotantePorId);
    }

}

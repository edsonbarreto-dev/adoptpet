package br.com.adoptpet.config.adotante;

import br.com.adoptpet.core.usecase.adotante.impl.BuscarAdotantePorIdUseCaseImpl;
import br.com.adoptpet.dataprovider.BuscarAdotantePorIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuscarAdotantePorIdUseCaseConfig {

    @Bean
    public BuscarAdotantePorIdUseCaseImpl buscarAdotantePorId(BuscarAdotantePorIdImpl buscarAdotantePorId) {
        return new BuscarAdotantePorIdUseCaseImpl(buscarAdotantePorId);
    }

}

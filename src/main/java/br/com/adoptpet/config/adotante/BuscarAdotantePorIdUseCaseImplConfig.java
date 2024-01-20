package br.com.adoptpet.config.adotante;

import br.com.adoptpet.core.usecase.adotante.impl.BuscarAdotantePorIdUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuscarAdotantePorIdUseCaseImplConfig {

    @Bean
    public BuscarAdotantePorIdUseCaseImpl buscarAdotantePorIdUseCaseImpl(
            BuscarAdotantePorIdImpl buscarAdotantePorId
    ) {
        return new BuscarAdotantePorIdUseCaseImpl(buscarAdotantePorId);
    }

}

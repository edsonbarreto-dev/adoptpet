package br.com.adoptpet.config.pet;

import br.com.adoptpet.core.usecase.ong.impl.BuscarOngUseCaseImpl;
import br.com.adoptpet.dataprovider.BuscarOngPorIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuscarOngUseCaseImplConfig {
    @Bean
    public BuscarOngUseCaseImpl ongPorIdUseCase(BuscarOngPorIdImpl buscarOngPorIdImpl) {
        return new BuscarOngUseCaseImpl(buscarOngPorIdImpl);
    }
}

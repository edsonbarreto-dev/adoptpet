package br.com.adoptpet.config.ong;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.adoptpet.dataprovider.BuscarOngPorIdImpl;
import br.com.adoptpet.core.usecase.ong.impl.BuscarOngUseCaseImpl;

@Configuration
public class BuscarOngUseCaseImplConfig {
    @Bean
    public BuscarOngUseCaseImpl ongPorIdUseCase(BuscarOngPorIdImpl buscarOngPorIdImpl) {
        return new BuscarOngUseCaseImpl(buscarOngPorIdImpl);
    }
}

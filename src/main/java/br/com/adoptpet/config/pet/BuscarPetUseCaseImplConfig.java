package br.com.adoptpet.config.pet;

import br.com.adoptpet.core.usecase.pet.impl.BuscarPetUseCaseImpl;
import br.com.adoptpet.dataprovider.BuscarPetPorIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuscarPetUseCaseImplConfig {
    @Bean
    public BuscarPetUseCaseImpl buscarPetUseCaseImpl(BuscarPetPorIdImpl busca) {
        return new BuscarPetUseCaseImpl(busca);
    }
}

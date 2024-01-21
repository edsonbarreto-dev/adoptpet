package br.com.adoptpet.config.pet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.adoptpet.core.usecase.pet.impl.InserirPetUseCaseImpl;
import br.com.adoptpet.dataprovider.InserirPetImpl;

@Configuration
public class InserirPetUseCaseImplConfig {
     @Bean
    public InserirPetUseCaseImpl inserirPetUseCaseImpl(InserirPetImpl inserirPetImpl) {
        return new InserirPetUseCaseImpl(inserirPetImpl);
    }
}

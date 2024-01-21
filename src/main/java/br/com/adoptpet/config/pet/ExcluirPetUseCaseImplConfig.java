package br.com.adoptpet.config.pet;

import br.com.adoptpet.core.usecase.ong.impl.ExcluirOngUseCaseImpl;
import br.com.adoptpet.dataprovider.ExcluirOngImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExcluirPetUseCaseImplConfig {
     @Bean
    public ExcluirOngUseCaseImpl excluirOngUseCase(ExcluirOngImpl excluirOngImpl) {
        return new ExcluirOngUseCaseImpl(excluirOngImpl);
    }
}

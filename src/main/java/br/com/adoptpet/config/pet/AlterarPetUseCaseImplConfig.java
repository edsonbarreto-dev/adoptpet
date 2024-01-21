package br.com.adoptpet.config.pet;

import br.com.adoptpet.core.dataprovider.pet.AlterarPet;
import br.com.adoptpet.core.dataprovider.pet.BuscarPet;
import br.com.adoptpet.core.usecase.pet.impl.AlterarPetUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AlterarPetUseCaseImplConfig {
    @Bean
    public AlterarPetUseCaseImpl alterarPetUseCaseImpl(
            BuscarPet buscarPet, AlterarPet alterarPet
    ) {
        return new AlterarPetUseCaseImpl(buscarPet, alterarPet);
    }
}

package br.com.adoptpet.config.adotante;

import br.com.adoptpet.dataprovider.InserirAdotanteImpl;
import br.com.adoptpet.dataprovider.BuscarEnderecoPorCepImpl;
import br.com.adoptpet.core.usecase.adotante.impl.BuscarAdotanteUseCaseImpl;
import br.com.adoptpet.core.usecase.adotante.impl.InserirAdotanteUseCaseImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InserirAdotanteUseCaseImplConfig {

    @Bean
    public InserirAdotanteUseCaseImpl inserirAdotanteUseCaseImpl(
            BuscarAdotanteUseCaseImpl buscarAdotantePorIdUseCase,
            BuscarEnderecoPorCepImpl buscarEnderecoPorCep,
            InserirAdotanteImpl inserirAdotanteUseCase
    ) {
        return new InserirAdotanteUseCaseImpl(buscarAdotantePorIdUseCase, buscarEnderecoPorCep, inserirAdotanteUseCase);
    }

}

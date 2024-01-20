package br.com.adoptpet.config.adotante;

import br.com.adoptpet.core.usecase.adotante.impl.BuscarAdotanteUseCaseImpl;
import br.com.adoptpet.core.usecase.adotante.impl.InserirAdotanteUseCaseImpl;
import br.com.adoptpet.dataprovider.BuscarEnderecoPorCepImpl;
import br.com.adoptpet.dataprovider.InserirAdotanteImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InserirAdotanteUseCaseImplConfig {

    @Bean
    public InserirAdotanteUseCaseImpl buscarAdotantePorIdUseCaseImpl(
            BuscarAdotanteUseCaseImpl buscaAdotantePorIdUseCase,
            BuscarEnderecoPorCepImpl buscarEnderecoPorCep,
            InserirAdotanteImpl inserirAdotanteUseCase
    ) {
        return new InserirAdotanteUseCaseImpl(buscaAdotantePorIdUseCase, buscarEnderecoPorCep, inserirAdotanteUseCase);
    }

}

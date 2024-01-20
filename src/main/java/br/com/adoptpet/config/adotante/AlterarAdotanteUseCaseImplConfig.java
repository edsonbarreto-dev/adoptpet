package br.com.adoptpet.config.adotante;

import br.com.adoptpet.core.usecase.adotante.impl.BuscarAdotantePorIdUseCaseImpl;
import br.com.adoptpet.dataprovider.AlterarAdotanteImpl;
import br.com.adoptpet.dataprovider.BuscarEnderecoPorCepImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.adoptpet.core.usecase.adotante.impl.AlterarAdotanteUseCaseImpl;

@Configuration
public class AlterarAdotanteUseCaseImplConfig {
    @Bean
    public AlterarAdotanteUseCaseImpl alterarAdotanteUseCase(
            BuscarAdotantePorIdUseCaseImpl buscarAdotantePorId,
            BuscarEnderecoPorCepImpl buscarCep,
            AlterarAdotanteImpl alterarAdotante
    ) {
        return new AlterarAdotanteUseCaseImpl(buscarAdotantePorId, buscarCep, alterarAdotante);
    }
}

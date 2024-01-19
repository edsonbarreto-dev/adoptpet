package br.com.adoptpet.config.adotante;

import br.com.adoptpet.core.dataprovider.BuscarCep;
import br.com.adoptpet.core.dataprovider.adotante.AlterarAdotante;
import br.com.adoptpet.core.usecase.adotante.impl.AlterarAdotanteUseCaseImpl;
import br.com.adoptpet.core.usecase.adotante.impl.BuscarAdotantePorIdUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AlterarAdotanteConfig {
    @Bean
    public AlterarAdotanteUseCaseImpl alterarAdotanteUseCase(
            BuscarAdotantePorIdUseCaseImpl buscarAdotantePorId,
            BuscarCep buscarCep,
            AlterarAdotante alterarAdotante
    ) {
        return new AlterarAdotanteUseCaseImpl(buscarAdotantePorId, buscarCep, alterarAdotante);
    }
}

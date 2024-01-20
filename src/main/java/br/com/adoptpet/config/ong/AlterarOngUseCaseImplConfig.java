package br.com.adoptpet.config.ong;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.adoptpet.core.dataprovider.ong.BuscarOngPorId;
import br.com.adoptpet.core.usecase.ong.impl.AlterarOngUseCaseImpl;
import br.com.adoptpet.dataprovider.AlterarOngImpl;

@Configuration
public class AlterarOngUseCaseImplConfig {
    @Bean
    public AlterarOngUseCaseImpl alterarOngUseCase(
            BuscarOngPorId buscarOngPorId,
            AlterarOngImpl alterarOng
    ) {
        return new AlterarOngUseCaseImpl(buscarOngPorId, alterarOng);
    }
}

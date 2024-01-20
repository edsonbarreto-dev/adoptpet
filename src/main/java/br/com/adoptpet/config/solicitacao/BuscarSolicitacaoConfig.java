package br.com.adoptpet.config.solicitacao;

import br.com.adoptpet.core.usecase.solicitacao.impl.BuscarSolicitacaoPorNumeroUseCaseImpl;
import br.com.adoptpet.dataprovider.BuscarSolicitacaoPorNumeroImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuscarSolicitacaoConfig {
    @Bean
    public BuscarSolicitacaoPorNumeroUseCaseImpl solicitacaoUseCase(
            BuscarSolicitacaoPorNumeroImpl buscarSolicitacaoPorNumero) {
        return new BuscarSolicitacaoPorNumeroUseCaseImpl( buscarSolicitacaoPorNumero);
    }
}

package br.com.adoptpet.config.solicitacao;

import br.com.adoptpet.core.usecase.solicitacao.impl.AlterarSolicitacaoUseCaseImpl;
import br.com.adoptpet.core.usecase.solicitacao.impl.BuscarSolicitacaoPorNumeroUseCaseImpl;
import br.com.adoptpet.dataprovider.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AlterarSolicitacaoConfig {

    @Bean
    public AlterarSolicitacaoUseCaseImpl alterarSolicitacaoUseCase(
            BuscarSolicitacaoPorNumeroUseCaseImpl buscarSolicitacaoPorNumero,
            AlterarSolicitacaoImpl alterarSolicitacao
    ) {
        return new AlterarSolicitacaoUseCaseImpl(buscarSolicitacaoPorNumero, alterarSolicitacao);
    }
}

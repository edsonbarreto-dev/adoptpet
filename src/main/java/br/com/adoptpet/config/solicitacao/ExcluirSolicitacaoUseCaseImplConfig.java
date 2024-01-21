package br.com.adoptpet.config.solicitacao;

import br.com.adoptpet.core.usecase.solicitacao_adocao.impl.ExcluirSolicitacaoAdocaoUseCaseImpl;
import br.com.adoptpet.dataprovider.ExcluirSolicitacaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExcluirSolicitacaoUseCaseImplConfig {

    @Bean
    public ExcluirSolicitacaoAdocaoUseCaseImpl excluirSolicitacaoAdocaoUseCaseImpl(
            ExcluirSolicitacaoImpl excluirSolicitacaoImpl
    ) {
        return new ExcluirSolicitacaoAdocaoUseCaseImpl(excluirSolicitacaoImpl);
    }
}

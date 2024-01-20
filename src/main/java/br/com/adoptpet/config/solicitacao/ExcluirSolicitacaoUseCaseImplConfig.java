package br.com.adoptpet.config.solicitacao;

import br.com.adoptpet.core.usecase.solicitacao.impl.ExcluirSolicitacaoUseCaseImpl;
import br.com.adoptpet.dataprovider.ExcluirSolicitacaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExcluirSolicitacaoUseCaseImplConfig {

    @Bean
    public ExcluirSolicitacaoUseCaseImpl alterarSolicitacaoUseCase(
            ExcluirSolicitacaoImpl excluirSolicitacaoImpl
    ) {
        return new ExcluirSolicitacaoUseCaseImpl(excluirSolicitacaoImpl);
    }
}

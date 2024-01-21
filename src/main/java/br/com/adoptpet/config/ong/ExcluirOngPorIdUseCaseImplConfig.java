package br.com.adoptpet.config.ong;

import br.com.adoptpet.core.usecase.ong.impl.ExcluirOngUseCaseImpl;
import br.com.adoptpet.dataprovider.ExcluirOngImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExcluirOngPorIdUseCaseImplConfig {
     @Bean
    public ExcluirOngUseCaseImpl excluirOngUseCaseImpl(
         ExcluirOngImpl excluirOngPorIdImpl
    ) {
        return new ExcluirOngUseCaseImpl(excluirOngPorIdImpl);
    }
}

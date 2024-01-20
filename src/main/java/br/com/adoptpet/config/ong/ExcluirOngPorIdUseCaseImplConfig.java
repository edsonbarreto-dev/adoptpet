package br.com.adoptpet.config.ong;

import br.com.adoptpet.core.usecase.ong.impl.ExcluirOngPorIdUseCaseImpl;
import br.com.adoptpet.dataprovider.ExcluirOngPorIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExcluirOngPorIdUseCaseImplConfig {
     @Bean
    public ExcluirOngPorIdUseCaseImpl excluirOngPorIdUseCaseImpl(
         ExcluirOngPorIdImpl excluirOngPorIdImpl
    ) {
        return new ExcluirOngPorIdUseCaseImpl(excluirOngPorIdImpl);
    }
}

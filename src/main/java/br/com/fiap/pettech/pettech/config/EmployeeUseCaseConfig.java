package br.com.fiap.pettech.pettech.config;

import br.com.fiap.pettech.pettech.core.usecase.impl.FindEmployeeByIdUseCaseImpl;
import com.arantes.cleanarch.core.usecase.impl.InsertCustomerUseCaseImpl;
import com.arantes.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.arantes.cleanarch.dataprovider.InsertCustomerImpl;
import com.arantes.cleanarch.dataprovider.SendCpfForValidationImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeUseCaseConfig {

    @Bean
    public FindEmployeeByIdUseCaseImpl employeeUseCase(String id) {
        return new FindEmployeeByIdUseCaseImpl(id);
    }

}

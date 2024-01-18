package br.com.fiap.pettech.pettech.dataprovider.repository;

import br.com.fiap.pettech.pettech.core.domain.dataprovider.funcionario.FindEmployeeById;
import br.com.fiap.pettech.pettech.core.domain.funcionario.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindEmployeeByIdImpl implements FindEmployeeById {

//    @Autowired
//    private EmployeeRepository employeeRepository;

    @Override
    public Optional<Funcionario> find(String id) {
//        var funcionarioEntity = employeeRepository.findById(id);
//        return funcionarioEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }

}

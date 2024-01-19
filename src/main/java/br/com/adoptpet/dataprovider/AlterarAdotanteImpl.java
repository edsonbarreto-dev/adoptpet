package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.funcionario.AlterarFuncionario;
import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.dataprovider.repository.AdotanteRepository;
import br.com.adoptpet.dataprovider.repository.mapper.AdotanteEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AlterarAdotanteImpl implements AlterarFuncionario {
    @Autowired
    private AdotanteRepository adotanteRepository;

    @Autowired
    private AdotanteEntityMapper adotanteEntityMapper;

    @Override
    public void update(Pessoa funcionario) {
        var adotanteEntity = adotanteEntityMapper.toAdotanteEntity(funcionario);
        adotanteRepository.save(adotanteEntity);
    }
}

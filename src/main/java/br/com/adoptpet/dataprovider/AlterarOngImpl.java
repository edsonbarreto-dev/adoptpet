package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.ong.AlterarOng;
import br.com.adoptpet.core.domain.ong.Ong;
import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.dataprovider.repository.OngRepository;
import br.com.adoptpet.dataprovider.repository.mapper.OngEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AlterarOngImpl implements AlterarOng {
    @Autowired
    private OngRepository ongRepository;

    @Autowired
    private OngEntityMapper ongEntityMapper;

    @Override
    public void update(Pessoa ong) {
        var ongEntity = ongEntityMapper.toOngEntity((Ong) ong);
        ongRepository.save(ongEntity);
    }
}

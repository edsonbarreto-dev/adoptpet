package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.ong.BuscarOngPorId;
import br.com.adoptpet.core.domain.ong.Ong;
import br.com.adoptpet.dataprovider.repository.OngRepository;
import br.com.adoptpet.dataprovider.repository.entity.AdotanteEntity;
import br.com.adoptpet.dataprovider.repository.entity.OngEntity;
import br.com.adoptpet.dataprovider.repository.mapper.OngEntityMapper;
import br.com.adoptpet.dataprovider.repository.vo.OngVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BuscarOngPorIdImpl implements BuscarOngPorId<OngVO> {
    @Autowired
    private OngRepository ongRepository;
    @Autowired
    private OngEntityMapper ongEntityMapper;
    @Override
    public OngVO find(Long id) {
        OngEntity ongEntity = ongRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Adotante não encontrado"));

        return ongEntityMapper.toOngVO(ongEntity);
    }
}

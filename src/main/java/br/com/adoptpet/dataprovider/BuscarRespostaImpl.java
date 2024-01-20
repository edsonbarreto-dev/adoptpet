package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.resposta.BuscarResposta;
import br.com.adoptpet.core.domain.resposta.Resposta;
import br.com.adoptpet.dataprovider.repository.RespostaRepository;
import br.com.adoptpet.dataprovider.repository.entity.RespostaEntity;
import br.com.adoptpet.dataprovider.repository.mapper.RespostaEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BuscarRespostaImpl implements BuscarResposta {
    @Autowired
    private RespostaRepository repository;
    @Autowired
    private RespostaEntityMapper mapper;

    @Override
    public Resposta findBy(Resposta resposta) {
        RespostaEntity entity = repository.findBy(resposta);
        return mapper.toResposta(entity);
    }

    @Override
    public Resposta findByNumero(Long numero) {
        RespostaEntity entity = repository.findByNumero(numero);
        return mapper.toResposta(entity);
    }
}

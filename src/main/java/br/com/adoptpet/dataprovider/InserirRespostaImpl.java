package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.resposta.InserirResposta;
import br.com.adoptpet.core.domain.resposta.Resposta;
import br.com.adoptpet.dataprovider.repository.RespostaRepository;
import br.com.adoptpet.dataprovider.repository.mapper.RespostaEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InserirRespostaImpl implements InserirResposta {
    @Autowired
    private RespostaRepository respostaRepository;
    @Autowired
    private RespostaEntityMapper respostaEntityMapper;
    @Override
    public void insert(Resposta resposta) {
        var respostaEntity = respostaEntityMapper.toRespostaEntity(resposta);
        respostaRepository.save(respostaEntity);
    }
}

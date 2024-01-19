package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.solicitacao.AlterarResposta;
import br.com.adoptpet.core.domain.solicitacao.Resposta;
import br.com.adoptpet.dataprovider.repository.RespostaRepository;
import br.com.adoptpet.dataprovider.repository.mapper.RespostaEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AlterarRespostaImpl implements AlterarResposta {
    @Autowired
    private RespostaRepository respostaRepository;
    @Autowired
    private RespostaEntityMapper respostaEntityMapper;
    @Override
    public void update(Resposta resposta) {
        var resopostaEntity = respostaEntityMapper.toRespostaEntity(resposta);
        respostaRepository.save(resopostaEntity);
    }
}

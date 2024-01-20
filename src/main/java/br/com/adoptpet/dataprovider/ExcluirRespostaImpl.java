package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.resposta.ExcluirResposta;
import br.com.adoptpet.core.domain.resposta.Resposta;
import br.com.adoptpet.dataprovider.repository.RespostaRepository;
import br.com.adoptpet.dataprovider.repository.entity.RespostaEntity;
import br.com.adoptpet.dataprovider.repository.mapper.RespostaEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExcluirRespostaImpl implements ExcluirResposta {

    @Autowired
    private RespostaRepository respostaRepository;

    @Autowired
    private RespostaEntityMapper respostaEntityMapper;

    @Override
    public void delete(Resposta resposta) {
        RespostaEntity respostaEntity = respostaEntityMapper.toRespostaEntity(resposta);
        respostaRepository.delete(respostaEntity);
    }

    @Override
    public void deleteByNumero(Long numero) {
        RespostaEntity entity = respostaRepository.findByNumero(numero);
        respostaRepository.delete(entity);
    }
}

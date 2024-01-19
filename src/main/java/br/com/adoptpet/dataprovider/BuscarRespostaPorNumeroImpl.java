package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.solicitacao.BuscarRespostaPorNumero;
import br.com.adoptpet.core.domain.solicitacao.Resposta;
import br.com.adoptpet.dataprovider.repository.RespostaRepository;
import br.com.adoptpet.dataprovider.repository.entity.RespostaEntity;
import br.com.adoptpet.dataprovider.repository.mapper.RespostaEntityMapper;
import br.com.adoptpet.dataprovider.repository.vo.RespostaVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BuscarRespostaPorNumeroImpl implements BuscarRespostaPorNumero<RespostaVO> {
    @Autowired
    private RespostaRepository respostaRepository;
    @Autowired
    private RespostaEntityMapper respostaEntityMapper;
    @Override
    public RespostaVO find(Long id) {
        RespostaEntity respostaEntity = respostaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Resposta não encontrada"));

        return respostaEntityMapper.toRespostaVO(respostaEntity);
    }
}

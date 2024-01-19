package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.solicitacao.BuscarSolicitacaoPorNumero;
import br.com.adoptpet.core.domain.solicitacao.Solicitacao;
import br.com.adoptpet.dataprovider.repository.SolicitacaoRepository;
import br.com.adoptpet.dataprovider.repository.entity.OngEntity;
import br.com.adoptpet.dataprovider.repository.entity.SolicitacaoEntity;
import br.com.adoptpet.dataprovider.repository.mapper.SolicitacaoEntityMapper;
import br.com.adoptpet.dataprovider.repository.vo.SolicitacaoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BuscarSolicitacaoPorNumeroImpl implements BuscarSolicitacaoPorNumero<SolicitacaoVO> {
    @Autowired
    private SolicitacaoRepository solicitacaoRepository;
    @Autowired
    private SolicitacaoEntityMapper solicitacaoEntityMapper;
    @Override
    public SolicitacaoVO find(Long id) {
        SolicitacaoEntity solicitacaoEntity = solicitacaoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Solicitação não encontrada"));

        return solicitacaoEntityMapper.toSolicitacaoVO(solicitacaoEntity);
    }
}

package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.solicitacao_adocao.InserirSolicitacaoAdocao;
import br.com.adoptpet.core.domain.solicitacao_adocao.Solicitacao;
import br.com.adoptpet.dataprovider.repository.SolicitacaoAdocaoRepository;
import br.com.adoptpet.dataprovider.repository.mapper.SolicitacaoAdocaoEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InserirSolicitacaoImpl implements InserirSolicitacaoAdocao {
    @Autowired
    private SolicitacaoAdocaoRepository solicitacaoRepository;
    @Autowired
    private SolicitacaoAdocaoEntityMapper solicitacaoEntityMapper;
    @Override
    public void insert(Solicitacao solicitacao) {
        var solicitacaoEntity = solicitacaoEntityMapper.toSolicitacaoEntity(solicitacao);
        solicitacaoRepository.save(solicitacaoEntity);
    }
}

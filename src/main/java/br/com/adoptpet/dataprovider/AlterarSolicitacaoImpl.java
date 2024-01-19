package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.solicitacao.AlterarSolicitacao;
import br.com.adoptpet.core.domain.solicitacao.Solicitacao;
import br.com.adoptpet.dataprovider.repository.SolicitacaoRepository;
import br.com.adoptpet.dataprovider.repository.mapper.SolicitacaoEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AlterarSolicitacaoImpl implements AlterarSolicitacao {
    @Autowired
    private SolicitacaoRepository solicitacaoRepository;
    @Autowired
    private SolicitacaoEntityMapper solicitacaoEntityMapper;
    @Override
    public void update(Solicitacao solicitacao) {
        var solicitacaoEntity = solicitacaoEntityMapper.toSolicitacaoEntity(solicitacao);
        solicitacaoRepository.save(solicitacaoEntity);
    }
}

package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.solicitacao_adocao.BuscarSolicitacaoAdocao;
import br.com.adoptpet.core.domain.solicitacao_adocao.Solicitacao;
import br.com.adoptpet.dataprovider.repository.SolicitacaoAdocaoRepository;
import br.com.adoptpet.dataprovider.repository.entity.SolicitacaoAdocaoEntity;
import br.com.adoptpet.dataprovider.repository.mapper.SolicitacaoAdocaoEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BuscarSolicitacaoImpl implements BuscarSolicitacaoAdocao {
    @Autowired
    private SolicitacaoAdocaoRepository repository;
    @Autowired
    private SolicitacaoAdocaoEntityMapper mapper;

    @Override
    public Solicitacao find(Solicitacao solicitacao) {
        SolicitacaoAdocaoEntity entity = repository.findBySolicitacao(solicitacao);
        return mapper.toSolicitacao(entity);
    }

    @Override
    public Solicitacao findByNumero(Long numero) {
        SolicitacaoAdocaoEntity entity = repository.findByNumero(numero);
        return mapper.toSolicitacao(entity);
    }
}

package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.solicitacao.BuscarSolicitacao;
import br.com.adoptpet.core.domain.solicitacao.Solicitacao;
import br.com.adoptpet.dataprovider.repository.SolicitacaoRepository;
import br.com.adoptpet.dataprovider.repository.entity.SolicitacaoEntity;
import br.com.adoptpet.dataprovider.repository.mapper.SolicitacaoEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BuscarSolicitacaoImpl implements BuscarSolicitacao {
    @Autowired
    private SolicitacaoRepository repository;
    @Autowired
    private SolicitacaoEntityMapper mapper;

    @Override
    public Solicitacao find(Solicitacao solicitacao) {
        SolicitacaoEntity entity = repository.findBySolicitacao(solicitacao);
        return mapper.toSolicitacao(entity);
    }

    @Override
    public Solicitacao findByNumero(Long numero) {
        SolicitacaoEntity entity = repository.findByNumero(numero);
        return mapper.toSolicitacao(entity);
    }
}

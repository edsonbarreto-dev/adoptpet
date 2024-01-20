package br.com.adoptpet.dataprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.adoptpet.core.domain.solicitacao.Solicitacao;
import br.com.adoptpet.core.dataprovider.solicitacao.ExcluirSolicitacao;
import br.com.adoptpet.dataprovider.repository.SolicitacaoRepository;
import br.com.adoptpet.dataprovider.repository.entity.SolicitacaoEntity;
import br.com.adoptpet.dataprovider.repository.mapper.SolicitacaoEntityMapper;

@Component
public class ExcluirSolicitacaoImpl implements ExcluirSolicitacao {

    @Autowired
    private SolicitacaoRepository repository;

    @Autowired
    private SolicitacaoEntityMapper mapper;

    @Override
    public void delete(Solicitacao solicitacao) {
        SolicitacaoEntity solicitacaoEntity = mapper.toSolicitacaoEntity(solicitacao);
        repository.delete(solicitacaoEntity);
    }

    @Override
    public void deleteByNumero(Long numero) {
        repository.deleteByNumero(numero);
    }
}

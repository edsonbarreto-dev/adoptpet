package br.com.adoptpet.dataprovider;

import br.com.adoptpet.dataprovider.repository.entity.SolicitacaoAdocaoEntity;
import br.com.adoptpet.dataprovider.repository.mapper.SolicitacaoAdocaoEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.adoptpet.core.domain.solicitacao_adocao.Solicitacao;
import br.com.adoptpet.core.dataprovider.solicitacao_adocao.ExcluirSolicitacaoAdocao;
import br.com.adoptpet.dataprovider.repository.SolicitacaoAdocaoRepository;

@Component
public class ExcluirSolicitacaoImpl implements ExcluirSolicitacaoAdocao {

    @Autowired
    private SolicitacaoAdocaoRepository repository;

    @Autowired
    private SolicitacaoAdocaoEntityMapper mapper;

    @Override
    public void delete(Solicitacao solicitacao) {
        SolicitacaoAdocaoEntity solicitacaoEntity = mapper.toSolicitacaoEntity(solicitacao);
        repository.delete(solicitacaoEntity);
    }

    @Override
    public void deleteByNumero(Long numero) {
        repository.deleteByNumero(numero);
    }
}

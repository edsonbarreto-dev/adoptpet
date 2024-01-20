package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.solicitacao.BuscarSolicitacao;
import br.com.adoptpet.core.domain.solicitacao.Solicitacao;
import br.com.adoptpet.dataprovider.repository.SolicitacaoRepository;
import br.com.adoptpet.dataprovider.repository.entity.SolicitacaoEntity;
import br.com.adoptpet.dataprovider.repository.mapper.SolicitacaoEntityMapper;
import br.com.adoptpet.dataprovider.repository.vo.SolicitacaoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BuscarSolicitacaoImpl implements BuscarSolicitacao {
    @Autowired
    private SolicitacaoRepository repository;
    @Autowired
    private SolicitacaoEntityMapper mapper;

    @Override
    public Solicitacao find(Solicitacao solicitacao) {
        repository.findBy(solicitacao);
    }

    @Override
    public Solicitacao findByNumero(Long numero) {
        return repository.findByNumero(numero);
    }
}

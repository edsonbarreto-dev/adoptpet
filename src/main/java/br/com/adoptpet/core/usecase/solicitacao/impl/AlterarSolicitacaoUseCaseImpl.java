package br.com.adoptpet.core.usecase.solicitacao.impl;

import br.com.adoptpet.core.dataprovider.solicitacao.AlterarSolicitacao;
import br.com.adoptpet.core.domain.solicitacao.Solicitacao;
import br.com.adoptpet.core.usecase.solicitacao.AlterarSolicitacaoUseCase;
import br.com.adoptpet.core.usecase.solicitacao.BuscarSolicitacaoPorNumeroUseCase;
import br.com.adoptpet.dataprovider.repository.entity.SolicitacaoEntity;
import br.com.adoptpet.dataprovider.repository.mapper.SolicitacaoEntityMapper;

public class AlterarSolicitacaoUseCaseImpl implements AlterarSolicitacaoUseCase {

    private final BuscarSolicitacaoPorNumeroUseCase<SolicitacaoEntity> buscarSolicitacaoPorNumeroUseCase;

    private final SolicitacaoEntityMapper solicitacaoEntityMapper;

    private final AlterarSolicitacao alterarSolicitacao;
    public AlterarSolicitacaoUseCaseImpl(
            BuscarSolicitacaoPorNumeroUseCase buscarSolicitacaoPorNumeroUseCase,
            AlterarSolicitacao solicitacao,
            SolicitacaoEntityMapper solicitacaoEntityMapper
    ) {
        this.buscarSolicitacaoPorNumeroUseCase = buscarSolicitacaoPorNumeroUseCase;
        this.alterarSolicitacao = solicitacao;
    }

    @Override
    public void update(Solicitacao solicitacao) {
        SolicitacaoEntity entity = buscarSolicitacaoPorNumeroUseCase.findByNumero(solicitacao.getNumeroSolicitacao());
        SolicitacaoEntityMapper
        alterarSolicitacao.update(entity);
    }
}

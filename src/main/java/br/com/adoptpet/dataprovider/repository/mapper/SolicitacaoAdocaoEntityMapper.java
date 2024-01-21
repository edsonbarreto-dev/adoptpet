package br.com.adoptpet.dataprovider.repository.mapper;

import br.com.adoptpet.core.domain.solicitacao_adocao.Solicitacao;
import br.com.adoptpet.dataprovider.repository.entity.SolicitacaoAdocaoEntity;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SolicitacaoAdocaoEntityMapper {
    Solicitacao toSolicitacao(SolicitacaoAdocaoEntity entity);
    SolicitacaoAdocaoEntity toSolicitacaoEntity(Solicitacao solicitacao);
}

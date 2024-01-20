package br.com.adoptpet.dataprovider.repository.mapper;

import br.com.adoptpet.core.domain.solicitacao.Solicitacao;
import br.com.adoptpet.dataprovider.repository.entity.SolicitacaoEntity;
import br.com.adoptpet.dataprovider.repository.vo.SolicitacaoVO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SolicitacaoEntityMapper {
    SolicitacaoVO toSolicitacaoVO(SolicitacaoEntity solicitacaoEntity);
    SolicitacaoEntity toSolicitacaoEntity(SolicitacaoVO solicitacaoVO);
}

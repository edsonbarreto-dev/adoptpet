package br.com.adoptpet.dataprovider.repository.mapper;

import br.com.adoptpet.core.domain.solicitacao.Solicitacao;
import br.com.adoptpet.dataprovider.repository.entity.SolicitacaoEntity;
import br.com.adoptpet.dataprovider.repository.vo.SolicitacaoVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SolicitacaoEntityMapper {
    SolicitacaoVO toSolicitacaoVO(SolicitacaoEntity solicitacaoEntity);
    SolicitacaoEntity toSolicitacaoEntity(Solicitacao solicitacao);
}

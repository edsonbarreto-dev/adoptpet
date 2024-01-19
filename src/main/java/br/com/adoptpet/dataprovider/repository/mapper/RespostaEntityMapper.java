package br.com.adoptpet.dataprovider.repository.mapper;

import br.com.adoptpet.core.domain.solicitacao.Resposta;
import br.com.adoptpet.dataprovider.repository.entity.RespostaEntity;
import br.com.adoptpet.dataprovider.repository.vo.RespostaVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RespostaEntityMapper {
    RespostaVO toRespostaVO(RespostaEntity respostaEntity);
    RespostaEntity toRespostaEntity(Resposta resposta);
}

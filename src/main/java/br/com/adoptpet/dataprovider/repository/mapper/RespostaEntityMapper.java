package br.com.adoptpet.dataprovider.repository.mapper;

import br.com.adoptpet.core.domain.resposta.Resposta;
import br.com.adoptpet.dataprovider.repository.entity.RespostaEntity;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RespostaEntityMapper {
    Resposta toResposta(RespostaEntity respostaEntity);
    RespostaEntity toRespostaEntity(br.com.adoptpet.core.domain.resposta.Resposta resposta);
}

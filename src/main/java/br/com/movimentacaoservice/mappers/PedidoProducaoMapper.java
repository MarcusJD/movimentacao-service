package br.com.movimentacaoservice.mappers;

import br.com.movimentacaoservice.dto.PedidoProducaoDTO;
import br.com.movimentacaoservice.model.PedidoProducaoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PedidoProducaoMapper extends MainMapper<PedidoProducaoEntity, PedidoProducaoDTO> {
    
	PedidoProducaoMapper INSTANCE = Mappers.getMapper(PedidoProducaoMapper.class);
	
    @Mapping(source = "status.id", target = "status")
    PedidoProducaoDTO entityToDto(PedidoProducaoEntity entity);
   
    @Mapping(source = "status", target = "status.id")
    PedidoProducaoEntity dtoToEntity(PedidoProducaoDTO entity);
}
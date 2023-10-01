package br.com.movimentacaoservice.infra.mqueue;

import java.io.IOException;
import java.math.BigInteger;
import java.time.LocalDate;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;


import br.com.movimentacaoservice.dto.PedidoProducaoDTO;
import br.com.movimentacaoservice.mappers.PedidoProducaoMapper;
import br.com.movimentacaoservice.model.PedidoProducaoEntity;
import br.com.movimentacaoservice.repository.PedidoProducaoRepository;

@Component
public class PedidoProducaoSubscriber {
	
	@Autowired
    private PedidoProducaoRepository pedidoProducaoRepository;
	
	@RabbitListener(queues = "${mq.queues.create-pedido-producao}")
	public HttpStatus savePedidoProducao(@Payload PedidoProducaoDTO pedidoProducaoDTO) throws IOException {
		try {
			pedidoProducaoDTO.setStatus(new BigInteger("0"));
			pedidoProducaoDTO.setDataPedido(LocalDate.now());
	        PedidoProducaoEntity entity = PedidoProducaoMapper.INSTANCE.dtoToEntity(pedidoProducaoDTO);
	        pedidoProducaoRepository.save(entity);     
	        return HttpStatus.CREATED;
		}catch(Exception e) {
			e.printStackTrace();
	        return HttpStatus.INTERNAL_SERVER_ERROR;
		}

	}

}

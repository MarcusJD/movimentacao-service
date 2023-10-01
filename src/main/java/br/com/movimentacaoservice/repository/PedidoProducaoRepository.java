package br.com.movimentacaoservice.repository;

import br.com.movimentacaoservice.model.PedidoProducaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface PedidoProducaoRepository extends JpaRepository<PedidoProducaoEntity, BigInteger> {
}

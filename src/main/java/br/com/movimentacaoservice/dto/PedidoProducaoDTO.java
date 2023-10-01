package br.com.movimentacaoservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PedidoProducaoDTO {

    private BigInteger id;
    private BigInteger codigoProduto;
    private BigInteger status;
    private BigInteger qtdSolicitada;
    private LocalDate dataPedido;
    private LocalDate dataEntrega;
}
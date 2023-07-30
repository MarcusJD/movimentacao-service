package br.com.movimentacaoservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "TB_PEDIDO_PRODUCAO")
public class PedidoProducaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private BigInteger id;

    @Column(name = "COD_PRODUTO", nullable = false)
    private BigInteger codigoProduto;

    @ManyToOne
    @JoinColumn(name = "ID_STATUS", nullable = false)
    private StatusProducaoEntity status;

    @Column(name = "QTD_SOLICITADA", nullable = false)
    private BigInteger qtdSolicitada;

    @Column(name = "DATA_PEDIDO", nullable = false)
    private LocalDate dataPedido;

    @Column(name = "DATA_ENTREGA")
    private LocalDate dataEntrega;

}

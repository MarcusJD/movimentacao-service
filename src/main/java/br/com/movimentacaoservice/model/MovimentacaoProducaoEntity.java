package br.com.movimentacaoservice.model;

import java.math.BigInteger;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "TB_MOVIMENTACAO_PRODUCAO")
public class MovimentacaoProducaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private BigInteger id;
    
    @Column(name = "COD_MAT_PRIMA")
    private BigInteger codMateriaPrima;
    
    @ManyToOne
    @JoinColumn(name = "ID_TIPO_MOVIMENTACAO")
    private TipoMovimentacaoEntity tipoMovimentacao;
    
    @Column(name = "QTD_ATENDIDA")
    private BigInteger qtdAtendida;
    
    @Column(name = "QTD_UTILIZADA_MAT_PRIMA")
    private BigInteger qtdUtilizadaMatPrima;
    
    @Column(name = "QTD_PERDIDA_PRODUTO")
    private BigInteger qtdPerdidaProduto;
    
    @Column(name = "QTD_PERDIDA_MAT_PRIMA")
    private BigInteger qtdPerdidaMatPrima;
    
    @Column(name = "DATA_MOVIMENTACAO")
    private LocalDate dataMovimentacao; 
    
}
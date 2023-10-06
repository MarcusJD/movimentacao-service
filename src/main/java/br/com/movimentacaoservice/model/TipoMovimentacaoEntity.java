package br.com.movimentacaoservice.model;

import java.math.BigInteger;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name = "TB_TIPO_MOVIMENTACAO")
public class TipoMovimentacaoEntity {
	
    @Id
    @Column(name = "ID")
    private BigInteger id;

    @Column(name = "DESCRICAO")
    private String descricao;

}

package br.com.movimentacaoservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "TB_STATUS_PRODUCAO")
public class StatusProducaoEntity {

    @Id
    @Column(name = "ID")
    private BigInteger id;

    @Column(name = "DESCRICAO")
    private String descricao;

}
CREATE TABLE IF NOT EXISTS TB_TIPO_MOVIMENTACAO
(
    ID BIGINT NOT NULL,
    DESCRICAO VARCHAR(100) NOT NULL,
    PRIMARY KEY (ID)
);

CREATE TABLE IF NOT EXISTS TB_STATUS_PRODUCAO
(
    ID BIGINT NOT NULL,
    DESCRICAO VARCHAR(100) NOT NULL,
    PRIMARY KEY (ID)
);

CREATE TABLE IF NOT EXISTS TB_PEDIDO_PRODUCAO
(
    ID BIGINT NOT NULL AUTO_INCREMENT,
    COD_PRODUTO BIGINT NOT NULL,
    ID_STATUS BIGINT NOT NULL,
    QTD_SOLICITADA BIGINT NOT NULL,
    DATA_PEDIDO DATE NOT NULL,
    DATA_ENTREGA DATE,
    PRIMARY KEY (ID),
    CONSTRAINT FK_STATUS_PEDIDO_PRODUCAO FOREIGN KEY (ID_STATUS) REFERENCES TB_STATUS_PRODUCAO(ID)
);

CREATE TABLE IF NOT EXISTS TB_MOVIMENTACAO_PRODUCAO
(
    ID BIGINT NOT NULL AUTO_INCREMENT,
    COD_MAT_PRIMA BIGINT NOT NULL,
    ID_PEDIDO_PRODUCAO BIGINT NOT NULL,
    ID_TIPO_MOVIMENTACAO BIGINT NOT NULL,
    QTD_ATENDIDA BIGINT NOT NULL,
    QTD_UTILIZADA_MAT_PRIMA BIGINT NOT NULL,
    QTD_PERDIDA_PRODUTO BIGINT,
    QTD_PERDIDA_MAT_PRIMA BIGINT,
    DATA_MOVIMENTACAO DATE NOT NULL,
    PRIMARY KEY (ID),
    CONSTRAINT FK_MOVIMENTO_PRODUCAO_TIPO FOREIGN KEY (ID_TIPO_MOVIMENTACAO) REFERENCES TB_TIPO_MOVIMENTACAO(ID),
    CONSTRAINT FK_MOVIMENTO_PRODUCAO_PEDIDO FOREIGN KEY (ID_PEDIDO_PRODUCAO) REFERENCES TB_PEDIDO_PRODUCAO(ID)
);
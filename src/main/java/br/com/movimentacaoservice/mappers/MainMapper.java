package br.com.movimentacaoservice.mappers;

public interface MainMapper<E,D> {
    D entityToDto(E entity);
    E dtoToEntity(D dto);
}
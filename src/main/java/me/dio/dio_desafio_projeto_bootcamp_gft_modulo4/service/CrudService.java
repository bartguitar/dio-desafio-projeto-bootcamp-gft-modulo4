package me.dio.dio_desafio_projeto_bootcamp_gft_modulo4.service;

import java.util.List;

public interface CrudService<ID, T> {
    List<T> findAll();
    T findById(ID id);
    T create(T entity);
    T update(ID id, T entity);
    void delete(ID id);
}
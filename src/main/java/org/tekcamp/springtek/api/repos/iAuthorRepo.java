package org.tekcamp.springtek.api.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.tekcamp.springtek.api.entities.Author;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface iAuthorRepo extends CrudRepository<Author, Integer> {

    @Override
    Iterable<Author> findAll();

    @Override
    Optional<Author> findById(Integer integer);

    @Override
    <S extends Author> Iterable<S> saveAll(Iterable<S> iterable);

    @Override
    Author save (Author author);

    @Override
    long count();

    @Override
    void deleteById(Integer integer);
}
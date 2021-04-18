package org.tekcamp.springtek.api.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.tekcamp.springtek.api.entities.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface iBookRepo extends CrudRepository<Book, Integer> {

    @Override
    Iterable<Book> findAll();

    @Override
    Optional<Book> findById(Integer integer);

    @Override
    <S extends Book> Iterable<S> saveAll(Iterable<S> iterable);

    @Override
    Book save (Book book);

    @Override
    long count();

    @Override
    void deleteById(Integer integer);
}

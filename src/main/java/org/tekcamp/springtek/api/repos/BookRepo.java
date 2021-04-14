package org.tekcamp.springtek.api.repos;

import org.springframework.stereotype.Repository;
import org.tekcamp.springtek.api.entities.Book;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepo {

    private List<Book> books = new ArrayList<>();

    public List<Book> findAllBooks() {
        return this.books;
    }

    public Book createBook(Book newBook) {
        books.add(newBook);
        return books.get(books.size()-1);
    }
}

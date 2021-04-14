package org.tekcamp.springtek.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tekcamp.springtek.api.entities.Book;
import org.tekcamp.springtek.api.repos.BookRepo;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepo bookRepo;

    public List<Book> findAllBooks() {
        return bookRepo.findAllBooks();
    }

    public Book createBook(Book newBook) {
        return bookRepo.createBook(newBook);
    }

    public Book getBookByIsbn(String isbn) {
        return bookRepo.getBookByIsbn(isbn);
    }

    public Book getBookByTitle(String title) {
        return bookRepo.getBookByTitle(title);
    }
}
